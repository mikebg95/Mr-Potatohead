package com.example.mike.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (findViewById(R.id.img_shoes).getVisibility() == View.VISIBLE) {
            outState.putBoolean("shoes_vis", true);
        }
        else {
            outState.putBoolean("shoes_vis", false);
        }

        if (findViewById(R.id.img_mustache).getVisibility() == View.VISIBLE) {
            outState.putBoolean("mustache_vis", true);
        }
        else {
            outState.putBoolean("mustache_vis", false);
        }

        if (findViewById(R.id.img_mouth).getVisibility() == View.VISIBLE) {
            outState.putBoolean("mouth_vis", true);
        }
        else {
            outState.putBoolean("mouth_vis", false);
        }

        if (findViewById(R.id.img_glasses).getVisibility() == View.VISIBLE) {
            outState.putBoolean("glasses_vis", true);
        }
        else {
            outState.putBoolean("glasses_vis", false);
        }

        if (findViewById(R.id.img_eyes).getVisibility() == View.VISIBLE) {
            outState.putBoolean("eyes_vis", true);
        }
        else {
            outState.putBoolean("eyes_vis", false);
        }

        if (findViewById(R.id.img_nose).getVisibility() == View.VISIBLE) {
            outState.putBoolean("nose_vis", true);
        }
        else {
            outState.putBoolean("nose_vis", false);
        }

        if (findViewById(R.id.img_eyebrows).getVisibility() == View.VISIBLE) {
            outState.putBoolean("eyebrows_vis", true);
        }
        else {
            outState.putBoolean("eyebrows_vis", false);
        }

        if (findViewById(R.id.img_ears).getVisibility() == View.VISIBLE) {
            outState.putBoolean("ears_vis", true);
        }
        else {
            outState.putBoolean("ears_vis", false);
        }

        if (findViewById(R.id.img_body).getVisibility() == View.VISIBLE) {
            outState.putBoolean("body_vis", true);
        }
        else {
            outState.putBoolean("body_vis", false);
        }

        if (findViewById(R.id.img_arms).getVisibility() == View.VISIBLE) {
            outState.putBoolean("arms_vis", true);
        }
        else {
            outState.putBoolean("arms_vis", false);
        }

        if (findViewById(R.id.img_hat).getVisibility() == View.VISIBLE) {
            outState.putBoolean("hat_vis", true);
        }
        else {
            outState.putBoolean("hat_vis", false);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            Boolean shoes_visibility = savedInstanceState.getBoolean("shoes_vis");
            if (shoes_visibility) {
                findViewById(R.id.img_shoes).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_shoes).setVisibility(View.INVISIBLE);
            }

            Boolean mustache_visibility = savedInstanceState.getBoolean("mustache_vis");
            if (mustache_visibility) {
                findViewById(R.id.img_mustache).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_mustache).setVisibility(View.INVISIBLE);
            }

            Boolean mouth_visibility = savedInstanceState.getBoolean("mouth_vis");
            if (mouth_visibility) {
                findViewById(R.id.img_mouth).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_mouth).setVisibility(View.INVISIBLE);
            }

            Boolean glasses_visibility = savedInstanceState.getBoolean("glasses_vis");
            if (glasses_visibility) {
                findViewById(R.id.img_glasses).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_glasses).setVisibility(View.INVISIBLE);
            }

            Boolean eyes_visibility = savedInstanceState.getBoolean("eyes_vis");
            if (eyes_visibility) {
                findViewById(R.id.img_eyes).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_eyes).setVisibility(View.INVISIBLE);
            }

            Boolean nose_visibility = savedInstanceState.getBoolean("nose_vis");
            if (nose_visibility) {
                findViewById(R.id.img_nose).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_nose).setVisibility(View.INVISIBLE);
            }

            Boolean eyebrows_visibility = savedInstanceState.getBoolean("eyebrows_vis");
            if (eyebrows_visibility) {
                findViewById(R.id.img_eyebrows).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_eyebrows).setVisibility(View.INVISIBLE);
            }

            Boolean ears_visibility = savedInstanceState.getBoolean("ears_vis");
            if (ears_visibility) {
                findViewById(R.id.img_ears).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_ears).setVisibility(View.INVISIBLE);
            }

            Boolean body_visibility = savedInstanceState.getBoolean("body_vis");
            if (body_visibility) {
                findViewById(R.id.img_body).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_body).setVisibility(View.INVISIBLE);
            }

            Boolean arms_visibility = savedInstanceState.getBoolean("arms_vis");
            if (arms_visibility) {
                findViewById(R.id.img_arms).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_arms).setVisibility(View.INVISIBLE);
            }

            Boolean hat_visibility = savedInstanceState.getBoolean("hat_vis");
            if (hat_visibility) {
                findViewById(R.id.img_hat).setVisibility(View.VISIBLE);
            } else {
                findViewById(R.id.img_hat).setVisibility(View.INVISIBLE);
            }
        }
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");

        // convert input to checkbox form
        CheckBox checkbox = (CheckBox) v;

        // create variables linked to images
        ImageView shoes = findViewById(R.id.img_shoes);
        ImageView arms = findViewById(R.id.img_arms);
        ImageView nose = findViewById(R.id.img_nose);
        ImageView mustache = findViewById(R.id.img_mustache);
        ImageView mouth = findViewById(R.id.img_mouth);
        ImageView hat = findViewById(R.id.img_hat);
        ImageView glasses = findViewById(R.id.img_glasses);
        ImageView eyes = findViewById(R.id.img_eyes);
        ImageView eyebrows = findViewById(R.id.img_eyebrows);
        ImageView ears = findViewById(R.id.img_ears);
        ImageView body = findViewById(R.id.img_body);

        // link checkbox to image and make image (dis)appear when checkbox is clicked
        if (checkbox.getText().toString().equals( "Shoes" )) {
            if (!checkbox.isChecked()) {
                shoes.setVisibility(View.INVISIBLE);
            }
            else {
                shoes.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Arms" )) {
            if (!checkbox.isChecked()) {
                arms.setVisibility(View.INVISIBLE);
            }
            else {
                arms.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Nose" )) {
            if (!checkbox.isChecked()) {
                nose.setVisibility(View.INVISIBLE);
            }
            else {
                nose.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Mustache" )) {
            if (!checkbox.isChecked()) {
                mustache.setVisibility(View.INVISIBLE);
            }
            else {
                mustache.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Mouth" )) {
            if (!checkbox.isChecked()) {
                mouth.setVisibility(View.INVISIBLE);
            }
            else {
                mouth.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Glasses" )) {
            if (!checkbox.isChecked()) {
                glasses.setVisibility(View.INVISIBLE);
            }
            else {
                glasses.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Eyes" )) {
            if (!checkbox.isChecked()) {
                eyes.setVisibility(View.INVISIBLE);
            }
            else {
                eyes.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Eyebrows" )) {
            if (!checkbox.isChecked()) {
                eyebrows.setVisibility(View.INVISIBLE);
            }
            else {
                eyebrows.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Ears" )) {
            if (!checkbox.isChecked()) {
                ears.setVisibility(View.INVISIBLE);
            }
            else {
                ears.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Body" )) {
            if (!checkbox.isChecked()) {
                body.setVisibility(View.INVISIBLE);
            }
            else {
                body.setVisibility(View.VISIBLE);
            }
        }
        if (checkbox.getText().toString().equals( "Hat" )) {
            if (!checkbox.isChecked()) {
                hat.setVisibility(View.INVISIBLE);
            }
            else {
                hat.setVisibility(View.VISIBLE);
            }
        }

    }
}


