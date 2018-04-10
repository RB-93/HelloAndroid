package com.rohit.examples.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv_link);
        Button button = findViewById(R.id.button_udacity);
        ImageView imageView = findViewById(R.id.img_weblink);
        ImageView img_emaillink = findViewById(R.id.img_email);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toWeb(view);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toWiki(view);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toWeb(view);
            }
        });

        img_emaillink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toGmail(view);
            }
        });
    }

    public void toWeb(View v) {
        Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com/"));
        startActivity(intentWeb);
    }

    public void toWiki(View v) {
        Intent intentWiki = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Udacity"));
        startActivity(intentWiki);
    }

    public void toGmail(View v) {
        Intent intentmail = new Intent (Intent.ACTION_VIEW , Uri.parse("mailto:" + "india@udacity.com"));
        startActivity(intentmail);
    }
}
