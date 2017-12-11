package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DoctorsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView mlistView;
    int[] images = {
            R.drawable.doc1,
            R.drawable.doc2,
            R.drawable.do3,
            R.drawable.do4,
            R.drawable.do5,
            R.drawable.do6,
            R.drawable.do7,
            R.drawable.do8,
            R.drawable.do9,
            R.drawable.do10,
            R.drawable.do11,
            R.drawable.do12,
            R.drawable.do13,
            R.drawable.do14,
            R.drawable.do15,
            R.drawable.do16,
            R.drawable.do17,
            R.drawable.do18,
            R.drawable.do19,
            R.drawable.do20,
            R.drawable.do21,
            R.drawable.do22,
            R.drawable.do23,
            R.drawable.do24,
            R.drawable.do25,
            R.drawable.do26,
            R.drawable.do27,
            R.drawable.do28,
            R.drawable.do29,
            R.drawable.do30,
            R.drawable.do31,
            R.drawable.do32,
            R.drawable.do33,
            R.drawable.do34,
            R.drawable.do35,
            R.drawable.do36,
            R.drawable.do37,
            R.drawable.do38,
            R.drawable.do39,
            R.drawable.do40,
            R.drawable.do41,
            R.drawable.do42,
            };

    String[] Names = {"Dr. MD A Maleque",
            "Dr. MdShafi Khan",
            "Dr. MdAbdus Salam",
            "Dr. Ahmed Zahir Bin Zia",
            "Dr. Chandana Sultana",
            "Dr. M A Majid Khan",
            "Dr. Mahmood Mujtaba",
            "Dr. Mostafizur Rahman",
            "Dr. MuntakimShahid",
            "Dr. NazmunNahar",
            "Professor Dr.Sarwar Alam",
            "Dr. Zafrul Hassan",
            "Dr. Syed Jahangir Kabir",
            "Dr. BipulKumerSarker",
            "Dr. Sibgatullah",
            "Dr. NazmulHaqueRobi",
            "Dr. Sadia Sultana",
            "Dr. Riffat Rashid",
            "Dr. Mastura Khatun",
            "Dr. Mostofa Hossain",
            "Dr. Quazi Sazzad Ifhtekhar",
            "Dr. Nazmun Nahar",
            "Dr. Sanjoy Kumar Das",
            "Dr. MdMominul Islam",
            "Dr. Mohammad Ibn Abdul Malek",
            "Dr. Arif Hayat Khan Pathan",
            "Dr. Azhar Ali",
            "Dr. ShahidaBanu",
            "Dr. Md Shamsudduha Bhuiya",
            "Dr. Salma Manjur",
            "Dr. Akhter Jahan Sayra",
            "Professor ASM Kamal Uddin",
            "Dr. Rashed Alam",
            "Dr. Tarikul Islam",
            "Dr. Ashim Kumar",
            "Dr. Nazmus Sakeb",
            "Dr. Shifat Toufique",
            "Dr. Saleha Sultana Pushpo",
            "Dr. Mostafa Zaman",
            "Dr. Rajib",
            "Dr. Ibrahim",
            "Dr. Kabirul Islam",
    };
    String[] Desig = {"Consultant, Anesthesia",
            "Consultant, Cornea & Anterior Segment.",
            "Consultant, Cornea and Anterior Segment",
            "Consultant, Cataract",
            "Consultant, Cornea & Anterior Segment",
            "Consultant, Cataract",
            "Consultant, Cornea & Anterior Segment",
            "Consultant, Cornea & Anterior Segment",
            "Consultant, Cornea & Anterior Segment",
            "Consultant, Retina ",
            "Consultant, Cornea ",
            "Consultant, Neuro-ophthalmology",
            "Consultant, Cataract and Corneal",
            "Consultant, Glaucoma",
            "Consultant, Glaucoma Ophthalmology",
            "Consultant, Glaucoma",
            "Consultant, Neuro-ophthalmology",
            "Consultant, Oculoplasty",
            "Consultant, Oculoplasty",
            "Consultant, Oculoplasty",
            "Consultant, Pediatric Ophthalmology",
            "Consultant,",
            "Consultant, Pediatric Ophthalmology",
            "Consultant, Vitreo-Retinal Surgeon",
            "Consultant, Retina",
            "Consultant, Retina",
            "Consultant, Retina",
            "Consultant, GOPD",
            "Consultant, Anesthesia",
            "Consultant, Anesthesia",
            "Consultant, Anesthesia",
            "Consultant, Glaucoma",
            "Consultant, Pathology",
            "Consultant, Education",
            "Consultant, Cornea",
            "Consultant, Pediatric",
            "Consultant, Cornea",
            "Consultant, POPD",
            "Consultant, Pediatric",
            "Consultant, Cardiology",
            "Consultant, Cardiology",
            "Consultant, Cardiology",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mlistView = (ListView) findViewById(R.id.listView);
        CustomDoctor doctor = new CustomDoctor();
        mlistView.setAdapter(doctor);

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

    class CustomDoctor extends BaseAdapter{
        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.doctorslist,null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView = (TextView) view.findViewById(R.id.textView);
            TextView textView2 = (TextView) view.findViewById(R.id.textView2);
            imageView.setImageResource(images[position]);
            textView.setText(Names[position]);
            textView2.setText(Desig[position]);
            return view;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.doctors, menu);
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
                Intent home= new Intent(DoctorsActivity.this,MainActivity.class);
                startActivity(home);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case R.id.nav_service:
                Intent service= new Intent(DoctorsActivity.this,SettingActivity.class);
                startActivity(service);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case R.id.nav_doctors:
                Intent doctors= new Intent(DoctorsActivity.this,DoctorsActivity.class);
                startActivity(doctors);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case R.id.nav_location:
                Intent location= new Intent(DoctorsActivity.this,locationActivity.class);
                startActivity(location);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case R.id.nav_about:
                Intent about= new Intent(DoctorsActivity.this,AboutActivity.class);
                startActivity(about);
                break;
            case R.id.nav_branch:
                Intent branch= new Intent(DoctorsActivity.this,BranchActivity.class);
                startActivity(branch);
                break;
                case R.id.nav_developer:
                Intent dev= new Intent(DoctorsActivity.this,AboutappActivity.class);
                startActivity(dev);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
