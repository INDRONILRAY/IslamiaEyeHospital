package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaediaActivity extends AppCompatActivity {

    String doc1 = "Dr. Mastura is one of the most experienced and senior paediatric ophthalmologists in the country. She was trained at Aravind Eye Hospital in India, and has performed thousands of surgeries on children's cataracts and squint. She has built up Paediatric department into one of the leading children's eye care facilities in Bangladesh. She also developed the low vision clinic to an international level to save the visually impaired. She has presented several research papers at international and national seminars and conferences.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Paediatric Ophthalmology and Strabismus\n" +
            "Low Vision\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS\n" +
            "DCO\n" +
            "Fellowship in Paediatric Ophthalmology and Strabismus in Aravind Eye Hospital, India.\n" +
            "Trained on Low Vision in Pakistan Institute of Community Ophthalmology (PICO), Peshawar, Pakistan.\n" +
            "Experience\n" +
            "\n" +
            "She is head of Departments of Paediatric Ophthalmology & Strabismus and Low Vision from 2004 till now\n" +
            "\n" +
            "Research activities\n" +
            "\n" +
            "Visual outcome of traumatic cataract\n" +
            "Post operative evaluation of paediatric cataract\n" +
            "Effect of occlusion on elderly amblyopia\n" +
            "Scleral fixation IOL in children\n" +
            "How far we can help children with Marfan syndrome\n" +
            "Surgical outcome of horizontal strabismus\n" +
            "Case series of cyclic esotropia\n" +
            "Bilateral congenital cataract-risk factors and barriers in uptaking service\n" +
            "Bilateral congenital cataract with nystagmaus\n" +
            "Effect of alternate occlusion on isometropic amblyopia\n" +
            "Keratoconus related with Vernal keratoconjunctivitis\n" +
            "Published Papers & Journals\n" +
            "\n" +
            "Visual outcome of traumatic cataract - CEITC- Horizon’ 2004\n" +
            "Post operative evaluation of paediatric cataract- 2nd int. conf. on POS (Rawalpindi, 2006)\n" +
            "Effect of occlusion on elderly amblyopia - OSB Journal’ 2005\n" +
            "Scleral fixation IOL in children - OSB JournalÂ  & WOC in Hongkong’ 2008\n" +
            "How far we can help children with Marfan syndrome - WCPOS- Milan’2012\n" +
            "Surgical outcome of horizontal strabismus - SSI Delhi 2010 and WOC Beijing’ 2011\n" +
            "Case series of cyclic esotropia- AAPOS & SNEC, Singapore’ 2013\n" +
            "Low vision services in a tertiary center of B-desh - WOC, Tokyo’ 2014";
    String nam = "Dr. Mastura";

    String doc2 = "After passing MBBS in 1992, Dr. Mostafa completed DO and MS in ophthalmology. Subsequently he completed a fellowship program in pediatric ophthalmology & strabismus at Al-Shifa Trust Eye Hospital, Pakistan in 2007 and refresher course in England in 2013. \n Since then he does monthly 40-50 pediatric cataract surgery and 15-20 squint surgery on regular basis.\n He has spent a number of years in teaching under- and post-graduate students, and has 21 publications to his credit. He has presented scientific research papers in conferences in Pakistan, China, Australia, UAE, Italy, Hong-Kong, England, Japan, Spain, Taiwan and Bangladesh.\nHe visited many renowned hospitals in the world like Great Ormond Street Hospital in London. He is an international member of American Association of Pediatric Ophthalmology & Strabismus";
    String nam2 = "Dr.Md Mostafa";

    String doc3 = "Dr Quazi Sazzad Iftekhar completed long term fellowship in Pediatric Ophthalmology & Strabismus with an observer ship in LV Prasad Eye Institute, Hyderabad, India. He is actively involved in research activities in the pediatric ophthalmology services. He attended in national and international conferences.\n" +
            "His areas of clinical interest include pediatric cataract surgery, strabismus and congenital disorders.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Paediatric Ophthalmology\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS\n" +
            "DO";
    String nam3 = "Dr Quazi Sazzad Iftekhar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paedia);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.imageView1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaediaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1",doc1);
                i.putExtra("res",R.drawable.do19);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaediaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1",doc2);
                i.putExtra("res",R.drawable.do20);
                startActivity(i);
            }
        });

        final ImageView zxcv = (ImageView) findViewById(R.id.zxcv);
        zxcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaediaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do21);
                startActivity(i);
            }
        });
    }
}
