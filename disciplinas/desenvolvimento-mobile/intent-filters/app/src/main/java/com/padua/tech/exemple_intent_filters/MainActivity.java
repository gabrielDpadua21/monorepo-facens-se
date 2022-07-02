package com.padua.tech.exemple_intent_filters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView) findViewById(R.id.txtMessage);
        if(getIntent().getExtras() != null) message.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
    }
}