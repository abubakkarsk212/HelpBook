package helpybook.as.popo.ltd;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ProgressBar;

import com.facebook.ads.Ad;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdIconView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.google.android.gms.ads.MobileAds;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    private NativeAd nativeAd, nativeAd1;
    private LinearLayout nativeAdContainer, nativeAdContainer1;
    private LinearLayout adView;
    private NativeBannerAd mNativeBannerAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);

        MobileAds.initialize(this, getResources().getString(R.string.AppId));


    LinearLayout airtelU = (LinearLayout) findViewById(R.id.airtelU);
        airtelU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AirtelU.class);
                startActivity(i1);
            }
        });
        LinearLayout vodafoneU = (LinearLayout) findViewById(R.id.vodafoneU);
        vodafoneU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, VodafoneU.class);
                startActivity(i1);
            }
        });
        LinearLayout ideaU = (LinearLayout) findViewById(R.id.ideaU);
        ideaU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, IdeaU.class);
                startActivity(i1);
            }
        });
        LinearLayout bsnlU = (LinearLayout) findViewById(R.id.bsnlU);
        bsnlU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, BsnlU.class);
                startActivity(i1);
            }
        });
        LinearLayout aircelU = (LinearLayout) findViewById(R.id.aircelU);
        aircelU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AircelU.class);
                startActivity(i1);
            }
        });
        LinearLayout airtelC = (LinearLayout) findViewById(R.id.airtelC);
        airtelC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AirtelC.class);
                startActivity(i1);
            }
        });
        LinearLayout vodaC = (LinearLayout) findViewById(R.id.vodaC);
        vodaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, VodafoneC.class);
                startActivity(i1);
            }
        });
        LinearLayout ideaC = (LinearLayout) findViewById(R.id.ideaC);
        ideaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, IdeaC.class);
                startActivity(i1);
            }
        });
        LinearLayout bsnlC = (LinearLayout) findViewById(R.id.bsnlC);
        bsnlC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, BsnlC.class);
                startActivity(i1);
            }
        });
        LinearLayout aircelC = (LinearLayout) findViewById(R.id.aircelC);
        aircelC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AircelC.class);
                startActivity(i1);
            }
        });
        LinearLayout sbiC = (LinearLayout) findViewById(R.id.sbiC);
        sbiC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, SbiC.class);
                startActivity(i1);
            }
        });
        LinearLayout iciciC = (LinearLayout) findViewById(R.id.iciciC);
       iciciC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, IciciC.class);
                startActivity(i1);
            }
        });
        LinearLayout federalC = (LinearLayout) findViewById(R.id.federalC);
        federalC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, FederalC.class);
                startActivity(i1);
            }
        });
        LinearLayout kotakC = (LinearLayout) findViewById(R.id.kotakC);
        kotakC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, KotakC.class);
                startActivity(i1);
            }
        });
        LinearLayout pnbC = (LinearLayout) findViewById(R.id.pnbC);
        pnbC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, PnbC.class);
                startActivity(i1);
            }
        });
        LinearLayout indianC = (LinearLayout) findViewById(R.id.indianC);
        indianC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, IndianC.class);
                startActivity(i1);
            }
        });
        LinearLayout paytmC = (LinearLayout) findViewById(R.id.paytmC);
        paytmC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, PaytmC.class);
                startActivity(i1);
            }
        });
        LinearLayout hdfcC = (LinearLayout) findViewById(R.id.hdfcC);
        hdfcC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, HdfcC.class);
                startActivity(i1);
            }
        });
        LinearLayout unionC = (LinearLayout) findViewById(R.id.unionC);
        unionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, UnionC.class);
                startActivity(i1);
            }
        });

        LinearLayout airtelBC = (LinearLayout) findViewById(R.id.airtelBC);
        airtelBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AirtelBC.class);
                startActivity(i1);
            }
        });
        LinearLayout rblC = (LinearLayout) findViewById(R.id.rblC);
        rblC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, RblC.class);
                startActivity(i1);
            }
        });
        LinearLayout axisC = (LinearLayout) findViewById(R.id.axisC);
        axisC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AxisC.class);
                startActivity(i1);
            }
        });
        LinearLayout airtelZ = (LinearLayout) findViewById(R.id.airtelZ);
        airtelZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, AirtelZ.class);
                startActivity(i1);
            }
        });
        LinearLayout paytmZ = (LinearLayout) findViewById(R.id.paytmZ);
        paytmZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, PaytmZ.class);
                startActivity(i1);
            }
        });
        LinearLayout fedZ = (LinearLayout) findViewById(R.id.fedZ);
        fedZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, FedbookZ.class);
                startActivity(i1);
            }
        });
        LinearLayout kotakZ = (LinearLayout) findViewById(R.id.kotakZ);
       kotakZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, KotakZ.class);
                startActivity(i1);
            }
        });
        LinearLayout pocZ = (LinearLayout) findViewById(R.id.pocketZ);
        pocZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, PocketZ.class);
                startActivity(i1);
            }
        });
        LinearLayout rblZ = (LinearLayout) findViewById(R.id.rblZ);
        rblZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, RblZ.class);
                startActivity(i1);
            }
        });
        LinearLayout dbsZ = (LinearLayout) findViewById(R.id.dbsZ);
        dbsZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, DbsZ.class);
                startActivity(i1);
            }
        });
        LinearLayout samZ = (LinearLayout) findViewById(R.id.sam);
        samZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, Samsung.class);
                startActivity(i1);
            }
        });
        LinearLayout micro = (LinearLayout) findViewById(R.id.micro);
        micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this,Micromax.class);
                startActivity(i1);
            }
        });
        LinearLayout yu = (LinearLayout) findViewById(R.id.yu);
        yu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this,Yu.class);
                startActivity(i1);
            }
        });
        LinearLayout mi = (LinearLayout) findViewById(R.id.mi);
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this,Mi.class);
                startActivity(i1);
            }
        });
        LinearLayout sony = (LinearLayout) findViewById(R.id.sony);
        sony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this,Sony.class);
                startActivity(i1);
            }
        });
        LinearLayout len = (LinearLayout) findViewById(R.id.leno);
        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this,Lenovo.class);
                startActivity(i1);
            }
        });

        LinearLayout coC = (LinearLayout) findViewById(R.id.contactus);
        coC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Dashboard.this, Contact.class);
                startActivity(i1);
            }
        });

LinearLayout abt =(LinearLayout)findViewById(R.id.page);
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Dashboard.this, About.class);
                startActivity(i1);
            }
        });
        LinearLayout jioUs =(LinearLayout)findViewById(R.id.jious);
        jioUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Dashboard.this, JioUssd.class);
                startActivity(i1);
            }
        });
        LinearLayout jioTel =(LinearLayout)findViewById(R.id.jiotel);
        jioTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Dashboard.this, JioTelecom.class);
                startActivity(i1);
            }
        });
        LinearLayout invite1 =(LinearLayout)findViewById(R.id.invite);
        invite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Dashboard.this, InviteHelpy.class);
                startActivity(i1);
            }
        });




//        LinearLayout dynamicImage =(LinearLayout)findViewById(R.id.dynamic);
//        dynamicImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i1 = new Intent(Dashboard.this, Login.class);
//                startActivity(i1);
//            }
//        });
//-------------------------------For native ad large----------------------------
        nativeAd = new NativeAd(this, getString(R.string.native_fb_large_test));
        //623848994653940_623855291319977
        nativeAd.setAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                // Native ad finished downloading all assets
//                Log.e(TAG, "Native ad finished downloading all assets.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Native ad failed to load
//                Log.e(TAG, "Native ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Native ad is loaded and ready to be displayed
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateAd(nativeAd);
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Native ad clicked
//                Log.d(TAG, "Native ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Native ad impression
//                Log.d(TAG, "Native ad impression logged!");
            }
        });

        // Request an ad
        nativeAd.loadAd();
//------------native ad banner-------------------------------
        mNativeBannerAd = new NativeBannerAd(Dashboard.this, getString(R.string.native_fb_banner_test));
        //623848994653940_626245771080929
        mNativeBannerAd.setAdListener(new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {
// Render the Native Banner Ad Template
                View adView1 = NativeBannerAdView.render(Dashboard.this, mNativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
                LinearLayout nativeBannerAdContainer1 =(LinearLayout) findViewById(R.id.native_banner_ad_container);
                // Add the Native Banner Ad View to your ad container
                nativeBannerAdContainer1.addView(adView1);
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });
        // Initiate a request to load an ad.
        mNativeBannerAd.loadAd();

    }
    public void feedback(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"helpybookapp@gmail.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press again to close HelpyBook", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 3000);



    }
    private void inflateAd(NativeAd nativeAd) {

        nativeAd.unregisterView();

        // Add the Ad view into the ad container.
        nativeAdContainer =(LinearLayout) findViewById(R.id.native_ad_container);
        LayoutInflater inflater = LayoutInflater.from(Dashboard.this);
        // Inflate the Ad view.  The layout referenced should be the one you created in the last step.
        adView = (LinearLayout) inflater.inflate(R.layout.native_ad_fb, nativeAdContainer, false);
        nativeAdContainer.addView(adView);

        // Add the AdChoices icon
        LinearLayout adChoicesContainer =(LinearLayout) findViewById(R.id.ad_choices_container);
        AdChoicesView adChoicesView = new AdChoicesView(Dashboard.this, nativeAd, true);
        adChoicesContainer.addView(adChoicesView, 0);

        // Create native UI using the ad metadata.
        AdIconView nativeAdIcon = adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
        MediaView nativeAdMedia = adView.findViewById(R.id.native_ad_media);
        TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdBody = adView.findViewById(R.id.native_ad_body);
        TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
        Button nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

        // Set the Text.
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

        // Create a list of clickable views
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdCallToAction);
        clickableViews.add(nativeAdMedia);

        // Register the Title and CTA button to listen for clicks.
        nativeAd.registerViewForInteraction(
                adView,
                nativeAdMedia,
                nativeAdIcon,
                clickableViews);

    }


}
