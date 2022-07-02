package com.padua.tech.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().hide();

        ImageView image = (ImageView) findViewById(R.id.imgResult);
        TextView text = (TextView) findViewById(R.id.textViewResult);
        Intent intent = getIntent();

        boolean result = intent.getBooleanExtra("correct", false);
        int points = intent.getIntExtra("points", 0);
        setImageAndText(image, text, result, points);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
                finish();
            }
        });
        thread.start();
    }

    private void setImageAndText(ImageView image, TextView text, boolean correct, int points) {

        if(correct) {
            image.setImageResource(R.drawable.correct);
            text.setText("Acertou! Points: " + points);
            return;
        }
        image.setImageResource(R.drawable.error);
        text.setText("Errou! Points: " + points);
    }
}