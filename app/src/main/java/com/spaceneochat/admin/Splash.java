package com.spaceneochat.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.spaceneochat.R;
import com.spaceneochat.screens.Home;
import com.spaceneochat.utilities.Constants;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.splash);

        new Handler().postDelayed(() -> {
            // Check if the user is signed in
            Class<?> targetActivity = isUserSignedIn() ? Home.class : SignIn.class;
            startActivity(new Intent(Splash.this, targetActivity));
            finish();
        }, SPLASH_SCREEN_TIME_OUT);
    }

    private boolean isUserSignedIn() {
        // Check the user's sign-in status using SharedPreferences
        SharedPreferences preferences = getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return preferences.getBoolean(Constants.KEY_IS_SIGNED_IN, false);
    }
}
