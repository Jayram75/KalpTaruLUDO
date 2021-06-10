package com.jayram.kalptaruludo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView wv = new WebView(this);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.clearCache(true);
        wv.clearView();
        wv.reload();
        wv.loadUrl("about:blank");
        wv.loadUrl("file:///android_asset/quote.html");
        setContentView(wv);
    }
}