package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery);
                startActivity(i);
            }
        });final ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery2);
                startActivity(i);
            }
        });final ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery3);
                startActivity(i);
            }
        });final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery4);
                startActivity(i);
            }
        });final ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery5);
                startActivity(i);
            }
        });final ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery7);
                startActivity(i);
            }
        });final ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery8);
                startActivity(i);
            }
        });final ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery9);
                startActivity(i);
            }
        });final ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery10);
                startActivity(i);
            }
        });final ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GalleryActivity.this,Single_gall_picActivity.class);
                i.putExtra("res",R.drawable.allery11);
                startActivity(i);
            }
        });
    }
}
