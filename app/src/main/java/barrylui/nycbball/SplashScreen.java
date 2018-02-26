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


/* ------------------------------------------------------------------------
 * This is the SplashScreen for CityBaller
 * This screen is the entry point for the app and features an animated logo
 * -------------------------------------------------------------------------
 */
public class SplashScreen extends Activity{

    private static int ANIMATION_TIME = 4600; //how much time system allows for animated logo to play before activity launches landing page activity
    private static int STATICLOGO_TIME = 1000; //How much time the activity will display static logo if the user taps the screen
    Handler mHandler;
    Runnable mRunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Display splash screen with gif for 4.6 seconds then launch LandingPage with welcome fragment
        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent o = new Intent(SplashScreen.this, LandingPage.class);
                startActivity(o);
                finish();
            }
        };
        //If user taps the screen during the splash screen with gif, immediately launch main activity and skip the animation
        RelativeLayout RL = (RelativeLayout) findViewById(R.id.relative);
        RL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mHandler.removeCallbacks(mRunnable);
                mHandler.postDelayed(mRunnable, STATICLOGO_TIME);
                GifTextView GIF = (GifTextView) findViewById(R.id.animatedlogo);
                ImageView IV = (ImageView) findViewById(R.id.logoimage);
                GIF.setVisibility(View.INVISIBLE);
                IV.setVisibility(View.VISIBLE);
            }
        });

        mHandler.postDelayed(mRunnable, ANIMATION_TIME);
    }
}
