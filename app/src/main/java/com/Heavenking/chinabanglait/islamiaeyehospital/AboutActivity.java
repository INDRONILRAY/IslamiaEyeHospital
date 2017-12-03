package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

    }
}
