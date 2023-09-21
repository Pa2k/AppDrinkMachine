package com.example.appdrinkmachine;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdrinkmachine.model.MyDrinkData;

public class MyDrinkAdapter extends RecyclerView.Adapter<MyDrinkAdapter.myViewHolder>{
        public MyDrinkData[] drinkDataList;

    public MyDrinkAdapter(MyDrinkData[] drinkDataList) {
        this.drinkDataList = drinkDataList;
    }

    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View myview = inflater.inflate(R.layout.activity_main2,parent,false);
        return new myViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        final MyDrinkData data_position = drinkDataList[position];
        holder.drinkName.setText(drinkDataList[position].getDrinkName());
        holder.drinkPrice.setText(drinkDataList[position].getDrinkPrice()+" บาท");
        holder.drinkImage.setImageResource(drinkDataList[position].getDrinkImage());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity3.class);
                intent.putExtra("name",data_position.getDrinkName());
                intent.putExtra("price","ยอดชำระ : " + data_position.getDrinkPrice()+" บาท");
                intent.putExtra("drinkimg",data_position.getDrinkImage());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return drinkDataList.length;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        private TextView drinkName;
        private TextView drinkPrice;
        private ImageView drinkImage;
        private CardView layout;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            drinkImage = itemView.findViewById(R.id.imageView);
            drinkName = itemView.findViewById(R.id.textName);
            drinkPrice = itemView.findViewById(R.id.textPrice);
            layout = itemView.findViewById(R.id.cardview);
        }
    }
}
