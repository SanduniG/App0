package com.techleadintl.android.app0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView img_msg, img_dash, img_loc,img_friend, img_feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_msg=(CircleImageView) findViewById(R.id.imgMsg);
        img_dash=(CircleImageView) findViewById(R.id.imgDash);
        img_loc=(CircleImageView) findViewById(R.id.imgLoc);
        img_friend=(CircleImageView)findViewById(R.id.imgFriend);
        img_feed=(CircleImageView)findViewById(R.id.imgFeed);



        img_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });
        img_dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
        img_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });
       img_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });
       img_feed.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this, Activity5.class);
               startActivity(intent);
           }
       });


    }
}