package helpybook.as.popo.ltd;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class IdeaC extends AppCompatActivity {
private AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea_c);
        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString((R.string.telecomC_interstitial)));
        AdRequest ad = new AdRequest.Builder().build();
        mInterstitial.loadAd(ad);

        mAdView = (AdView) findViewById(R.id.adViewcontact);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest1);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(), "No internet connection", Toast.LENGTH_SHORT).show();
                super.onAdFailedToLoad(errorCode);
            }
        });
        LinearLayout l1 = (LinearLayout)findViewById(R.id.c1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "12345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9848012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l4 = (LinearLayout)findViewById(R.id.c4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9848009198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l5 = (LinearLayout)findViewById(R.id.c5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9085012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l6 = (LinearLayout)findViewById(R.id.c6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9085000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l7 = (LinearLayout)findViewById(R.id.c7);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9708012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l8 = (LinearLayout)findViewById(R.id.c8);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9708000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });

        LinearLayout l10 = (LinearLayout)findViewById(R.id.c10);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9891012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l11 = (LinearLayout)findViewById(R.id.c11);
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8744000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l12 = (LinearLayout)findViewById(R.id.c12);
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9824012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l13 = (LinearLayout)findViewById(R.id.c13);
        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9824000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l14 = (LinearLayout)findViewById(R.id.c14);
        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9812012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l15 = (LinearLayout)findViewById(R.id.c15);
        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8684000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l16 = (LinearLayout)findViewById(R.id.c16);
        l16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9882012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l17 = (LinearLayout)findViewById(R.id.c17);
        l17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9882900198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l18 = (LinearLayout)findViewById(R.id.c18);
        l18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9086012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l19 = (LinearLayout)findViewById(R.id.c19);
        l19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9086046198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });

        LinearLayout l21 = (LinearLayout)findViewById(R.id.c21);
        l21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9844012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l20 = (LinearLayout)findViewById((R.id.c20)) ;
        l20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9844000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l22 = (LinearLayout)findViewById(R.id.c22);
        l22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9847112345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l23 = (LinearLayout)findViewById(R.id.c23);
        l23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9947000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
//        LinearLayout l24 = (LinearLayout)findViewById(R.id.c24);
//        l24.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String ph = "";
//                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
//                startActivity(i);
//            }
//        });
//        LinearLayout l25 = (LinearLayout)findViewById(R.id.c25);
//        l25.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String ph = "07944455000";
//                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
//                startActivity(i);
//            }
//        });
        LinearLayout l26 = (LinearLayout)findViewById(R.id.c26);
        l26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9088012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l27 = (LinearLayout)findViewById(R.id.c27);
        l27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9088100198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l28 = (LinearLayout)findViewById(R.id.c28);
        l28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9826012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l29 = (LinearLayout)findViewById(R.id.c29);
        l29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9826000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l30 = (LinearLayout)findViewById(R.id.c30);
        l30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9822012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l31 = (LinearLayout)findViewById(R.id.c31);
        l31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9822000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
//        LinearLayout l32 = (LinearLayout)findViewById(R.id.c32);
//        l32.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String ph = "";
//                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
//                startActivity(i);
//            }
//        });
        LinearLayout l33 = (LinearLayout)findViewById(R.id.c33);
        l33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9702012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l34 = (LinearLayout)findViewById(R.id.c34);
        l34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9702000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l35 = (LinearLayout)findViewById(R.id.c35);
        l35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9090012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l36 = (LinearLayout)findViewById(R.id.c36);
        l36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9090000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l37 = (LinearLayout)findViewById(R.id.c37);
        l37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9814012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l38 = (LinearLayout)findViewById(R.id.c38);
        l38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9781500198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l39 = (LinearLayout)findViewById(R.id.c39);
        l39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9887012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l40 = (LinearLayout)findViewById(R.id.c40);
        l40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9887010198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
//        LinearLayout l41 = (LinearLayout)findViewById(R.id.c41);
//        l41.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String ph = "04044455000";
//                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
//                startActivity(i);
//            }
//        });
        LinearLayout l42 = (LinearLayout)findViewById(R.id.c42);
        l42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9092012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l43 = (LinearLayout)findViewById(R.id.c43);
        l43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9092000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l44 = (LinearLayout)findViewById(R.id.c44);
        l44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9093012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l45 = (LinearLayout)findViewById(R.id.c45);
        l45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9093100198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l46 = (LinearLayout)findViewById(R.id.c46);
        l46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9089012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l47 = (LinearLayout)findViewById(R.id.c47);
        l47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9089000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l48 = (LinearLayout)findViewById(R.id.c48);
        l48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9889012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l49 = (LinearLayout)findViewById(R.id.c49);
        l49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8576000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l50 = (LinearLayout)findViewById(R.id.c50);
        l50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9837012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l51 = (LinearLayout)findViewById(R.id.c51);
        l51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8941000198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
    }
    public void webs(View view) {
        String url = "http://www.ideacellular.com/";
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse(url));
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    @Override
    public void onBackPressed() {
        if (mInterstitial.isLoaded()) {
            mInterstitial.show();
            mInterstitial.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        } else {
            super.onBackPressed();
        }
    }
}
