package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PmbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmb);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        WebView webView = (WebView) findViewById(R.id.pmb);
        webView.loadData(getString(R.string.patho), "text/html; charset=utf-8", "utf-8");
    }
}
