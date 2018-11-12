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

public class IdeaU extends AppCompatActivity {
private AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea_u);
        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString((R.string.ussd_interstitial)));
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
                String ph = "*131*3"+ Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*125"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*125"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l4 = (LinearLayout)findViewById(R.id.c4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*150*10"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l5 = (LinearLayout)findViewById(R.id.c5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*150*20"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l6 = (LinearLayout)findViewById(R.id.c6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*131*1"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l7 = (LinearLayout)findViewById(R.id.c7);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*4"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l8 = (LinearLayout)findViewById(R.id.c8);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l9 = (LinearLayout)findViewById(R.id.c9);
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*4*2"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l10 = (LinearLayout)findViewById(R.id.c10);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*150*06"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l11 = (LinearLayout)findViewById(R.id.c11);
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*150*333"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l12 = (LinearLayout)findViewById(R.id.c12);
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*5"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l13 = (LinearLayout)findViewById(R.id.c13);
        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*191"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l14 = (LinearLayout)findViewById(R.id.c14);
        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l15 = (LinearLayout)findViewById(R.id.c15);
        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*122"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l16 = (LinearLayout)findViewById(R.id.c16);
        l16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*1"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l17 = (LinearLayout)findViewById(R.id.c17);
        l17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*2"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l18 = (LinearLayout)findViewById(R.id.c18);
        l18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*3"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l19 = (LinearLayout)findViewById(R.id.c19);
        l19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*5"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l20 = (LinearLayout)findViewById(R.id.c20);
        l20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*1*6"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l21 = (LinearLayout)findViewById(R.id.c21);
        l21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*2*1"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l22 = (LinearLayout)findViewById(R.id.c22);
        l22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*2*2"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l23 = (LinearLayout)findViewById(R.id.c23);
        l23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*4*5"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l24 = (LinearLayout)findViewById(R.id.c24);
        l24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*5"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l25 = (LinearLayout)findViewById(R.id.c25);
        l25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*6*4"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l26 = (LinearLayout)findViewById(R.id.c26);
        l26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*6*5"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l27 = (LinearLayout)findViewById(R.id.c27);
        l27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*6*6"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l28 = (LinearLayout)findViewById(R.id.c28);
        l28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "*121*4*7*1"+Uri.encode("#");
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });

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
