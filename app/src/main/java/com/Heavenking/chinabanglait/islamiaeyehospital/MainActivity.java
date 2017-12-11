package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Image Slide //
        viewPager  = (ViewPager) findViewById(R.id.viewPager);
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(this);
        viewPager.setAdapter(viewPageAdapter);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 2000);
        // Image Slide //

        @SuppressLint("WrongViewCast") TextView btn1 = (TextView) findViewById(R.id.exit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                System.exit(0);
            }
        });
        ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        ImageButton shit = (ImageButton) findViewById(R.id.gallery);
        shit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ImageActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });
        TextView gallery_text = (TextView) findViewById(R.id.gallery_text);
        gallery_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ImageActivity.class);
                startActivity(i);
            }
        });
        TextView service = (TextView) findViewById(R.id.service);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(i);
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SettingActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });

        TextView eyetips = (TextView) findViewById(R.id.eyetips);
        eyetips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,EyeTipsActivity.class);
                startActivity(i);
            }
        });
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,EyeTipsActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DoctorsActivity.class);
                startActivity(i);
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DoctorsActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AppointmentActivity.class);
                startActivity(i);
            }
        });
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AppointmentActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,weblinksActivity.class);
                startActivity(i);
            }
        });
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,weblinksActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });

        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BranchActivity.class);
                startActivity(i);
            }
        });
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BranchActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });

        TextView btn2 = (TextView) findViewById(R.id.about);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);
            }
        });
        imageButton = (ImageButton) findViewById(R.id.imageButton7);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });

        TextView faqs = (TextView) findViewById(R.id.faqs);
        faqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,faqsActivity.class);
                startActivity(i);
            }
        });
        ImageButton xxxx = (ImageButton) findViewById(R.id.faqsimage);
        xxxx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,faqsActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });
        TextView feedback = (TextView) findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,feedbackActivity.class);
                startActivity(i);
            }
        });
        ImageButton feedbackimage = (ImageButton) findViewById(R.id.feedbackimage);
        feedbackimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,feedbackActivity.class);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                startActivity(i);
            }
        });
        TextView btn3 = (TextView) findViewById(R.id.location);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,locationActivity.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,locationActivity.class);
                startActivity(i);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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
                callIntent.putExtra(Intent.EXTRA_SUBJECT,"Your Subject Here");
                callIntent.putExtra(Intent.EXTRA_TEXT,"Write Your Message Here");
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
        getMenuInflater().inflate(R.menu.main, menu);
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
                Intent home= new Intent(MainActivity.this,MainActivity.class);
                startActivity(home);
                break;
                case R.id.nav_service:
                Intent service= new Intent(MainActivity.this,SettingActivity.class);
                startActivity(service);
                break;
                case R.id.nav_doctors:
                Intent doctors= new Intent(MainActivity.this,DoctorsActivity.class);
                startActivity(doctors);
                break;
                case R.id.nav_location:
                Intent location= new Intent(MainActivity.this,locationActivity.class);
                startActivity(location);
                break;
                case R.id.nav_about:
                Intent about= new Intent(MainActivity.this,AboutActivity.class);
                startActivity(about);
                break;
                case R.id.nav_branch:
                Intent branch= new Intent(MainActivity.this,BranchActivity.class);
                startActivity(branch);
                break;
                case R.id.nav_developer:
                Intent dev= new Intent(MainActivity.this,AboutappActivity.class);
                startActivity(dev);
                break;
                case R.id.nav_gal:
                Intent gal= new Intent(MainActivity.this,ImageActivity.class);
                startActivity(gal);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
//        drawer.setDrawerShadow(R.drawable.drawer_item_bg,
//                GravityCompat.START);
        return true;
    }

    // Auto Image Slide //
    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    }else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
    // Auto Image Slide //

}
