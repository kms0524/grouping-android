package com.example.grouping_project;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class SignActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        final ImageView signBackground = (ImageView) findViewById(R.id.background);
        final ImageView signTitle = (ImageView) findViewById(R.id.title);
        final ImageButton joinUs = (ImageButton) findViewById(R.id.joinUs);
        final ImageButton signIn = (ImageButton) findViewById(R.id.signIn);

        Matrix matrix = new Matrix();
        matrix.postScale(3.2f, 3.2f);
        signBackground.setImageMatrix(matrix);

        final Animation backgroundAnimation = AnimationUtils.loadAnimation(this, R.anim.sign_background_animation);
        final Animation titleAnimation = AnimationUtils.loadAnimation(this, R.anim.sign_title_animation);
        final Animation fadeinAnimation = AnimationUtils.loadAnimation(this, R.anim.sign_fadein);
        backgroundAnimation.setFillAfter(true);
        titleAnimation.setFillAfter(true);
        fadeinAnimation.setFillAfter(true);
        backgroundAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                signBackground.startAnimation(animation);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

        });

        signBackground.startAnimation(backgroundAnimation);

        titleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        signTitle.startAnimation(titleAnimation);

        fadeinAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        joinUs.startAnimation(fadeinAnimation);
        signIn.startAnimation(fadeinAnimation);


    }
}

