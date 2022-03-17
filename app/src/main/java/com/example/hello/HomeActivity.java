package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hello.common.Common;
import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {
    TextView txtLoginMain;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtLoginMain = findViewById(R.id.txt_namelogin);
        txtLoginMain.setText(Common.globalName.toString());

        imageView = findViewById(R.id.img_profile);


        //Picasso.with(getApplicationContext()).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwDg_13kpYfRWJI9vx-L-0gF9jqUWDfdUR1Q9UvjnWYzFgrgCU").into(imageView);

    }
}