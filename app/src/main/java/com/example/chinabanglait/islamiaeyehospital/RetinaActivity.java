package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RetinaActivity extends AppCompatActivity {

    String doc1 = "Dr. Mostafizur Rahman (Mostaq) is one of the most experienced and popular retina surgeon in Bangladesh. He is also known as a senior and experienced phaco surgeon, having performed thousands of cataract surgeries. He received DO in ophthalmology at DU, and trained at Aravind Eye Hospital and Institute where he developed his cataract surgical skills. He also completed his long term fellowship in V-Retina at Al- Shifa Trust Eye Hospital and Institute, Pakistan. He has published a number of papers in ophthalmic journals.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Vitreo- Retina And Phaco IOL microsurgery\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS -1987\n" +
            "DO - 1996\n" +
            "Fellowship in Phaco IOL microsurgery 1997-Aravind Eye Institute, India\n" +
            "Fellowship in vitreo retina - 2006- Al-Shifa Eye Trust Hospital, Pakistan\n" +
            "Experience\n" +
            "\n" +
            "Practicing in ophthalmology since - 1992\n" +
            "Cataract surgery have done about more than 50,000\n" +
            "Vitreo retinal surgery have done about 10,000.\n" +
            "Research Activities\n" +
            "\n" +
            "Injection Ranibizumab on NPDR with macular oedema (Non proliferative Diabetic Retinopathy) patient\n" +
            "\n" +
            "Published Papers & Journals\n" +
            "\n" +
            "More Than 20 papers in different national Journals";
    String nam = "Dr. Mostafizur Rahman";

    String doc2 = "Not only has Dr. Nahar specialized in vitreo-retina surgery, but she also has a background in ophthalmic trauma and cataract surgery. She has completed an estimated 10,000 surgeries in her career, and, in addition, has participated in local and international conferences, where she has made presentations. She has also published a number of research papers in national journals. She is teaching Diploma and FCPS Ophthalmologist Postgraduate students. She enjoys working with patients and treating each one as an individual. She has been master-of-ceremony at some of the conferences held at Islamia. She is the first female ophthalmologist in Bangladesh who achieved prestigious FRCS degree from UK.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Vitreo- Retinal surgeon\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS -1999\n" +
            "DO- 2004\n" +
            "FCPS- 2007\n" +
            "Fellowship in vetrio retina-2011 from IIEH & LVPI\n" +
            "Trained in ROP-2013 from LVPEI, Hyderabad, India\n" +
            "FRCS-2014 from UK\n" +
            "Experience\n" +
            "\n" +
            "Practicing in ophthalmology since 2004\n" +
            "Practicing vetrio retina as a subspecialty since 2010 and have done more than 3000 retinal surgery\n" +
            "Published Papers & Journals\n" +
            "\n" +
            "More Than 10 papers in different national Journal";
    String nam2 = "Dr. Nahar";

    String doc3 = "Sanjoy Kumer Das completed his basic medical education with distinction from Shahjalal University followed by postgraduation from National Institute of Ophthalmology & Hospital, Dhaka . He also completed long term fellowship(15th months) in Vitreo-Retina and ROP from LVPEI, Hyderabad, India. He has participated local and international conference. He is enjoying working with patients and treating each one as an individual. His fields of interest include Diabetic retinopathy, Paediatric retina , Retinal vein occlusion & Ocular Trauma. He has been closely involved in the childhood blindness control through ROP screening and treatment programs.\n" +
            "\n" +
            "He has perform more than three thousand Vitreo-Retinal surgeries.\n" +
            "\n" +
            "Specialty\n" +
            "\n" +
            "Vetrio- Retinal Surgeon\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "MBBS -2002\n" +
            "DO- 2011\n" +
            "Long term Fellowship in vetrio retina - 2013 LVPEI, Hyderabad India\n" +
            "Trainned in ROP- From LVPEI,2013, Hyderabad India\n" +
            "Experience\n" +
            "\n" +
            "Medical Officer: Apollo Hospital, Lions Eye Institute and Hospital\n" +
            "1000 vitreo - retinal surgery and ophthalmic surgery done\n" +
            "Research Activities\n" +
            "\n" +
            "BRVO study - In LVPEI\n" +
            "CRVO study - In LVPEI";
    String nam3 = "Dr. Ahamed Zaher";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retina);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView id1 = (ImageView) findViewById(R.id.ratina1);
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RetinaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam);
                i.putExtra("e1",doc1);
                i.putExtra("res",R.drawable.do8);
                startActivity(i);
            }
        });

        final ImageView id2 = (ImageView) findViewById(R.id.ratina2);
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RetinaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam2);
                i.putExtra("e1",doc2);
                i.putExtra("res",R.drawable.do22);
                startActivity(i);
            }
        });

        final ImageView id3 = (ImageView) findViewById(R.id.ratina3);
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RetinaActivity.this,Doctor_DetailsActivity.class);
                i.putExtra("e2",nam3);
                i.putExtra("e1",doc3);
                i.putExtra("res",R.drawable.do23);
                startActivity(i);
            }
        });
    }
}
