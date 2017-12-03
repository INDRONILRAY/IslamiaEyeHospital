package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CorneaActivity extends AppCompatActivity {

    String doc1 = "Prof. Sarwar Alam is one of the most senior cornea and cataract surgeons in Bangladesh, who performed thousands of cataract surgeries, and hundreds of corneal transplants. He was one of the pioneer of IOL implantation in cataract surgery at Islamia (1996), and is performing corneal transplants since 2004. He is a master teacher and instructor, has written many scientific papers. He has attended many international conferences over the years, and done fellowship in Cornea department of Johns Hopkins Hospital, US.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Cataract,Corneal,Qualifications\n" +
            "\n" +
            "MBBS\n" +
            "DO,FCPS";
    String nam = "Prof. Dr.Sarwar Alam";

    String doc2 = "Dr. Shafi is a specialist in cornea and anterior segment diseases, and a cataract surgeon. Achieving MBBS degree from DMCH, he received his FCPS in Ophthalmology from BCPS at NIO. As a part of his fellowship in cornea and anterior segment, he worked with the doctors at LV Prasad Eye Institute in Hyderabad, India. He is a good trainer who has written a number of medical papers, and received awards for some of those. He has also been specialized in corneal transplants, pterygium, trauma and other anterior segment surgeries. He has good organizational skills, which encourages others at lot.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "All types of cataract surgeries, including Phacoemulsification, SICS, SFL, complicated cataract surgery with iris hook or CTR, multifocal and toric IOLs, PK, Pterigium surgery with glue, trauma surgery etc.\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS,FCPS (Ophth)\n" +
            "Long term Fellowship in cornea and anterior segment (IIEI&H and LVPEI)\n" +
            "Experience\n" +
            "\n" +
            "Medical Officer in different Upozilla Health Complex\n" +
            "Assistant Registrar (Ophth) in MMCH and SSMC & H\n" +
            "Registrar (Ophth) in SSMC & H\n" +
            "Consultant /Assistant Professor in Departmant of Cornea and Anterior Segment, IIEI&H from September 2010 till to date\n" +
            "Special Asst. to MS of IIEI&H\n" +
            "In-charge of cataract and trauma unit of IIEI&H";
    String nam2 = "Dr. Md Shafi Khan";

    String doc3 = "After completing undergraduate at DMC in 1997, Dr. Mahmood undertook a fellowship in cornea and anterior segment at Islamia, which included an observership at LV Prasad Eye Institute, India. Among his hundreds of surgeries, a young blind lady was benefitted. As he tells: â€œShe had lost her sight some time before and had never seen her husband. After I performed a corneal graft on one of her eyes, she became sighted could see her husband for the first time. On seeing him, her whole face lit up. I felt as if I had really made a difference to someoneâ€™s life!â€\u009D\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Cornea and Anterior Segment Surgeon\n" +
            "\n" +
            "Qualifications\n" +
            "MBBS,FCPS\n" +
            "Fellowship in vetrio retina â€“ from IIEH & LVPI";
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
                i.putExtra("e1",doc1);
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
                i.putExtra("e1",doc2);
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
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do7);
                startActivity(i);
            }
        });
    }
}
