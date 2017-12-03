package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CataActivity extends AppCompatActivity {

    String doc1 = "Dr. Shafi is a specialist in cornea and anterior segment diseases, and a cataract surgeon. Achieving MBBS degree from DMCH, he received his FCPS in Ophthalmology from BCPS at NIO. As a part of his fellowship in cornea and anterior segment, he worked with the doctors at LV Prasad Eye Institute in Hyderabad, India. He is a good trainer who has written a number of medical papers, and received awards for some of those. He has also been specialized in corneal transplants, pterygium, trauma and other anterior segment surgeries. He has good organizational skills, which encourages others at lot.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "All types of cataract surgeries, including Phacoemulsification, SICS, SFL, complicated cataract surgery with iris hook or CTR, multifocal and toric IOLs, PK, Pterigium surgery with glue, trauma surgery etc.\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS\n" +
            "FCPS (Ophth)\n" +
            "Long term Fellowship in cornea and anterior segment (IIEI&H and LVPEI)\n" +
            "Experience\n" +
            "\n" +
            "Medical Officer in different Upozilla Health Complex\n" +
            "Assistant Registrar (Ophth) in MMCH and SSMC & H\n" +
            "Registrar (Ophth) in SSMC & H\n" +
            "Consultant /Assistant Professor in Departmant of Cornea and Anterior Segment, IIEI&H from September 2010 till to date\n" +
            "Special Asst. to MS of IIEI&H\n" +
            "In-charge of cataract and trauma unit of IIEI&H";
    String nam = "Dr. Shafi";

    String doc2 = "Dr. Salam spent many years working in the rural areas where he felt he could play a major role in preventing people from needless blindness. He has become more dedicated to his patients and looks at his work as a form of worship. In 2001 he started the Fred Hollow Foundation project with Grameen Bank to reduce needless blindness in rural areas. During that time, he went to Nepal on several occasion (2001, 2004, 2006) for training on cataract & oculoplasty surgery. Later he completed his Cornea Fellowship from Islamia.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Cornea and Anterior Segment\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS\n" +
            "DO";
    String nam2 = "Dr. Salam";

    String doc3 = "Before joining Islamia, which he did in 2012, Dr. Zahir completed a yearâ€™s fellowship in general ophthalmology and cataract surgery at Aravind Eye Hospital in Madurai, India (the largest eye hospital in the world). He has performed over 3,000 ophthalmic surgeries. He relates a story about a patient on whom he performed surgery. â€œShe had been blind with cataracts,â€\u009D Dr. Zahir says, â€œand after the operation, she could see again. For the first time, she saw her 2-year-old child.â€\u009D\n" +
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
            "RMO Islamia eye Hospital from feb to Dec 2003\n" +
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
                i.putExtra("e1",doc1);
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
                i.putExtra("e1",doc2);
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
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do4);
                startActivity(i);
            }
        });
    }
}
