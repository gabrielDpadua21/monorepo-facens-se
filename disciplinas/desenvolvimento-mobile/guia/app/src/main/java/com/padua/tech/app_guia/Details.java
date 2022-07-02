package com.padua.tech.app_guia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private TextView localName;
    private TextView localDescription;
    private ImageView localPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        localName = (TextView) findViewById(R.id.txtLocalName);
        localDescription = (TextView) findViewById(R.id.txtDescription);
        localPhoto = (ImageView) findViewById(R.id.imgPhoto);
        Intent intent = getIntent();
        loadLocaleInfos(intent);
    }

    public void loadLocaleInfos(Intent intent) {
        localName.setText(intent.getStringExtra("name"));
        localDescription.setText(intent.getStringExtra("description"));
        localPhoto.setImageResource(intent.getIntExtra("image", 0));
    }

    public void onClickLocale(View view) {
        Intent localsIntent = getIntent();
        Uri uri = Uri.parse(localsIntent.getStringExtra("locale"));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void onClickSite(View view) {
        Intent localsIntent = getIntent();
        Uri uri = Uri.parse(localsIntent.getStringExtra("url"));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent localsIntent = getIntent();
        Uri uri = Uri.parse(localsIntent.getStringExtra("phone"));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}