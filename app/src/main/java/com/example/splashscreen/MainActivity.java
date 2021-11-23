package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * This Activity creates a SplashScreen.
 * After a certain time the SplashScreen ends and this Activity leads to the following OrderActivity.
 *
 * Layout File: activity_main.xml
 *
 * @author Lukas Plenk
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The method shows the Activity for a specific amount of time.
     * This is achieved by using a Handler which postpones every action for the int splashScreenTime.
     * After this time the method calls an Intent to the OrderActivity and finishes itself.
     * @param savedInstanceState is a standard parameter.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The SplashScreen should be visible in full screen
        getSupportActionBar().hide();

        // Time where the SplashScreen is shown in milliseconds
        int splashScreenTime = 4000;

        new Handler().postDelayed(new Runnable() {
            public void run() {

               Intent intent = new Intent(MainActivity.this, OrderActivity.class);
               startActivity(intent);

               finish();
            }
        }, splashScreenTime);
    }
}