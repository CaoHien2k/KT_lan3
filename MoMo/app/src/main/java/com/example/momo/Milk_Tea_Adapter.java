package com.example.momo;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Milk_Tea_Adapter extends  RecyclerView.Adapter<Milk_Tea_View_Holder>{

    private Context mContext;
    private List<FoodData> myFoodList;

    public Milk_Tea_Adapter(Activity mContext, List<FoodData> myFoodList) {
        this.mContext = mContext;
        this.myFoodList = myFoodList;
    }

    @Override
    public Milk_Tea_View_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.milk_tea_item,viewGroup,false);
        return new Milk_Tea_View_Holder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final Milk_Tea_View_Holder foodViewHolder, int i) {
        foodViewHolder.imageView.setImageResource(myFoodList.get(i).getItemImage());
        foodViewHolder.mTitle.setText(myFoodList.get(i).getItemName());
        foodViewHolder.mDescription.setText(myFoodList.get(i).getItemDescription());
        foodViewHolder.mPrice.setText(myFoodList.get(i).getItemPrice());
        foodViewHolder.mDanhGia.setText(myFoodList.get(i).getItemDanhGia());
        foodViewHolder.mKm.setText(myFoodList.get(i).getItemKm());
        foodViewHolder.mGiamGia.setText(myFoodList.get(i).getItemGiamGia());

        foodViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Milk_Tea_Details.class);
                intent.putExtra("Image",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemImage());
                intent.putExtra("Description",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemDescription());
                intent.putExtra("DanhGia",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemDanhGia());
                intent.putExtra("Price",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemPrice());
                intent.putExtra("Title",myFoodList.get(foodViewHolder.getAdapterPosition()).getItemName());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myFoodList.size();
    }
}

class Milk_Tea_View_Holder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView mTitle,mDescription,mPrice,mDanhGia,mKm,mGiamGia;
    CardView mCardView;

    public Milk_Tea_View_Holder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
        mTitle =  itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mPrice = itemView.findViewById(R.id.tvPrice);
        mDanhGia = itemView.findViewById(R.id.star);
        mKm = itemView.findViewById(R.id.km);
        mGiamGia = itemView.findViewById(R.id.sale);
        mCardView = itemView.findViewById(R.id.myCardView);
    }
}
