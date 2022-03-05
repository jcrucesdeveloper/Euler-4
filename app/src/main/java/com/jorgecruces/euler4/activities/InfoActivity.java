package com.jorgecruces.euler4.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.jorgecruces.euler4.R;
import com.jorgecruces.euler4.sound.MediaPlayerReproducer;

/**
 * Info activity, it contains content info(Problems info), contactInfo, credits
 */
public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Button try another Euler
        Button buttonTryEuler = (Button)findViewById(R.id.buttonTryEuler);
        buttonTryEuler.setOnClickListener(view -> goToStore());
    }

    public void goToStore() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.nextEulerLink)));
        startActivity(intent);
    }


    public void onClickGoBackButton(View view) {
        MediaPlayerReproducer.getInstance().reproduceClickSound(this);
        finish();
    }

}