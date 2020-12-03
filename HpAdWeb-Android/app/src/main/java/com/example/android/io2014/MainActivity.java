package com.example.android.io2014;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

import com.example.android.io2014.ui.Utils;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;
import com.roger.catloadingview.catview2;
import com.roger.catloadingview.catview3;
import com.roger.catloadingview.catview4;

import hp.nikeshhbaskaran.com.hpadweb.R;

public class MainActivity extends AppCompatActivity {


    // Bitmaps will only be decoded once and stored in this cache
    public static SparseArray<Bitmap> sPhotoCache = new SparseArray<Bitmap>(4);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setHomeButtonEnabled(false);

        // Used to get the dimensions of the image views to load scaled down bitmaps
        final View parent = findViewById(R.id.parent);
        parent.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Utils.removeOnGlobalLayoutListenerCompat(parent, this);
                setImageBitmap((ImageView) findViewById(R.id.card_photo_1).findViewById(R.id.photo), R.drawable.photo1);
                setImageBitmap((ImageView) findViewById(R.id.card_photo_2).findViewById(R.id.photo), R.drawable.photo2);
                setImageBitmap((ImageView) findViewById(R.id.card_photo_3).findViewById(R.id.photo), R.drawable.photo3);
                setImageBitmap((ImageView) findViewById(R.id.card_photo_4).findViewById(R.id.photo), R.drawable.photo4);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!Utils.hasLollipop()) {
            // The activity transition animates the clicked image alpha to zero, reset that value when
            // you come back to this activity
            ViewHelper.setAlpha(findViewById(R.id.card_photo_1), 1.0f);
            ViewHelper.setAlpha(findViewById(R.id.card_photo_2), 1.0f);
            ViewHelper.setAlpha(findViewById(R.id.card_photo_3), 1.0f);
            ViewHelper.setAlpha(findViewById(R.id.card_photo_4), 1.0f);
        }
    }

    private void setImageBitmap(ImageView imageView, int resId) {
        Bitmap bitmap = Utils.decodeSampledBitmapFromResource(getResources(),
                resId, imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
        sPhotoCache.put(resId, bitmap);
        imageView.setImageBitmap(bitmap);
    }

    public void showPhoto(View view) {
        Intent intent = new Intent();
        intent.setClass(this, DetailActivity.class);

        // Interesting data to pass across are the thumbnail location, the map parameters,
        // the picture title & description, and the key to retrieve the bitmap from the cache
        int resId = 0;
        switch (view.getId()) {
            case R.id.show_photo_1:
                intent.putExtra("title", "Hewlett Packard")
                        .putExtra("description", getResources().getText(R.string.text1))
                        .putExtra("photo", R.drawable.photo1);
                resId = R.id.card_photo_1;
                break;
            case R.id.show_photo_2:
                intent.putExtra("title", "Ad Web")
                        .putExtra("description", getResources().getText(R.string.text2))
                        .putExtra("photo", R.drawable.photo2);
                resId = R.id.card_photo_2;
                getWindow().setFormat(PixelFormat.UNKNOWN);
                Thread mThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(4000);
                            Intent startFIRSTPAGE = new Intent(getApplicationContext(), catview2.class);
                            startActivity(startFIRSTPAGE);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                };

                mThread.start();
                break;
            case R.id.show_photo_3:
                intent.putExtra("title", "Products")
                        .putExtra("description", getResources().getText(R.string.text3))
                        .putExtra("photo", R.drawable.photo3);
                resId = R.id.card_photo_3;
                getWindow().setFormat(PixelFormat.UNKNOWN);
                mThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(4000);
                            Intent startFIRSTPAGE = new Intent(getApplicationContext(), catview3.class);
                            startActivity(startFIRSTPAGE);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                };

                mThread.start();
                break;
            case R.id.show_photo_4:
                intent.putExtra("title", "Customer Support")
                        .putExtra("description", getResources().getText(R.string.text4))
                        .putExtra("photo", R.drawable.photo4);
                resId = R.id.card_photo_4;
                getWindow().setFormat(PixelFormat.UNKNOWN);
                mThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(4000);
                            Intent startFIRSTPAGE = new Intent(getApplicationContext(), catview4.class);
                            startActivity(startFIRSTPAGE);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                };

                mThread.start();
                break;
        }

        if (Utils.hasLollipop()) {
            startActivityLollipop(view, intent);
        } else {
            startActivityGingerBread(view, intent, resId);
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void startActivityLollipop(View view, Intent intent) {
        intent.setClass(this, DetailActivityL.class);
        ImageView hero = (ImageView) ((View) view.getParent()).findViewById(R.id.photo);
        ((ViewGroup) hero.getParent()).setTransitionGroup(false);

        sPhotoCache.put(intent.getIntExtra("photo", -1),
                ((BitmapDrawable) hero.getDrawable()).getBitmap());

        ActivityOptions options =
                ActivityOptions.makeSceneTransitionAnimation(this, hero, "photo_hero");
        startActivity(intent, options.toBundle());
    }

    private void startActivityGingerBread(View view, Intent intent, int resId) {
        int[] screenLocation = new int[2];
        view.getLocationOnScreen(screenLocation);
        intent.
                putExtra("left", screenLocation[0]).
                putExtra("top", screenLocation[1]).
                putExtra("width", view.getWidth()).
                putExtra("height", view.getHeight());

        startActivity(intent);

        // Override transitions: we don't want the normal window animation in addition to our
        // custom one
        overridePendingTransition(0, 0);

        // The detail activity handles the enter and exit animations. Both animations involve a
        // ghost view animating into its final or initial position respectively. Since the detail
        // activity starts translucent, the clicked view needs to be invisible in order for the
        // animation to look correct.
        ViewPropertyAnimator.animate(findViewById(resId)).alpha(0.0f);
    }
}
