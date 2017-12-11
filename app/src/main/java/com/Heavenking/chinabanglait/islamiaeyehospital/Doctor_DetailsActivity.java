package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Doctor_DetailsActivity extends AppCompatActivity {

    String e2;
    ImageView ress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ress = (ImageView) findViewById(R.id.res);
//
        Bundle bundle = getIntent().getExtras();
//
////        TextView tv1 = (TextView) findViewById(R.id.details);
        TextView tv2 = (TextView) findViewById(R.id.name);
//
        int res = bundle.getInt("res");
        ress.setImageResource(res);
//
        Intent intent = getIntent();
        e2 = intent.getStringExtra("e2");
////        e1 = intent.getStringExtra("e1");
//        e1 = getIntent().getExtras().getString(e1);
////        tv1.setText(e1);
        tv2.setText(e2);

        String e1 = getIntent().getExtras().getString("e1");
        WebView web = (WebView)findViewById(R.id.webView);
        web.loadUrl(e1);
        
        Toast.makeText(getApplicationContext(),e2,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
