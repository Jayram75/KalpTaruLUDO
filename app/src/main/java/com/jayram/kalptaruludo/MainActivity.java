package com.jayram.kalptaruludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView wv = new WebView(this);
        wv.loadUrl("file:///android_asset/Ludo.html");
        wv.getSettings().setJavaScriptEnabled(true);
        setContentView(wv);
    }
}