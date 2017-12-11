package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class CorneaActivity extends AppCompatActivity {


    String nam = "Prof. Dr.Sarwar Alam";
    String nam2 = "Dr. Md Shafi Khan";
    String nam3 = "Dr. Mahmood Mujtaba";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cornea);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.imageView1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CorneaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/sarwar.html");
                i.putExtra("res",R.drawable.do11);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CorneaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/shafikhan.html");
                i.putExtra("res",R.drawable.doc2);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.imageView3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CorneaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/mujtaba.html");
                i.putExtra("res",R.drawable.do7);
                startActivity(i);
            }
        });
        WebView webView = (WebView) findViewById(R.id.webView5);
        webView.loadData(getString(R.string.cornea), "text/html; charset=utf-8", "utf-8");
    }
}
