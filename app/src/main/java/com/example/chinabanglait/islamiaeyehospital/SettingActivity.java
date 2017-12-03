package com.example.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.Button;

public class SettingActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawer;
    NavigationView navigationView;
    Toolbar toolbar=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        Button web = (Button) findViewById(R.id.web);
//        web.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.islamia.org.bd/"));
//                startActivity(intent);
//            }
//        });
//        Button call = (Button) findViewById(R.id.call);
//        call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent callIntent = new Intent(Intent.ACTION_DIAL);
//                callIntent.setData(Uri.parse("tel:09610998333"));
//                startActivity(callIntent);
//            }
//        });
//        Button email = (Button) findViewById(R.id.email);
//        email.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent chooser=null;
//                Intent callIntent = new Intent(Intent.ACTION_SEND);
//                callIntent.setData(Uri.parse("mailto:"));
//                String[] to= {"info@islamia.org.bd"};
//                callIntent.putExtra(Intent.EXTRA_EMAIL,to);
//                callIntent.putExtra(Intent.EXTRA_SUBJECT,"Write Subject");
//                callIntent.putExtra(Intent.EXTRA_TEXT,"Write Message");
//                callIntent.setType("message/rfc822");
//                chooser = Intent.createChooser(callIntent,"Send Email");
//                startActivity(chooser);
//            }
//        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button gp = (Button) findViewById(R.id.gp);
        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,GeneralPActivity.class);
                startActivity(i);
            }
        });
        Button pp = (Button) findViewById(R.id.pp);
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,PrivatePActivity.class);
                startActivity(i);
            }
        });

        Button anas = (Button) findViewById(R.id.anstesia);
        anas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,AnstesiaActivity.class);
                startActivity(i);
            }
        });

        Button cata = (Button) findViewById(R.id.cata);
        cata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,CataActivity.class);
                startActivity(i);
            }
        });

        Button cornea = (Button) findViewById(R.id.cornea);
        cornea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,CorneaActivity.class);
                startActivity(i);
            }
        });

        Button glaucoma = (Button) findViewById(R.id.glaucoma);
        glaucoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,GlaucomaActivity.class);
                startActivity(i);
            }
        });

        Button lowvision = (Button) findViewById(R.id.lowvision);
        lowvision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,LowActivity.class);
                startActivity(i);
            }
        });

        Button neuro = (Button) findViewById(R.id.neuro);
        neuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,NeuroPActivity.class);
                startActivity(i);
            }
        });

        Button mnp = (Button) findViewById(R.id.mnp);
        mnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,MnpActivity.class);
                startActivity(i);
            }
        });

        Button oculo = (Button) findViewById(R.id.oculo);
        oculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,OculoActivity.class);
                startActivity(i);
            }
        });
        Button paedia = (Button) findViewById(R.id.paedia);
        paedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,PaediaActivity.class);
                startActivity(i);
            }
        });

        Button pmb = (Button) findViewById(R.id.pmb);
        pmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,PmbActivity.class);
                startActivity(i);
            }
        });
        Button retina = (Button) findViewById(R.id.retina);
        retina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,RetinaActivity.class);
                startActivity(i);
            }
        });
        Button emergency = (Button) findViewById(R.id.emergency);
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SettingActivity.this,EmergencyActivity.class);
                startActivity(i);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
//        if (id == R.id.facebook) {
//            return true;
//        }

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
                Intent home= new Intent(SettingActivity.this,MainActivity.class);
                startActivity(home);
                break;
            case R.id.nav_service:
                Intent service= new Intent(SettingActivity.this,SettingActivity.class);
                startActivity(service);
                break;
            case R.id.nav_doctors:
                Intent doctors= new Intent(SettingActivity.this,DoctorsActivity.class);
                startActivity(doctors);
                break;
            case R.id.nav_location:
                Intent location= new Intent(SettingActivity.this,locationActivity.class);
                startActivity(location);
                break;
            case R.id.nav_about:
                Intent about= new Intent(SettingActivity.this,AboutActivity.class);
                startActivity(about);
                break;
            case R.id.nav_branch:
                Intent branch= new Intent(SettingActivity.this,BranchActivity.class);
                startActivity(branch);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}