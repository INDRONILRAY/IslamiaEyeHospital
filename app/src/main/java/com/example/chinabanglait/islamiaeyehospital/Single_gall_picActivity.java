package com.example.chinabanglait.islamiaeyehospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Single_gall_picActivity extends AppCompatActivity {

    ImageView ress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_gall_pic);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ress = (ImageView) findViewById(R.id.imageView12);

        Bundle bundle = getIntent().getExtras();

        int res = bundle.getInt("res");
        ress.setImageResource(res);
    }
}
