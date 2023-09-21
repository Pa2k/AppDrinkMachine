package com.example.appdrinkmachine;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdrinkmachine.model.MyDrinkData;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    MyDrinkData[] myDrinkData = new MyDrinkData[]{
                new MyDrinkData("Pepsi","16",R.drawable.pepsi),
                new MyDrinkData("Coke","17",R.drawable.coke),
                new MyDrinkData("Oishi","20",R.drawable.oishi),
                new MyDrinkData("Milk","15",R.drawable.mejimilk),
                new MyDrinkData("Chocolate Milk","15",R.drawable.mejichocolate),

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        recyclerView = findViewById(R.id.recyclerview);

        MyDrinkAdapter adapter = new MyDrinkAdapter(myDrinkData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}