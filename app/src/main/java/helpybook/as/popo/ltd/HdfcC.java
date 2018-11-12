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

public class HdfcC extends AppCompatActivity {
private AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdfc_c);
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
                String ph = "18002664332";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "1800221006";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "61606161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l4 = (LinearLayout)findViewById(R.id.c4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9831073333";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l5 = (LinearLayout)findViewById(R.id.c5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l6 = (LinearLayout)findViewById(R.id.c6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9949493333";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l7 = (LinearLayout)findViewById(R.id.c7);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l8 = (LinearLayout)findViewById(R.id.c8);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l9 = (LinearLayout)findViewById(R.id.c9);
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9957193333";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l10 = (LinearLayout)findViewById(R.id.c10);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l11 = (LinearLayout)findViewById(R.id.c11);
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        //
        LinearLayout l12 = (LinearLayout)findViewById(R.id.c12);
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l13 = (LinearLayout)findViewById(R.id.c13);
        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l14 = (LinearLayout)findViewById(R.id.c14);
        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l15 = (LinearLayout)findViewById(R.id.c15);
        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9890603333";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l16 = (LinearLayout)findViewById(R.id.c16);
        l16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l17 = (LinearLayout)findViewById(R.id.c17);
        l17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9898271111";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l18 = (LinearLayout)findViewById(R.id.c18);
        l18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l19 = (LinearLayout)findViewById(R.id.c19);
        l19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9996243333";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l20 = (LinearLayout)findViewById(R.id.c20);
        l20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l21 = (LinearLayout)findViewById(R.id.c21);
        l21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18602676161";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
    }
    public void contmail(View view) {
        String url = "https://leads.hdfcbank.com/applications/webforms/apply/HDFC_Bank_Escalation/index.aspx";
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse(url));
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void webs(View view) {
        String url = "https://www.hdfcbank.com/";
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
