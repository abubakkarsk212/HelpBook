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

public class RblC extends AppCompatActivity {
private AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rbl_c);
        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString((R.string.bankC_interstitial)));
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
                String ph = "18001238040";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "+912261156300";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18001219050";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l4 = (LinearLayout)findViewById(R.id.c4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02262327777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l5 = (LinearLayout)findViewById(R.id.c5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02271190900";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l6 = (LinearLayout)findViewById(R.id.c6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18001238040";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l7 = (LinearLayout)findViewById(R.id.c7);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02243020799";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
    }
    public void contmail(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"customercare@rblbank.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail1(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"cardservices@rblbank.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail2(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"supercardservices@rblbank.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail3(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"ruralbanking@rblbank.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void webs(View view) {
        String url = "https://www.rblbank.com/";
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