package helpybook.as.popo.ltd;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Dashboard.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}
