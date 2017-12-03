package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OculoActivity extends AppCompatActivity {

    String doc1 = "Dr.Robi is a pioneering name in developing the institute and a number of training programs including IOL and a number of sub-specialties.\n" +
            "\n" +
            "He is the senior most Oculoplastic surgeon in Bangladesh and the main driver in raising oculoplasty to excellence level in the institute.\n" +
            "\n" +
            "Dr. Robi has performed more than 7000 DCRs, and other lacrimal surgeries, 1000 ptosis surgeries, 3000 lid reconstructions and more than 1000 orbital surgeries.Â  He has also developed/innovated a number of new surgical techniques with good results.\n" +
            "\n" +
            "Earlier on in his career he has performed more than 1000 cataract surgeries and trained a number of cataract surgeons. He is a renowned teacher and mentor. He spent more than 4000 hours in lecturing and mentored, guided and trained more than 300 ophthalmologists.\n" +
            "\n" +
            "Dr. Robi has travelled Several countries including Britain, Singapore and India for Conferences, seminars and training purposes.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Ophthalmic plastic and reconstructive surgeries\n" +
            "Orbital surgery and diseases\n" +
            "Tear drainage system surgeries\n" +
            "Facial aesthetic surgeries\n" +
            "Botox and fillers\n" +
            "Qualifications\n" +
            "\n" +
            "MCPS in Ophthalmology from College of physicians and Surgeons, Bangladesh\n" +
            "Diploma in Ophthalmology from National Institute of Ophthalmology\n" +
            "Short term fellowship (Trainers\\Training) in cataract and IOL surgery from Aravind Eye Hospital, India\n" +
            "Training in Ophthalmic plastic and reconstructive surgery from Moorfields Eye Hospital, London\n" +
            "Received fellowship in Oculoplastic surgery, Orbit and Ocular oncology from LV Prasad Eye Institute, India.\n" +
            "He has received training and done short courses on various management and clinical aspects.\n" +
            "Experience\n" +
            "\n" +
            "Founder, coordinator and registrar at MA Ispahani Institute of Ophthalmology\n" +
            "Coordinator and assistant professor and junior consultant\n" +
            "Deputy Director of the Institute and Associate Professor and consultant\n" +
            "Senior consultant, Head of Oculoplasty and Associate Professor\n" +
            "Research Activities\n" +
            "\n" +
            "Dr. Robi conducted a number of research activities, in most cases as the principal author:\n" +
            "\n" +
            "Supramaximal LPSR- an ideal technique for correction of Ptosis with minimal LPS function with restoration of optimal cosmesis and good functions.\n" +
            "Evisceration with Scleral fashioning- A novel technique for managing phthisis bulbi with maximal cosmesis.\n" +
            "Histophologic analysis of primary Enucleation of RB cases\n" +
            "Paediatric DCR -Outcome of 44 cases\n" +
            "Outcome and analysis of 22 failed DCR cases\n" +
            "Retinoblastoma - New international grouping, staging and management (review)\n" +
            "Primary tuberculosis of Lid - report of three cases.\n" +
            "Orbital Neurobalstoma- A case report\n" +
            "Conjunctival Acanthoma: A case report\n" +
            "Currently six research activities (three interventional) are going on.";
    String nam = "Dr.Nazmul Haque";

    String doc2 = "Dr. Sadia Sultana is one of the few leading oculoplastic surgeons of the country. She is the first lady Oculoplastic surgeon of the country. She is also a trainer and providing three trainees. She is the pioneer team member of Oculoplasty team of this apical center.\n" +
            "\n" +
            "A promising surgeon Dr.Sadia has performed more than 2500 DCRs and other lacrimal surgeries, 300 ptosis surgeries, 400 lid reconstructions and more than 200 orbital surgeries.\n" +
            "\n" +
            "Dr. Sadia has travelled to a number of countries including Malaysia, Singapore and Thailand for academic and leisure purposes.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Ophthalmic plastic and reconstructive surgeries\n" +
            "Orbital surgery and diseases\n" +
            "Tear drainage system surgeries\n" +
            "Botox and fillers\n" +
            "Qualifications\n" +
            "\n" +
            "FCPS in Ophthalmology from University of Dhaka, Bangladesh\n" +
            "Received fellowship in Oculoplastic surgery, Orbit and Ocular oncology from Ispahani Islamia Eye Institute and Hospital\n" +
            "Received observer fellowship program in Oculoplastic Surgery, Orbit and Ocular Oncology.\n" +
            "Dr.Sadia is also a popular teacher for DO and FCPS students and residents.\n" +
            "Experience\n" +
            "\n" +
            "Junior consultant cum Assistant\n" +
            "Junior consultant cum Associate Professor(?)\n" +
            "Research Activities \n" +
            "\n" +
            "Out come and analysis of 22 failed DCR cases\n" +
            "Conjunctival Acanthoma: A case report\n" +
            "Supramaximal LPSR- an ideal techinique for correction of Ptosis with minimal LPS function with resotoration of optimal cosmesis and good functions.\n" +
            "Retinoblastoma-New international grouping, staging and management (review)\n" +
            "Primary tuberculosis of Lid-report of three cases.\n" +
            "Orbital Neurobalstoma- A case report\n" +
            "Evisceration with Scleral fashioning- A novel technique for managing phthisis bulbi with maximal cosmesis.\n" +
            "Histophologic analysis of primary Enucleation of RB cases\n" +
            "Paediatric DCR-Outcome of 44 cases\n" +
            "Besides six researches (three interventional) are going on.";
    String nam2 = "Dr. Sadia Sultana";

    String doc3 = "Dr. Riffat Rashid is a bright promising name in the field of Oculoplasty in Bangladesh. She is one of the few leading oculoplastic surgeons of the country. She is also a trainer under whom two long term fellows are receiving training. She is the pioneer team member of Oculoplasty team of this apical center.\n" +
            "\n" +
            "An young experienced surgeon Dr.Riffat performed more than 2000 DCRs and other lacrimal surgeries, 200 ptosis surgeries, 500 lid reconstructions and more than 300 orbital surgeries.\n" +
            "\n" +
            "Dr. Riffat travelled numbers of country including China, Hongkong, India, Srilanka, Malaysia, Singapore for academic and leisure purpose.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Ophthalmic plastic and reconstructive surgeries\n" +
            "Orbital surgery and diseases\n" +
            "Tear drainage system surgeries\n" +
            "Botox and fillers\n" +
            "Qualifications\n" +
            "\n" +
            "MS in Ophthalmology from University of Dhaka, Bangladesh\n" +
            "Training in Ophthalmic plastic and reconstructive surgery from Moorfiel’s Eye Hospital, London\n" +
            "Received fellowship in Oculoplastic surgery, Orbit and Ocular oncology from Ispahani Islamia Eye Institute and Hospital.\n" +
            "Dr.Riffat is a also teacher and mentor and an examiner for the optometrist under state medicine faculty.\n" +
            "Experience\n" +
            "\n" +
            "Junior consultant cum Registrar\n" +
            "Junior consultant cum Assistant Professor(?)\n" +
            "Research Activities \n" +
            "\n" +
            "Out come and analysis of 22 failed DCR cases\n" +
            "Retinoblastoma - New international grouping, staging and management (review)\n" +
            "Primary tuberculosis of Lid - report of three cases.\n" +
            "Orbital Neurobalstoma- A case report\n" +
            "Evisceration with Scleral fashioning- A novel technique for managing phthisis bulbi with maximal cosmesis.\n" +
            "Conjunctival Acanthoma: A case report\n" +
            "Supramaximal LPSR- an ideal techinique for correction of Ptosis with minimal LPS function with resotoration of optimal cosmesis and good functions.\n" +
            "Histophologic analysis of primary Enucleation of RB cases\n" +
            "Paediatric DCR -Outcome of 44 cases\n" +
            "Besides six researches ( three interventional) are going on.";
    String nam3 = "Dr. Riffat Rashid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oculo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.imageView1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OculoActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1",doc1);
                i.putExtra("res",R.drawable.doxxx);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.imageView2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OculoActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1",doc2);
                i.putExtra("res",R.drawable.do17);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.imageView3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OculoActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do18);
                startActivity(i);
            }
        });
    }
}
