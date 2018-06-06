package org.akshanshgusain.gradiantanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     private ConstraintLayout mConstraintLyout;
     private AnimationDrawable mAnimationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Material_Light_NoActionBar_Fullscreen);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mConstraintLyout=(ConstraintLayout) findViewById(R.id.myLayout);
        mAnimationDrawable=(AnimationDrawable) mConstraintLyout.getBackground();
        mAnimationDrawable.setEnterFadeDuration(4500);
        mAnimationDrawable.setExitFadeDuration(4500);
        mAnimationDrawable.start();
    }
}
