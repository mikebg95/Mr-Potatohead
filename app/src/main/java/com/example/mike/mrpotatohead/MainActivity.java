package com.example.mike.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    // @Override
    // public void onSaveInstanceState(Bundle outState) {
    //     super.onSaveInstanceState(outState);
    // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");

        // convert input to checkbox form
        CheckBox checkbox = (CheckBox) v;

        // create variables linked to images
        ImageView shoes = (ImageView) findViewById(R.id.img_shoes);
        ImageView arms = (ImageView) findViewById(R.id.img_arms);
        ImageView nose = (ImageView) findViewById(R.id.img_nose);
        ImageView mustache = (ImageView) findViewById(R.id.img_mustache);
        ImageView mouth = (ImageView) findViewById(R.id.img_mouth);
        ImageView hat = (ImageView) findViewById(R.id.img_hat);
        ImageView glasses = (ImageView) findViewById(R.id.img_glasses);
        ImageView eyes = (ImageView) findViewById(R.id.img_eyes);
        ImageView eyebrows = (ImageView) findViewById(R.id.img_eyebrows);
        ImageView ears = (ImageView) findViewById(R.id.img_ears);
        ImageView body = (ImageView) findViewById(R.id.img_body);

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


