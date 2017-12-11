package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class AnstesiaActivity extends AppCompatActivity {


    String nam = "Dr. Md. A. Maleque";
    String nam2 = "Dr. Shahida Banu";
    String nam3 = "Dr. Syed Azahar Ali";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anstesia);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView id1 = (ImageView) findViewById(R.id.imageView5);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnstesiaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("res",R.drawable.doc1);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/nazmun_nahar.html");
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView6);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnstesiaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/nodata.html");
                i.putExtra("res",R.drawable.do28);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.imageView7);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnstesiaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/nodata.html");
                i.putExtra("res",R.drawable.docazhar);
                startActivity(i);
            }
        });
        WebView webView = (WebView) findViewById(R.id.webView2);
        webView.loadData(getString(R.string.anastesia), "text/html; charset=utf-8", "utf-8");
        WebView webView3 = (WebView) findViewById(R.id.webView3);
        webView3.loadData(getString(R.string.anastesia2), "text/html; charset=utf-8", "utf-8");
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
