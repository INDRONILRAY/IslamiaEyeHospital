package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NeuroPActivity extends AppCompatActivity {

    String doc2 = "Associate Professor Dr. Nazmun has been with Islamia for over 20 years. \n" +
            "She founded the Department of Neuro-ophthalmology in 2002. \n" +
            "Her special interests are optic neuritis, ischaemic optic neuropathy, and myasthenia gravis. She is most enthusiastic about building the Department of Neuro-ophthalmology into one of the very best in Asia.\n" +
            "\n" +
            "Dr. Nazmun is also an experienced cataract surgeon, and has performed over 20,000 cataract surgeries to date. Dr. Nazmun as an Associate professor has recently been appointed as the Deputy Director of the Education and Training Services and is assigned to further develop the paramedical and nursing’s training initiatives.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Neuro-Ophthalmology\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS,DO,FICO,FCPS";
    String nam2 = "Professor Dr. Nazmun Nahar";

    String doc3 = "Dr. Sibgatullah has been a consultant Neuro-ophthalmology since 2002. He trained at the Beth Israel Hospital, Institute of Neurology and Neuro surgery in New York, USA under Prof. Mark Kupersmith. Dr. Sibgatullah was consultant in Neuro â€“ophthalmology at the Chittagong Eye Infirmary. Over the years, Dr. Sibgatullah has presented numerous scientific papers at international conferences, and is recognized as an expert in the field of Neuro - ophthalmology\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Neuro-ophthalmology\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS from Dhaka Medical College, 1980.\n" +
            "DCO from Chittagong University, 1995.\n" +
            "FICO\n" +
            "FCPS: 2011.\n" +
            "Fellowship in Neuro - ophthalmology: INN, Beth Israel Hospital, NY, USA, 2002\n" +
            "Experience\n" +
            "\n" +
            "Chittagong Eye Infirmary (2002-2011)\n" +
            "Ispahani Islamia Eye Institute and Hospital (2012 to still now)\n" +
            "Published Papers & Journals\n" +
            "\n" +
            "Paddy Related Suppurative Keratitis in Bangladesh [March, 2004, CEITC Horizon (9-12)]\n" +
            "Diagnosis of Tumours of Â the Chiasmal area of Â brain: Role of ophthalmologists (JOSB: 35(2): 125-131) (2008)\n" +
            "Ocular Manifestations of Cerebellopontine Angle Tumours: A case series study â€“ 2009 (JOSB: 36 (3):252-257)\n" +
            "Variability of Ocular Manifestations of Intracranial Â tumours present in different location of brain: A case series study (JOSB: 38(2): 103-104, 2011)";
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
                i.putExtra("e1",doc2);
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
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do15);
                startActivity(i);
            }
        });
    }
}
