package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class GlaucomaActivity extends AppCompatActivity {

    String nam = "Dr. Zafrul Hassan";
    String nam2 = "Dr. Syed Jahangir Kabir";

    String doc3 = "Dr. Bipul currently work as Consultant in Glaucoma and additionally is a Phaco Surgeon. Having completed his graduate degree (MBBS) from Rajshahi Medical College, he completed his FCPS in Ophthalmology from the Bangladesh College of Physicians and Surgeons. He has also passed all parts of ICO examinations from International Council of Ophthalmology, London, U.K. He pursued a Long-term Fellowship in Glaucoma from Ispahani Islamia Eye Institute and Hospital, Bangladesh with an Observership from Aravind Eye Hospital, Madurai, India.\n" +
            "He is specialized in all types of cataract and glaucoma surgeries including valve implants and laser glaucoma surgeries, with a special interest in innovating modifications in glaucoma surgery to make it more effective and safer for patients. Apart from his clinic duties, he also involved in training, teaching, and research, with publications in peer-reviewed journals.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Glaucoma and Phaco Surgeon\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "Fellow- Glaucoma (IIEI&H & AEH, India)\n" +
            "FCPS (Opth.)\n" +
            "ICO(U.K)\n" +
            "MBBS";
    String nam3 = "Dr. Bipul Kumar Sarkar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glaucoma);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView id1 = (ImageView) findViewById(R.id.imageView1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GlaucomaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1","file:///android_asset/zafrul.html");
                i.putExtra("res",R.drawable.do12);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GlaucomaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1","file:///android_asset/kabir.html");
                i.putExtra("res",R.drawable.do13);
                startActivity(i);
            }
        });

        final ImageView imx = (ImageView) findViewById(R.id.imx);
        imx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GlaucomaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1","file:///android_asset/bipul.html");
                i.putExtra("res",R.drawable.do14);
                startActivity(i);
            }
        });
        WebView webView = (WebView) findViewById(R.id.webView6);
        webView.loadData(getString(R.string.glaucoma), "text/html; charset=utf-8", "utf-8");
    }
}
