package com.example.weatherupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WorldActivity extends AppCompatActivity {

    WebView world;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);

        world=(WebView)findViewById(R.id.world_web);
        WebSettings webSettings=world.getSettings();

        world.loadUrl("https://worldweather.wmo.int/en/home.html/");
        webSettings.setJavaScriptEnabled(true);
    }
}
