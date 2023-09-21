package com.example.appdrinkmachine;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView name;
    TextView price;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name = findViewById(R.id.textName2);
        price = findViewById(R.id.textPrice2);
        imageView = findViewById(R.id.imageView2);

        name.setText(getIntent().getExtras().getString("name"));
        price.setText(getIntent().getExtras().getString("price"));
        int drinkimg = getIntent().getIntExtra("drinkimg",0);
        imageView.setImageResource(drinkimg);


    }
}