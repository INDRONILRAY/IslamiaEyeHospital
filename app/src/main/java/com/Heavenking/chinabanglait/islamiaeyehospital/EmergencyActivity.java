package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class EmergencyActivity extends AppCompatActivity {

    String nam = "Dr. Shafi Khan";
    String nam2 = "Dr. Mahmood Mujtaba";

    String doc3 = "After completing MD degree from Russia, Dr. Chandana returned to Bangladesh to continue pursuing her education and career in opthalmology.\n" +
            "Dr. Chandana has joined Islamia in 2007 and she has done fellowship in cornea & anterior segment both at Islamia and LV Prassad Eye Institute in Hyderabad, India.\n" +
            "She is very passionate about her patients and wants them to receive excellent care.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Cornea and Anterior Segment\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MD (Russia)\n" +
            "FCPS\n" +
            "DO";
    String nam3 = "Dr. Chandana";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView id1 = (ImageView) findViewById(R.id.emergency);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmergencyActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/shafikhan.html");
                i.putExtra("res",R.drawable.doc2);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.emergency2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmergencyActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/mujtaba.html");
                i.putExtra("res",R.drawable.do7);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.emergency3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmergencyActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/candona.html");
                i.putExtra("res",R.drawable.do5);
                startActivity(i);
            }
        });

        WebView webView = (WebView) findViewById(R.id.webView6);
        webView.loadData(getString(R.string.emer), "text/html; charset=utf-8", "utf-8");
        WebView webView7 = (WebView) findViewById(R.id.webView7);
        webView7.loadData(getString(R.string.emer2), "text/html; charset=utf-8", "utf-8");
    }
}
