package com.example.madee.gpstest;

import android.content.Context;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.DrawableImageViewTarget;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.J);
        final ImageView imageView1 = (ImageView) findViewById(R.id.j1);
        final ImageView imageView2 = (ImageView) findViewById(R.id.j2);
        final ImageView imageView3 = (ImageView) findViewById(R.id.j3);
        final ImageView imageView4 = (ImageView) findViewById(R.id.j4);
        final ImageView imageView5 = (ImageView) findViewById(R.id.j5);
        final ImageView imageView6 = (ImageView) findViewById(R.id.j6);
        final ImageView imageView7 = (ImageView) findViewById(R.id.j7);
        final ImageView imageView8 = (ImageView) findViewById(R.id.j8);
         final ImageView imageView9 = (ImageView) findViewById(R.id.j9);
        final ImageView imageView10 = (ImageView) findViewById(R.id.j10);
        final ImageView imageView11 = (ImageView) findViewById(R.id.j11);
        final ImageView imageView12 = (ImageView) findViewById(R.id.j12);
        ImageView marker1 = (ImageView) findViewById(R.id.m1);

        imageView.setVisibility(View.INVISIBLE);
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
        imageView7.setVisibility(View.INVISIBLE);
        imageView8.setVisibility(View.INVISIBLE);
        imageView9.setVisibility(View.INVISIBLE);
        imageView10.setVisibility(View.INVISIBLE);
        imageView11.setVisibility(View.INVISIBLE);
        imageView12.setVisibility(View.INVISIBLE);
        marker1.setVisibility(View.INVISIBLE);

        Location loc;
        GPSlocation gpsLocation = new GPSlocation(this);
        loc = gpsLocation.getLoc();
        double current_lati = loc.getLatitude();
        double current_long = loc.getLongitude();///waghera waghera
        double match_lati= 24.856537 ;
        double match_long = 67.279143;

        if ((current_lati == match_lati) && (current_long == match_long)){

            Context context = getApplicationContext();
            CharSequence text = "Your Location LAT,LONG matched Successfully!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text1 = "Not matched Successfully!---:(";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text1, duration);
            toast.show();
        }


//Gif load
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView1));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView2));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView3));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView4));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView5));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView6));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView7));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView8));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView9));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView10));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView11));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView12));
    }
}
