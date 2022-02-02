package com.example.image01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    ImageView iv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn) ;
        iv = findViewById(R.id.iv) ;
    }

    public void go(View view) {
        int ran =  (int)( 101* Math.random()) %3+1 ;
        if (ran==1) {
            iv.setImageResource(R.drawable.img1 ) ;

        }
        else if (ran==2) {
            iv.setImageResource(R.drawable.img2);
        }
        else {
            iv.setImageResource(R.drawable.img3);
        }
        btn.setText("" +ran);

    }


    }
