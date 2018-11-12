package helpybook.as.popo.ltd;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

public class OtpActivity extends AppCompatActivity {
TextView tick ;
    EditText et1;
    FirebaseAuth mAuth;

    public void phoneNo(View view){
       EditText et1 = (EditText)findViewById(R.id.editotp);
        String size = et1.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        Intent i =getIntent();
        String text =i.getStringExtra("text");
        TextView no1 = (TextView)findViewById(R.id.noOtp);
        no1.setText(text);
        et1 = (EditText)findViewById(R.id.editotp);
        Button btn = (Button)findViewById(R.id.next12);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if(et1.getText().toString().length()==0){
                        Toast.makeText(OtpActivity.this,"Please enter the Otp",Toast.LENGTH_SHORT).show();
                    }
                    else if(et1.getText().toString().length()<6){
                        Toast.makeText(OtpActivity.this, "Wrong Otp", Toast.LENGTH_SHORT).show();
                    }
                verifySignInCode();
            }
        });


        tick = (TextView)findViewById(R.id.ticking);
        new CountDownTimer(60000,1000){
            @Override
            public void onTick(long milliUnitFinished) {
                tick.setText("" +milliUnitFinished /1000);
            }

            @Override
            public void onFinish() {
                tick.setText("Resend");
            }
        }.start();
}
    public void verifySignInCode(){
        Login ad = new Login();
        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(ad.codeSent,ad.getPhNo());
        signInWithPhoneAuthCredential(credential);
    }
    public void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Intent i = new Intent(OtpActivity.this, ReferDashboard.class);
                            startActivity(i);
                            // ...
                        } else {
                            // Sign in failed, display a message and update the UI
                            if(task.getException() instanceof FirebaseAuthInvalidCredentialsException){
                                Toast.makeText(OtpActivity.this,"Invalid Otp",Toast.LENGTH_SHORT).show();
                            }
                            }
                        }
                    });

    }
}
