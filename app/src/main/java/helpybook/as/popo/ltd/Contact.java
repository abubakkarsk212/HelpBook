package helpybook.as.popo.ltd;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Contact extends AppCompatActivity {
private AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString((R.string.contacct_interstitial)));
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
    public void contmail(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"helpybookapp@gmail.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void whatsapp(View view) {
        String smsNumber = "918700600109";
        boolean isWhatsAppInstalled =true;
        if(isWhatsAppInstalled){


            Intent intent1 = new Intent("android.intent.action.MAIN");
            intent1.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            intent1.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber)+"@s.whatsapp.net");
            if (intent1.resolveActivity(getPackageManager()) != null) {
                startActivity(intent1);
            }
            else {
                Uri uri = Uri.parse("market://details?id=com.whatsapp");
                Intent goToMarket = new Intent(Intent.ACTION_VIEW,uri);
                Toast.makeText(this,"WhatsApp is not installed",Toast.LENGTH_SHORT).show();
                startActivity(goToMarket);
            }
        }
    }
}
