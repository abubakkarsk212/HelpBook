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

public class IciciC extends AppCompatActivity {
private  AdView mAdView;
    InterstitialAd mInterstitial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icici_c);
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
                String ph = "18002003344";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l2 = (LinearLayout)findViewById(R.id.c2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "18001038181";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l3 = (LinearLayout)findViewById(R.id.c3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9864667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l4 = (LinearLayout)findViewById(R.id.c4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8102667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l5 = (LinearLayout)findViewById(R.id.c5);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9098667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l6 = (LinearLayout)findViewById(R.id.c6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9021667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l7 = (LinearLayout)findViewById(R.id.c7);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8000667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l8 = (LinearLayout)findViewById(R.id.c8);
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9017667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l9 = (LinearLayout)findViewById(R.id.c9);
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9817667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l10 = (LinearLayout)findViewById(R.id.c10);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9018667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l11 = (LinearLayout)findViewById(R.id.c11);
        l11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8102667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l12 = (LinearLayout)findViewById(R.id.c12);
        l12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8088667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l13 = (LinearLayout)findViewById(R.id.c13);
        l13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9020667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l14 = (LinearLayout)findViewById(R.id.c14);
        l14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9098667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l15 = (LinearLayout)findViewById(R.id.c15);
        l15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9021667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l16 = (LinearLayout)findViewById(R.id.c16);
        l16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9692667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l17 = (LinearLayout)findViewById(R.id.c17);
        l17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7307667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l18 = (LinearLayout)findViewById(R.id.c18);
        l18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7877667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l19 = (LinearLayout)findViewById(R.id.c19);
        l19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7305667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l20 = (LinearLayout)findViewById(R.id.c20);
        l20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7306667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l21 = (LinearLayout)findViewById(R.id.c21);
        l21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8081667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l22 = (LinearLayout)findViewById(R.id.c22);
        l22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8081667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l23 = (LinearLayout)findViewById(R.id.c23);
        l23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8101667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l24 = (LinearLayout)findViewById(R.id.c24);
        l24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07933667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l25 = (LinearLayout)findViewById(R.id.c25);
        l25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07944455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l26 = (LinearLayout)findViewById(R.id.c26);
        l26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08033667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l27 = (LinearLayout)findViewById(R.id.c27);
        l27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08044455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l28 = (LinearLayout)findViewById(R.id.c28);
        l28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07553366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l29 = (LinearLayout)findViewById(R.id.c29);
        l29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06743366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l30 = (LinearLayout)findViewById(R.id.c30);
        l30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01723366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l31 = (LinearLayout)findViewById(R.id.c31);
        l31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01724445500";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l32 = (LinearLayout)findViewById(R.id.c32);
        l32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04433667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l33 = (LinearLayout)findViewById(R.id.c33);
        l33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04444455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l34 = (LinearLayout)findViewById(R.id.c34);
        l34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01353366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l35 = (LinearLayout)findViewById(R.id.c35);
        l35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01133667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l36 = (LinearLayout)findViewById(R.id.c36);
        l36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01144455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l37 = (LinearLayout)findViewById(R.id.c37);
        l37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04843366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l38 = (LinearLayout)findViewById(R.id.c38);
        l38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01243366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l39 = (LinearLayout)findViewById(R.id.c39);
        l39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01244445500";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l40 = (LinearLayout)findViewById(R.id.c40);
        l40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04033667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l41 = (LinearLayout)findViewById(R.id.c41);
        l41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04044455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l42 = (LinearLayout)findViewById(R.id.c42);
        l42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01413366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l43 = (LinearLayout)findViewById(R.id.c43);
        l43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01414445500";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l44 = (LinearLayout)findViewById(R.id.c44);
        l44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "03333667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l45 = (LinearLayout)findViewById(R.id.c45);
        l45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "03344455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l46 = (LinearLayout)findViewById(R.id.c46);
        l46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "05223366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l47 = (LinearLayout)findViewById(R.id.c47);
        l47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "05224445500";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l48 = (LinearLayout)findViewById(R.id.c48);
        l48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02233667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l49 = (LinearLayout)findViewById(R.id.c49);
        l49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02244455000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l50 = (LinearLayout)findViewById(R.id.c50);
        l50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08323366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l51 = (LinearLayout)findViewById(R.id.c51);
        l51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06123366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l52 = (LinearLayout)findViewById(R.id.c52);
        l52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07713366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l53 = (LinearLayout)findViewById(R.id.c53);
        l53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06513344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l54 = (LinearLayout)findViewById(R.id.c54);
        l54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01773366777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l55 = (LinearLayout)findViewById(R.id.c55);
        l55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7306443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l56 = (LinearLayout)findViewById(R.id.c56);
        l56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9864443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l57 = (LinearLayout)findViewById(R.id.c57);
        l57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8102443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l58 = (LinearLayout)findViewById(R.id.c58);
        l58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8103443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l59 = (LinearLayout)findViewById(R.id.c59);
        l59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7304443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l60 = (LinearLayout)findViewById(R.id.c60);
        l60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8306443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l61 = (LinearLayout)findViewById(R.id.c61);
        l61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9017443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l62 = (LinearLayout)findViewById(R.id.c62);
        l62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9817443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l63 = (LinearLayout)findViewById(R.id.c63);
        l63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9018443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l64 = (LinearLayout)findViewById(R.id.c64);
        l64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8102443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l65 = (LinearLayout)findViewById(R.id.c65);
        l65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8088443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l66 = (LinearLayout)findViewById(R.id.c66);
        l66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9020443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l67 = (LinearLayout)findViewById(R.id.c67);
        l67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8103443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l68 = (LinearLayout)findViewById(R.id.c68);
        l68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7304443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l69 = (LinearLayout)findViewById(R.id.c69);
        l69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7735443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l70 = (LinearLayout)findViewById(R.id.c70);
        l70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7307443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l71 = (LinearLayout)findViewById(R.id.c71);
        l71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8955443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l72 = (LinearLayout)findViewById(R.id.c72);
        l72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9025443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l73 = (LinearLayout)findViewById(R.id.c73);
        l73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7306443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l74 = (LinearLayout)findViewById(R.id.c74);
        l74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8303443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l75 = (LinearLayout)findViewById(R.id.c75);
        l75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8303443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l76 = (LinearLayout)findViewById(R.id.c76);
        l76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9832443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l77 = (LinearLayout)findViewById(R.id.c77);
        l77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07933443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l78 = (LinearLayout)findViewById(R.id.c78);
        l78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08033443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l79 = (LinearLayout)findViewById(R.id.c79);
        l79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07553344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l80 = (LinearLayout)findViewById(R.id.c80);
        l80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06743344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l81 = (LinearLayout)findViewById(R.id.c81);
        l81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01723344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l82 = (LinearLayout)findViewById(R.id.c82);
        l82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04433443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l83 = (LinearLayout)findViewById(R.id.c83);
        l83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01353344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l84 = (LinearLayout)findViewById(R.id.c84);
        l84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01353344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l85 = (LinearLayout)findViewById(R.id.c85);
        l85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04843344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l86 = (LinearLayout)findViewById(R.id.c86);
        l86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01243344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l87 = (LinearLayout)findViewById(R.id.c87);
        l87 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04033443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l88 = (LinearLayout)findViewById(R.id.c88);
        l88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01413344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l89 = (LinearLayout)findViewById(R.id.c89);
        l89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "03333443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l90 = (LinearLayout)findViewById(R.id.c90);
        l90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "05223344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l91 = (LinearLayout)findViewById(R.id.c91);
        l91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02233443399";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l92 = (LinearLayout)findViewById(R.id.c92);
        l92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08323344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l93 = (LinearLayout)findViewById(R.id.c93);
        l93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06123344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l94 = (LinearLayout)findViewById(R.id.c94);
        l94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07713344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l95 = (LinearLayout)findViewById(R.id.c95);
        l95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06513344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l96 = (LinearLayout)findViewById(R.id.c96);
        l96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01773344339";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l97 = (LinearLayout)findViewById(R.id.c97);
        l97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7306446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l98 = (LinearLayout)findViewById(R.id.c98);
        l98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8822446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l99 = (LinearLayout)findViewById(R.id.c99);
        l99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8102446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l100 = (LinearLayout)findViewById(R.id.c100);
        l100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7879446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l101 = (LinearLayout)findViewById(R.id.c101);
        l101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7304446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l102 = (LinearLayout)findViewById(R.id.c102);
        l102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8690446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l103 = (LinearLayout)findViewById(R.id.c103);
        l103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9541446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l104 = (LinearLayout)findViewById(R.id.c104);
        l104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9625446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l105 = (LinearLayout)findViewById(R.id.c105);
        l105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9018446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l106 = (LinearLayout)findViewById(R.id.c106);
        l106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8102446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l107 = (LinearLayout)findViewById(R.id.c107);
        l107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9019446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l108 = (LinearLayout)findViewById(R.id.c108);
        l108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8590446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l109 = (LinearLayout)findViewById(R.id.c109);
        l109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7879446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l110 = (LinearLayout)findViewById(R.id.c110);
        l110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7304446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l111 = (LinearLayout)findViewById(R.id.c111);
        l111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9778446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l112 = (LinearLayout)findViewById(R.id.c112);
        l112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9023446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l113 = (LinearLayout)findViewById(R.id.c113);
        l113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9529446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l114 = (LinearLayout)findViewById(R.id.c114);
        l114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8695446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l115 = (LinearLayout)findViewById(R.id.c115);
        l115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7306446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l116 = (LinearLayout)findViewById(R.id.c116);
        l116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8303446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l117 = (LinearLayout)findViewById(R.id.c117);
        l117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "8303446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l118 = (LinearLayout)findViewById(R.id.c118);
        l118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "9641446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l119 = (LinearLayout)findViewById(R.id.c119);
        l119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07933446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l120 = (LinearLayout)findViewById(R.id.c120);
        l120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08033446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l121 = (LinearLayout)findViewById(R.id.c121);
        l121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08044456000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l122 = (LinearLayout)findViewById(R.id.c122);
        l122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07553344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l123 = (LinearLayout)findViewById(R.id.c123);
        l123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07554445600";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l124 = (LinearLayout)findViewById(R.id.c124);
        l124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06743344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l125 = (LinearLayout)findViewById(R.id.c125);
        l125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01723344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l126 = (LinearLayout)findViewById(R.id.c126);
        l126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01724445600";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l127 = (LinearLayout)findViewById(R.id.c127);
        l127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04433446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l128 = (LinearLayout)findViewById(R.id.c128);
        l128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04444456000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l129 = (LinearLayout)findViewById(R.id.c129);
        l129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01353344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l130 = (LinearLayout)findViewById(R.id.c130);
        l130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01133446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l131 = (LinearLayout)findViewById(R.id.c131);
        l131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01144456000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l132 = (LinearLayout)findViewById(R.id.c132);
        l132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04843344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l133 = (LinearLayout)findViewById(R.id.c133);
        l133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01243344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l134 = (LinearLayout)findViewById(R.id.c134);
        l134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01244445600";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l135 = (LinearLayout)findViewById(R.id.c135);
        l135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04033446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l136 = (LinearLayout)findViewById(R.id.c136);
        l136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "04044456000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l137 = (LinearLayout)findViewById(R.id.c137);
        l137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01413344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l138 = (LinearLayout)findViewById(R.id.c138);
        l138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01414445600";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l139 = (LinearLayout)findViewById(R.id.c139);
        l139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "03333446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l140 = (LinearLayout)findViewById(R.id.c140);
        l140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "03344456000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l141 = (LinearLayout)findViewById(R.id.c141);
        l141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "05223344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l142 = (LinearLayout)findViewById(R.id.c142);
        l142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02233446699";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l143 = (LinearLayout)findViewById(R.id.c143);
        l143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "02244456000";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l144 = (LinearLayout)findViewById(R.id.c144);
        l144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "08323344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l145 = (LinearLayout)findViewById(R.id.c145);
        l145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06123344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l146 = (LinearLayout)findViewById(R.id.c146);
        l146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07713344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l147 = (LinearLayout)findViewById(R.id.c147);
        l147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "07714445600";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l148 = (LinearLayout)findViewById(R.id.c148);
        l148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "06513344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l149 = (LinearLayout)findViewById(R.id.c149);
        l149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "01773344669";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });
        LinearLayout l150 = (LinearLayout)findViewById(R.id.c150);
        l150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ph = "7306667777";
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +ph));
                startActivity(i);
            }
        });

    }
    public void contmail(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        intent1.putExtra(Intent.EXTRA_EMAIL, new String[]{"care@icicibank.com"});
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void webs(View view) {
        String url = "https://www.icicibank.com/";
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
