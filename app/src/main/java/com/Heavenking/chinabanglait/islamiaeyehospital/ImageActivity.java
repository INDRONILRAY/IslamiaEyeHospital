package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);


        ImageView gal_1 = (ImageView)findViewById(R.id.gal_1);
        gal_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery);
                startActivity(intent);
            }
        });
        ImageView gal_2 = (ImageView)findViewById(R.id.gal_2);
        gal_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery2);
                startActivity(intent);
            }
        }); ImageView gal_3 = (ImageView)findViewById(R.id.gal_3);
        gal_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery3);
                startActivity(intent);
            }
        });
        ImageView gal_4 = (ImageView)findViewById(R.id.gal_4);
        gal_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery4);
                startActivity(intent);
            }
        }); ImageView gal_5 = (ImageView)findViewById(R.id.gal_5);
        gal_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery5);
                startActivity(intent);
            }
        });
        ImageView gal_6 = (ImageView)findViewById(R.id.gal_6);
        gal_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery6);
                startActivity(intent);
            }
        });
        ImageView gal_7 = (ImageView)findViewById(R.id.gal_7);
        gal_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery7);
                startActivity(intent);
            }
        });
        ImageView gal_8 = (ImageView)findViewById(R.id.gal_8);
        gal_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery8);
                startActivity(intent);
            }
        });
        ImageView gal_9 = (ImageView)findViewById(R.id.gal_9);
        gal_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery9);
                startActivity(intent);
            }
        });
        ImageView gal_10 = (ImageView)findViewById(R.id.gal_10);
        gal_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageActivity.this,Single_gall_picActivity.class);
                intent.putExtra("id",R.drawable.allery10);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.image, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id=item.getItemId();
        switch (id) {

            case R.id.nav_home:
                Intent home = new Intent(ImageActivity.this, MainActivity.class);
                startActivity(home);
                break;
            case R.id.nav_service:
                Intent service = new Intent(ImageActivity.this, SettingActivity.class);
                startActivity(service);
                break;
            case R.id.nav_doctors:
                Intent doctors = new Intent(ImageActivity.this, DoctorsActivity.class);
                startActivity(doctors);
                break;
            case R.id.nav_location:
                Intent location = new Intent(ImageActivity.this, locationActivity.class);
                startActivity(location);
                break;
            case R.id.nav_about:
                Intent about = new Intent(ImageActivity.this, AboutActivity.class);
                startActivity(about);
                break;
            case R.id.nav_branch:
                Intent branch = new Intent(ImageActivity.this, BranchActivity.class);
                startActivity(branch);
                break;
            case R.id.nav_developer:
                Intent dev = new Intent(ImageActivity.this, AboutappActivity.class);
                startActivity(dev);
                break;
            case R.id.nav_gal:
                Intent gal = new Intent(ImageActivity.this, ImageActivity.class);
                startActivity(gal);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
