package com.example.android.businesscardapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPageThePaintings(View view) {
        //This method is used for opening a web page when "The Paintings" text is clicked.
        Uri uri = Uri.parse("http://lovingvincent.com/the-paintings,2,pl.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openPageTheMovie(View view) {
        //This method is used for opening a web page when "The Movie" text is clicked.
        Uri uri = Uri.parse("http://lovingvincent.com/the-movie,3,pl.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openPageLovingVincent(View view) {
        //This method is used for opening a web page when the website is clicked.
        Uri uri = Uri.parse("http://lovingvincent.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openMapAddress(View view){
        //This method is used for opening the address on a map app.
        Uri mapIntentUri = Uri.parse("geo:0,0?q=Al. Niepodleglosci 881G, 81-861 Sopot, Poland");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapIntentUri);
        startActivity(mapIntent);
    }
}
