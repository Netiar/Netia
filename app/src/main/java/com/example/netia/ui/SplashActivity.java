package com.example.netia.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.netia.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        YoYo.with(Techniques.Tada)
                .duration(2000)
                .repeat(5)
                .playOn(findViewById(R.id.textView));

    }
}