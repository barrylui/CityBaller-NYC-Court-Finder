package barrylui.nycbball;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifTextView;

public class SplashScreen extends Activity{

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 4600;
    private static int CLICK_TIME = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        RelativeLayout RL = (RelativeLayout) findViewById(R.id.relative);
        RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                GifTextView GIF = (GifTextView) findViewById(R.id.gif);
                ImageView IV = (ImageView) findViewById(R.id.imageViewstop);
                GIF.setVisibility(View.INVISIBLE);
                IV.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

                    @Override
                    public void run() {
                        // This method will be executed once the timer is over
                        // Start your app main activity
                        Intent o = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(o);

                        // close this activity
                        finish();
                    }
                }, CLICK_TIME);
            }
        });


        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
