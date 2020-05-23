package com.example.onboarder;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.hololo.tutorial.library.PermissionStep;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class onBoardActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //slide1
        addFragment(new Step.Builder().setTitle("WELCOME TO THE APP!")
                .setContent("To show a first-time user how to get the most from your app, present onboarding information at app startup.")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.img1) // int top drawable
                .build());
        //slide2
        addFragment(new Step.Builder().setTitle("DOT Navigations")
                .setContent("Navigations are represented using Dotted Notations")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.img4) // int top drawable
                .build());
        //slide3
        addFragment(new Step.Builder().setTitle("USER-GUIDE SUMMARY")
                .setContent("A Summarized content of the app for the First-Time users")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.img3) // int top drawable
                .build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }
}
