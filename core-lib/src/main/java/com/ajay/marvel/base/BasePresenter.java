package com.ajay.marvel.base;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public interface BasePresenter<T> {

    void bind(T view);

    void unbind();

}
