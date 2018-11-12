package helpybook.as.popo.ltd;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class AircelC extends AppCompatActivity {
//    private com.facebook.ads.InterstitialAd interstitialAd;
//    private com.facebook.ads.AdView adView;
    private com.facebook.ads.InterstitialAd interstitialAd;
    private com.facebook.ads.AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aircel_c);
        interstitialAd =new com.facebook.ads.InterstitialAd(AircelC.this,"796916223847780_797383267134409"'
        ');
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        });
        interstitialAd.loadAd();

        adView = new com.facebook.ads.AdView(AircelC.this, getString(R.string.banner_fb_test), AdSize.BANNER_HEIGHT_50);
        LinearLayout adContainer =(LinearLayout)findViewById(R.id.banner_container1);
        adContainer.addView(adView);
        adView.setAdListener(new AbstractAdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                Toast.makeText(AircelC.this, "Connection issue" + adError.getErrorMessage(),
                        Toast.LENGTH_LONG).show();
            }



        });
        adView.loadAd();

        LinearLayout l1 = (LinearLayout)findViewById(R.id.c1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "121";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "1288";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "198";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l4 = (LinearLayout)findViewById(R.id.c4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9700012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l5 = (LinearLayout)findViewById(R.id.c5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9854012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l6 = (LinearLayout)findViewById(R.id.c6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9852012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l7 = (LinearLayout)findViewById(R.id.c7);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9841012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l8 = (LinearLayout)findViewById(R.id.c8);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9842012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l9 = (LinearLayout)findViewById(R.id.c9);
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9716012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l10 = (LinearLayout)findViewById(R.id.c10);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9858012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l11 = (LinearLayout)findViewById(R.id.c11);
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9738012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l12 = (LinearLayout)findViewById(R.id.c12);
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9809012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l13 = (LinearLayout)findViewById(R.id.c13);
        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9804012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l14 = (LinearLayout)findViewById(R.id.c14);
        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9768012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l15 = (LinearLayout)findViewById(R.id.c15);
        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9856012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l16 = (LinearLayout)findViewById(R.id.c16);
        l16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9853012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l17 = (LinearLayout)findViewById(R.id.c17);
        l17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9803012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l18 = (LinearLayout)findViewById(R.id.c18);
        l18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9782012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l19 = (LinearLayout)findViewById(R.id.c19);
        l19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9842012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l20 = (LinearLayout)findViewById(R.id.c20);
        l20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9807012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l21 = (LinearLayout)findViewById(R.id.c21);
        l21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9807012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l22 = (LinearLayout)findViewById(R.id.c22);
        l22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9851012345";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()) {
            interstitialAd.show();
            interstitialAd.setAdListener(new AbstractAdListener() {

                @Override
                public void onInterstitialDismissed(Ad ad) {
                    super.onInterstitialDismissed(ad);
                    finish();
                }
            });
        }
        else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }
    public void contmail(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.andhrapradesh@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail1(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.assam@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail2(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.bihar@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail3(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"talktoaircel@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail4(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.delhi@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail5(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.j&k@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail6(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.karnataka@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail7(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.kerala@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail8(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.kolkata@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail9(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.mumbai@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail10(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.ne@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail11(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.orissa@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail12(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.punjab@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail13(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.rajasthan@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail14(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.talktoaircel@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail15(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.upeast@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail16(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.upeast@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void contmail17(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care.wb@aircel.co.in"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void webs(View view) {
        String url = "http://www.aircel.com/";
        Intent intent1 = new Intent(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse(url));
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
}
