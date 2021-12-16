package com.techleadintl.android.app0;

//import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Activity3 extends AppCompatActivity {

    CardView c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        c1=(CardView) findViewById(R.id.card1);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.setCardBackgroundColor(Color.RED);
                //c1.setCardBackgroundColor(Color.WHITE);
            }
        });
    }
}