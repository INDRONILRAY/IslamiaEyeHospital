package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webView = (WebView) findViewById(R.id.webView7);
        webView.loadData(getString(R.string.low), "text/html; charset=utf-8", "utf-8");

        WebView webView7 = (WebView) findViewById(R.id.webView8);
        webView7.loadData(getString(R.string.low1), "text/html; charset=utf-8", "utf-8");
    }
}
