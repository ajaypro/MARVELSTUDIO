package com.ajay.marvel.character.search;

import com.ajay.marvel.domain.client.MarvelApi;
import com.ajay.marvel.domain.model.CharactersResponse;
import com.ajay.marvel.util.HashGenerator;
import com.ajay.marvel.util.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.SingleSubject;


/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

@Search
class SearchInteractorImpl implements SearchInteractor {

    private MarvelApi api;
    private SchedulerProvider scheduler;

    private SingleSubject<CharactersResponse> characterSubject;
    private Disposable characterSubscription;

    @Inject
    SearchInteractorImpl(MarvelApi api, SchedulerProvider scheduler) {
        this.api = api;
        this.scheduler = scheduler;
    }

    @Override
    public Single<CharactersResponse> loadCharacter(String query,
                                                    String privateKey,
                                                    String publicKey,
                                                    long timestamp) {
        if (characterSubscription == null || characterSubscription.isDisposed()) {
            characterSubject = SingleSubject.create();

            // generate hash using timestamp and API keys
            String hash = HashGenerator.generate(timestamp, privateKey, publicKey);

            characterSubscription = api.getCharacters(query, publicKey, hash, timestamp)
                    .subscribeOn(scheduler.backgroundThread())
                    .subscribe(characterSubject::onSuccess);
        }

        return characterSubject.hide();
    }


    @Override
    public void unbind() {
        if (characterSubscription != null && !characterSubscription.isDisposed())
            characterSubscription.dispose();
    }
}
