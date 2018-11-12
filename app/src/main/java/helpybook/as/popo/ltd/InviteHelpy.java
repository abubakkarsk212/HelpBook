package helpybook.as.popo.ltd;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class InviteHelpy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_helpy);
    }

    public void gmail(View view) {
        Intent intent1 = new Intent(Intent.ACTION_SENDTO);
        intent1.setData(Uri.parse("mailto:"));
        String link = "http://play.google.com/store/apps/details?id=helpybook.as.popo.ltd";
        String subject = "HelpyBook - A new app for all your USSD's , Customer care no's and suggestions";
        intent1.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent1.putExtra(Intent.EXTRA_TEXT,"Hey!" +
                "\n I got a new awesome app called HelpyBook that lets you find all important USSD's codes of Operator , Customer Care No- Emails, Suggestions and connect directly with one tap.No need to call manually, Just tap the icon and it will automatically connect the call, all in one go.\n\n Try it :"+ " "+ link);
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
    public void text(View view) {
        Intent intentSms = new Intent(Intent.ACTION_VIEW);
        intentSms.setType("vnd.android-dir/mms-sms");
        String link = "http://play.google.com/store/apps/details?id=helpybook.as.popo.ltd";
        intentSms.putExtra("sms_body", "Hey!" +
                "\n I got a new awesome app called HelpyBook that lets you find all important USSD's codes of Operator , Customer Care No- Emails, Suggestions and connect directly with one tap.No need to call manually, Just tap the icon and it will automatically connect the call, all in one go.\n\n Try it :" + " " + link);


        if (intentSms.resolveActivity(getPackageManager()) != null) {
            startActivity(intentSms);
        }

    }
    public void whatsapp(View view) {
        boolean isWhatsAppInstalled = true;
        if (isWhatsAppInstalled) {
            Intent intentW = new Intent();
            intentW.setAction(Intent.ACTION_SEND);
            String link = "http://play.google.com/store/apps/details?id=helpybook.as.popo.ltd";
            intentW.setType("text/plain");
            intentW.setPackage("com.whatsapp");
            intentW.putExtra(Intent.EXTRA_TEXT, "Hey!" +
                    "\n I got a new awesome app called HelpyBook that lets you find all important USSD's codes of Operator , Customer Care No- Emails, Suggestions and connect directly with one tap.No need to call manually, Just tap the icon and it will automatically connect the call, all in one go.\n\n Try it :" + " " + link);
            if (intentW.resolveActivity(getPackageManager()) != null) {
                startActivity(intentW);
            } else {
                Uri uri = Uri.parse("market://details?id=com.whatsapp");
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                Toast.makeText(this, "WhatsApp is not installed", Toast.LENGTH_SHORT).show();
                startActivity(goToMarket);
            }
        }
    }


}
