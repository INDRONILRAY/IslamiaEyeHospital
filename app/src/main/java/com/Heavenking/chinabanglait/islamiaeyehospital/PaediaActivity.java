package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class PaediaActivity extends AppCompatActivity {

    String nam = "Dr. Mastura";
    String nam2 = "Dr.Md Mostafa";
    String nam3 = "Dr Quazi Sazzad Iftekhar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paedia);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.imageView1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaediaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/mastura.html");
                i.putExtra("res",R.drawable.do19);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaediaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/mustafa.html");
                i.putExtra("res",R.drawable.do20);
                startActivity(i);
            }
        });

        final ImageView zxcv = (ImageView) findViewById(R.id.zxcv);
        zxcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaediaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/mostafa.html");
                i.putExtra("res",R.drawable.do21);
                startActivity(i);
            }
        });

        WebView webView = (WebView) findViewById(R.id.webView7);
        webView.loadData(getString(R.string.paedia), "text/html; charset=utf-8", "utf-8");
    }
}
