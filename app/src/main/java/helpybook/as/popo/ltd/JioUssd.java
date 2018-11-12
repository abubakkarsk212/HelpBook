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

public class JioUssd extends AppCompatActivity {
    private AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jio_ussd);
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
                String ph = "1299";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "1991";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "1991";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
    }
    public void textJt(View view) {
        String ph = "56789";
        Intent intentSms = new Intent(Intent.ACTION_VIEW);
        intentSms.setType("vnd.android-dir/mms-sms");
        intentSms.putExtra("address",ph);
        intentSms.putExtra("sms_body", "JT");


        if (intentSms.resolveActivity(getPackageManager()) != null) {
            startActivity(intentSms);
        }

    }
    public void balMes(View view) {
        String ph = "199";
        Intent intentSms = new Intent(Intent.ACTION_VIEW);
        intentSms.setType("vnd.android-dir/mms-sms");
        intentSms.putExtra("address",ph);
        intentSms.putExtra("sms_body", "ADHR");


        if (intentSms.resolveActivity(getPackageManager()) != null) {
            startActivity(intentSms);
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
