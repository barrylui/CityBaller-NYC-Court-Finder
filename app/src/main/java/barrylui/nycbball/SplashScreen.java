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
    Handler mHandler;
    Runnable mRunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent o = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(o);

                // close this activity
                finish();
            }
        };


        RelativeLayout RL = (RelativeLayout) findViewById(R.id.relative);
        RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mHandler.removeCallbacks(mRunnable);
                mHandler.postDelayed(mRunnable, CLICK_TIME);
                GifTextView GIF = (GifTextView) findViewById(R.id.gif);
                ImageView IV = (ImageView) findViewById(R.id.imageViewstop);
                GIF.setVisibility(View.INVISIBLE);
                IV.setVisibility(View.VISIBLE);
            }
        });

        mHandler.postDelayed(mRunnable, SPLASH_TIME_OUT);
    }
}
