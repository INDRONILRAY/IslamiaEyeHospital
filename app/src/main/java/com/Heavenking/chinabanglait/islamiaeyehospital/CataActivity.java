package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class CataActivity extends AppCompatActivity {

    String nam = "Dr. Shafi Khan";
    String nam2 = "Dr. Salam";

    String doc3 = "Before joining Islamia, which he did in 2012, Dr. Zahir completed a yearâ€™s fellowship in general ophthalmology and cataract surgery at Aravind Eye Hospital in Madurai, India (the largest eyee hospital in the world). He has performed over 3,000 ophthalmic surgeries. He relates a story about a patient on whom he performed surgery. â€œShe had been blind with cataracts,â€\u009D Dr. Zahir says, â€œand after the operation, she could see again. For the first time, she saw her 2-year-old child.â€\u009D\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Cataract, Comprehensive Ophthalmology\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS\n" +
            "DO\n" +
            "Experience\n" +
            "\n" +
            "RMO Islamia eyee Hospital from feb to Dec 2003\n" +
            "Medical officer Lions Eye Institute & Hospital dhaka from Jan 2004 to Sept 2006\n" +
            "Jr.Consultant Grameen GC Eye Hospital Bogra from Oct 2007 to Dec 2011\n" +
            "Jr. Consultant at IIEI&H still now.";
    String nam3 = "Dr. Ahamed Zaher";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cata);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.imageView1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CataActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/shafikhan.html");
                i.putExtra("res",R.drawable.doc2);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CataActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/salam.html");
                i.putExtra("res",R.drawable.do3);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.imageView3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CataActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/ahamed.html");
                i.putExtra("res",R.drawable.do4);
                startActivity(i);
            }
        });

        WebView webView = (WebView) findViewById(R.id.webView3);
        webView.loadData(getString(R.string.catera), "text/html; charset=utf-8", "utf-8");
        WebView webView4 = (WebView) findViewById(R.id.webView4);
        webView4.loadData(getString(R.string.catera1), "text/html; charset=utf-8", "utf-8");
        WebView webView5 = (WebView) findViewById(R.id.webView5);
        webView5.loadData(getString(R.string.catera2), "text/html; charset=utf-8", "utf-8");
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
