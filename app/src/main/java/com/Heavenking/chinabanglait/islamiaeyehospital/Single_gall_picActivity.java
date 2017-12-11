package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Single_gall_picActivity extends AppCompatActivity {

    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_gall_pic);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        i1 = (ImageView)findViewById(R.id.custom);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null)
        {
            int id = bundle.getInt("id");
            i1.setImageResource(id);
        }

    }
}
