package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class RetinaActivity extends AppCompatActivity {

    String nam = "Dr. Mostafizur Rahman";
    String nam2 = "Dr. Nahar";
    String nam3 = "Dr. Sanjoy Kumer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retina);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.ratina1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RetinaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/mustafizur.html");
                i.putExtra("res",R.drawable.do8);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.ratina2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RetinaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/nahar.html");
                i.putExtra("res",R.drawable.do22);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.ratina3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RetinaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/sanjoy.html");
                i.putExtra("res",R.drawable.do23);
                startActivity(i);
            }
        });
        WebView webView = (WebView) findViewById(R.id.webView7);
        webView.loadData(getString(R.string.retina), "text/html; charset=utf-8", "utf-8");
    }
}
