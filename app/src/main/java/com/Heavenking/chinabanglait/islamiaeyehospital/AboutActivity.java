package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingTextButton floatingTextButton = (FloatingTextButton) findViewById(R.id.phonecall);
        floatingTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09610998333"));
                startActivity(callIntent);
            }
        });

        FloatingTextButton floatingText= (FloatingTextButton) findViewById(R.id.sendsms);
        floatingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chooser=null;
                Intent callIntent = new Intent(Intent.ACTION_SEND);
                callIntent.setData(Uri.parse("mailto:"));
                String[] to= {"info@islamia.org.bd"};
                callIntent.putExtra(Intent.EXTRA_EMAIL,to);
                callIntent.putExtra(Intent.EXTRA_SUBJECT,"Write Subject");
                callIntent.putExtra(Intent.EXTRA_TEXT,"Write Message");
                callIntent.setType("message/rfc822");
                chooser = Intent.createChooser(callIntent,"Send Email");
                startActivity(chooser);
            }
        });

        String myData = "<font color='#424242' size='4'>The Iconic name Islamia in the eyee service field denotes ispahani islamia eyee institute and hospital (IIEIH),the largest and speciality eyee hospital " +
                "in Bangladesh which was established in 1960 by M A ispahani,the hreat industrialist and philanthropist of the subspecialist.<br /><br />it is non-profit " +
                "organization with aprice eangeaffordable for all class of people.<br /><br />The twohundred bedded hospital is reequipped with all modern equipmentand advanced " +
                "technologies and serves 2000 patients and performsaround 150 surgeries daily.<br />About 100 doctors,xxx optometrists,xxx nurses,xxx technician with total " +
                "workforce of 1000 staffs are dedicated to the service.<br /><br />The education part of the hospital happens to become the largest Eye Institute,which runs 16 different " +
                "courses and training programs.Till to date the instituteproduced xx specialists,xx surgeones,xxx residents and xxx person of another category." +
                "The Hospital has branches at jamalpur,Barisal and naogaon.<br />A number of Vision centers work in the community level under the branches.</font>";

        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.loadData("<p style=\"text-align: justify\">"+ myData +"</p>", "text/html", "UTF-8");

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
