package af.apps.android.moslslat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends Activity {


    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        imageView = (ImageView)findViewById(R.id.imageView);

        final Thread th = new Thread(){
            @Override
            public void run() {
                   try{ sleep(5500);

                       Intent in1 = new Intent(SplashActivity.this, MainActivity.class);
                       startActivity(in1);
                       finish();

                   }catch (InterruptedException e) {//Sleep
                       System.out.println("Error Sleep" + e.getMessage());}
            }
        };
        th.start();
    }
}
