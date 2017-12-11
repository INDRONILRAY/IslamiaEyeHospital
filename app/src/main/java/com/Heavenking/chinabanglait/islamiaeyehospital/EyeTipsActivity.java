package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class EyeTipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_tips);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.loadData(getString(R.string.eyetips), "text/html; charset=utf-8", "utf-8");
        WebView webView2 = (WebView) findViewById(R.id.webView2);
        webView2.loadData(getString(R.string.eyetips3), "text/html; charset=utf-8", "utf-8");

    }
}
