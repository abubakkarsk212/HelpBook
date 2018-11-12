package helpybook.as.popo.ltd;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Login extends AppCompatActivity {
EditText et;
//    private static String uniqueIdentifier = null;
//    private static final String UNIQUE_ID = "UNIQUE_ID";
//    private static final long ONE_HOUR_MILLI = 60*60*1000;
//    private static final String TAG = "FirebasePhoneNumAuth";

//    public boolean isComplete(){
//        boolean isCom ;
//        EditText et = (EditText)findViewById(R.id.edit);
//        String no = et.getText().toString();
//        if(no.length() == 5){
//            isCom = true;
//        }
//        else{
//            isCom = false;
//        }
//        return isCom;
//    }
 FirebaseAuth mAuth;
String codeSent;
    public void otp(View view){
         et = (EditText)findViewById(R.id.edit);
        String size = et.getText().toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//  et = (EditText)findViewById(R.id.edit);
//        String size = et.getText().toString();
        Button btn = (Button)findViewById(R.id.next1);

//        if(isComplete()){
//            btn.setEnabled(true);
//            btn.setBackgroundColor(Color.GREEN);
//
//        }
//        else{
//            btn.setEnabled(false);
//            btn.setBackgroundColor(Color.GRAY);
//        }
//
mAuth = FirebaseAuth.getInstance();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(et.getText().toString().length()==10) {
                    sendVerificationCode();
                    Intent i = new Intent(Login.this, OtpActivity.class);
                    String text = getPhNo();
                    i.putExtra("text", text);
                    startActivity(i);
                }
                else{
                    if(et.getText().toString().length()==0){
                        Toast.makeText(Login.this,"Please enter phone number",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(Login.this, "Wrong phone number", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }







  public void sendVerificationCode(){
    PhoneAuthProvider.getInstance().verifyPhoneNumber(getPhNo(),60,TimeUnit.SECONDS,this,mCallbacks);
  }

    public String getPhNo(){
        et = (EditText)findViewById(R.id.edit);
        String no = et.getText().toString();
        return no;
    }

PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
    @Override
    public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
OtpActivity ot = new OtpActivity();

    }

    @Override
    public void onVerificationFailed(FirebaseException e) {

    }

    @Override
    public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        // s is the code
        super.onCodeSent(s, forceResendingToken);
      codeSent = s;
    }
};
}
