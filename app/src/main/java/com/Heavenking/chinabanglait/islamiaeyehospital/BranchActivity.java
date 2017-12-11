package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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


public class BranchActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawer;
    NavigationView navigationView;
    Toolbar toolbar=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);

        ImageView call = (ImageView)navigationView.getHeaderView(0).findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:09610998333"));
                startActivity(callIntent);
            }
        });
        ImageView email = (ImageView)navigationView.getHeaderView(0).findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
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
        ImageView web = (ImageView)navigationView.getHeaderView(0).findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.islamia.org.bd/"));
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
        getMenuInflater().inflate(R.menu.branch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        //here is the main place where we need to work on.
        int id=item.getItemId();
        switch (id){

            case R.id.nav_home:
                Intent home= new Intent(BranchActivity.this,MainActivity.class);
                startActivity(home);
                break;
            case R.id.nav_service:
                Intent service= new Intent(BranchActivity.this,SettingActivity.class);
                startActivity(service);
                break;
            case R.id.nav_doctors:
                Intent doctors= new Intent(BranchActivity.this,DoctorsActivity.class);
                startActivity(doctors);
                break;
            case R.id.nav_location:
                Intent location= new Intent(BranchActivity.this,locationActivity.class);
                startActivity(location);
                break;
            case R.id.nav_about:
                Intent about= new Intent(BranchActivity.this,AboutActivity.class);
                startActivity(about);
                break;
            case R.id.nav_branch:
                Intent branch= new Intent(BranchActivity.this,BranchActivity.class);
                startActivity(branch);
                break;
                case R.id.nav_developer:
                Intent dev= new Intent(BranchActivity.this,AboutappActivity.class);
                startActivity(dev);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void ChangeFragment(View view){
        Fragment fragment;

        if (view == findViewById(R.id.button)) {
            fragment = new FragmentOne();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.button2)) {
            fragment = new FragmentTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.button3)) {
            fragment = new FragmentThree();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place,fragment);
            ft.commit();
        }
    }






}
