package com.example.sanyi.single_screen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navigatemaps(View v){
        String uri = "http://maps.google.com/maps?q=" + "Costes Restaurant";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));

        startActivity(intent);
    }
}
