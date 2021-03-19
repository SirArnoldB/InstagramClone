package com.codepath.abhebhe.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("sWz78ZLSD0nyWSUma8uGu4rCGvrBsjRqg0pqPOBL")
                .clientKey("5SzshRmuwnC4qC9zNcQLTLjnNlD1wZae9lHQxt8I")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
