package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class NeuroPActivity extends AppCompatActivity {

    String nam2 = "Professor Dr. Nazmun Nahar";
    String nam3 = "Dr. Sibgatullah";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neuro_p);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView id2 = (ImageView) findViewById(R.id.imageView1);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NeuroPActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/nazmun_nahar.html");
                i.putExtra("res",R.drawable.do10);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.imageView2);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NeuroPActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/singbatul.html");
                i.putExtra("res",R.drawable.do15);
                startActivity(i);
            }
        });

        WebView webView = (WebView) findViewById(R.id.webView7);
        webView.loadData(getString(R.string.neuro_p), "text/html; charset=utf-8", "utf-8");
    }
}
