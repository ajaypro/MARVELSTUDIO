package com.ajay.marvel.database;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author Created by AjayDeepak on 08/09/2018.
 */

public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    public static void main(String[] args) throws SQLException, IOException {
        // Provide the name of .txt file which created and kept in res/raw directory
        writeConfigFile(new File("app/src/main/res/raw/ormlite_config.txt"));
    }

}
