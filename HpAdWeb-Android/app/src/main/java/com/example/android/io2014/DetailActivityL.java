package com.example.android.io2014;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.widget.ImageView;

import com.example.android.io2014.ui.TransitionListener;

import hp.nikeshhbaskaran.com.hpadweb.R;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class DetailActivityL extends AbstractDetailActivity {

    @Override
    public void postCreate() {

    }

    @Override
    public void mapLoaded(Bitmap bitmap) {

    }

    private void setOutlines(int star, int info) {
        final int size = getResources().getDimensionPixelSize(R.dimen.floating_button_size);

        final ViewOutlineProvider vop = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, size, size);
            }
        };

        findViewById(star).setOutlineProvider(vop);
        findViewById(info).setOutlineProvider(vop);
    }

    private void applySystemWindowsBottomInset() {
        container.setFitsSystemWindows(true);
        container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                DisplayMetrics metrics = getResources().getDisplayMetrics();
                if (metrics.widthPixels < metrics.heightPixels) {
                    view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
                } else {
                    view.setPadding(0, 0, windowInsets.getSystemWindowInsetRight(), 0);
                }
                return windowInsets.consumeSystemWindowInsets();
            }
        });
    }

    @Override
    public void colorButton(int id, int bgColor, int tintColor) {
        View buttonView = findViewById(id);

        RippleDrawable ripple = (RippleDrawable) buttonView.getBackground();
        GradientDrawable rippleBackground = (GradientDrawable) ripple.getDrawable(0);
        rippleBackground.setColor(bgColor);

        ripple.setColor(ColorStateList.valueOf(tintColor));
    }

    @Override
    public void toggleInformationView(View view) {

    }

    @Override
    public void setupEnterAnimation() {
        getWindow().getEnterTransition().addListener(new TransitionListener() {
            @Override
            public void onTransitionEnd(Transition transition) {
                ImageView hero = (ImageView) findViewById(R.id.photo);
                Integer colorFrom = getResources().getColor(R.color.photo_tint);
                ValueAnimator color = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, 0);
                color.addUpdateListener(new TintListener(hero));
                color.start();

                findViewById(R.id.star_button).animate().alpha(1.0f);

                getWindow().getEnterTransition().removeListener(this);
            }
        });
    }

    @Override
    public void setupExitAnimation() {
        Integer colorTo = getResources().getColor(R.color.photo_tint);
        ValueAnimator color = ValueAnimator.ofObject(new ArgbEvaluator(), 0, colorTo);
        color.addUpdateListener(new TintListener(hero));
        color.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                finishAfterTransition();
            }
        });
        color.start();

        findViewById(R.id.star_button).animate().alpha(0.0f);
    }

    private static class TintListener implements ValueAnimator.AnimatorUpdateListener {
        private final ImageView mHero;

        TintListener(ImageView hero) {
            mHero = hero;
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mHero.getDrawable().setTint((Integer) valueAnimator.getAnimatedValue());
        }
    }
}