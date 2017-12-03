package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AnstesiaActivity extends AppCompatActivity {

    String doc1 = "Dr. Maleque is one of the experienced anesthesiologist. He has vast experiences in pediatric, neonatal, adult & geriatric Anaesthesia& performed about 50,000 Anaesthesia including general & regional Anaesthesia. He is actively involved in clinical teaching & has tutorial to residence, students & trainees.\n" +
            "Specialty \n" +
            "•\tNeonatal Anaesthesia\n" +
            "•\tPediatric Anaesthesia\n" +
            "•\tGeriatric Anaesthesia\n" +
            "•\tAnaesthesia in patient with medical disorder\n" +
            "•\tObstreticialAnaesthesia\n" +
            "•\tAlternative Anaesthesia\n" +
            "•\tTIVA for ophthalmic surgery\n" +
            "Qualifications \n" +
            "•\tMBBS, from Chittagong Medical College & Hospital\n" +
            "•\tMCPS from Bangladesh College of Physician & Surgeon.\n" +
            "•\tDA. From Dhaka University\n" +
            "•\tSix month certificate course in Diabetes from BERDEM hospital , Dhaka, Bangladesh.\n" +
            "•\tTrained in Neonatal & Pediatric Anaesthesia from “Royal hospital for sick children” Scotland, UK.\n" +
            "•\tCertificate course on CPR from Dhaka Medical College. \n";
    String nam = "Dr. Md. A. Maleque";

    String doc2 = "Dr. Shahida Banu";
    String nam2 = "Dr. Shahida Banu";

    String doc3 = "Dr. Syed Azahar Ali";
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
                i.putExtra("e2",nam);
                i.putExtra("e1",doc1);
                i.putExtra("res",R.drawable.doc1);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView6);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnstesiaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1",doc2);
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
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.docazhar);
                startActivity(i);
            }
        });
    }
}
