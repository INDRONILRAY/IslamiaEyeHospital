package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GlaucomaActivity extends AppCompatActivity {

    String doc1 = "Dr. Zafrul is a skilled and energetic consultant surgeon. After passing MBBS, he went to Saudi Arabia and gathered more experience. He had began his carrier as a RMO at Islamia in 2007.He completed FCPS in ophthalmology, 2012. After that he has done long term fellowship in Cornea at IIEI&H. Recently He also completed long term fellowship in Glaucoma from Arvind Eye Hospital, India and performed many cataract (PHACO & SICS), trab, trab Phaco, Trab SICS, trab & Trab, GDD implant C+G. He is married to Dr. Nazia Islam and has two daughters & one son.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Glaucoma,Qualifications,MBBS,FCPS";
    String nam = "Dr. Zafrul Hassan";

    String doc2 = "Dr. Syed Jahangir Kabir is a comprehensive ophthalmologist specializing in glaucoma. He graduated from Sylhet M.A.G Osmani Medical College, and has been achieved Diploma in Ophthalmology (DO) and also awarded the FCPS (Ophthalmology) degree, and he completed long-term fellowship in glaucoma at IIEIH & Arvind Eye Hospital, India. Now he is working as glaucoma consultant in Ispahani Islamia Eye Institute & Hospital, Dhaka. Married to Dr. Sabin Yesmin dedicated to becoming one of the top glaucoma doctor in Bangladesh.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Glaucoma and Phaco Surgeon\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS,DO,FCPS";
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
                i.putExtra("e1",doc1);
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
                i.putExtra("e1",doc2);
                i.putExtra("res",R.drawable.do13);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.imageView3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GlaucomaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do14);
                startActivity(i);
            }
        });
    }
}
