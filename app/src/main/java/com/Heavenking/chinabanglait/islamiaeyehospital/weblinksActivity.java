package com.Heavenking.chinabanglait.islamiaeyehospital;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class weblinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weblinks);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingTextButton floatingTextButton = (FloatingTextButton) findViewById(R.id.website);
        floatingTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.islamia.org.bd/"));
                startActivity(intent);
            }
        });

        FloatingTextButton floating = (FloatingTextButton) findViewById(R.id.facebook);
        floating.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String facebookUrl = "https://www.facebook.com/iieih.dhaka";
                  try {
                      int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                      if (versionCode >= 3002850) {
                          Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                          startActivity(new Intent(Intent.ACTION_VIEW, uri));;
                      } else {
                          // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                          startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1670975489896129")));
                      }
                  } catch (PackageManager.NameNotFoundException e) {
                      // Facebook is not installed. Open the browser
                      startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                  }
              }
          }
        );
    }
//        public Intent openFacebook(Context context){
//            String facebookUrl = "https://www.facebook.com/Bangladesh.sale.buy";
//            try {
//                int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
//                if (versionCode >= 3002850) {
//                    Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
//                    startActivity(new Intent(Intent.ACTION_VIEW, uri));;
//                } else {
//                    // open the Facebook app using the old method (fb://profile/id or fb://page/id)
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/167008243863577")));
//                }
//            } catch (PackageManager.NameNotFoundException e) {
//                // Facebook is not installed. Open the browser
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
//            }
//
//            return null;
//        }

}
