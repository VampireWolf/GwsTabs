package com.orange.gwstabs;

/**
 * Created by a on 30/11/15.
 */

import android.app.Application;


import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "wvMW4sV4khsdxV9fPA1HoE7h80e8kj1eEddPJFv1", "KCaJTjBumZeRtnuHax4GIjCi18a4qxvyyOE4tbj1");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        }
}
