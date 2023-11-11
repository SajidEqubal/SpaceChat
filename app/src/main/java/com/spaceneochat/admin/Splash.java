package com.spaceneochat.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.spaceneochat.R;

public class Splash extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, SignIn.class);
                startActivity(intent);
                finish();
            }
            //Test my git repo
        },SPLASH_SCREEN_TIME_OUT);
    }
}