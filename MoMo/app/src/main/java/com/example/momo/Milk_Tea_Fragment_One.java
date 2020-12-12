package com.example.momo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Milk_Tea_Fragment_One extends Fragment {
    List<FoodData> myFoodList;
    FoodData mFoodData;
    RecyclerView mRecyclerView;
    ImageView IV_ITEM_MILK_TEA;
    TextView TV_TITLE, TV_DESCRIPTION, TV_PRICE, TV_STAR, TV_KILOMETER, TV_SALE;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.milk_tea_fragment_one, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        IV_ITEM_MILK_TEA = view.findViewById(R.id.ivImage);
        TV_TITLE = view.findViewById(R.id.tvTitle);
        TV_DESCRIPTION = view.findViewById(R.id.tvDescription);
        TV_PRICE = view.findViewById(R.id.tvPrice);
        TV_STAR = view.findViewById(R.id.star);
        TV_KILOMETER = view.findViewById(R.id.km);
        TV_SALE = view.findViewById(R.id.sale);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Trà Sữa Cherry","138 Hải Phòng, Thanh Khê, Đà Nẵng","23.000đ","3.6","2.3km","Mã Giảm Giá 30%",R.drawable.ts1);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Trà Sữa Hẻm","12 Cao Thắng, Hải Châu, Đà Nẵng","45.000đ","3.9","3.8km","Freeship",R.drawable.ts2);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Milo Dầm BonBon","78 Đống Đa, Hải Châu, Đà Nẵng","30.000đ","2.5","6.7km","Freeship 3km",R.drawable.ts3);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Sữa Tươi Trân Châu Đường Đen","12 Lê Duẫn, Thanh Khê, Đà Nẵng","55.000đ","4.0","1.1km","Mã Giảm Giá 20%",R.drawable.ts4);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Trà Sữa Full Plan BonBon","78 Đống Đa, Hải Châu, Đà Nẵng","55.000đ","4.0","1.1km","Mã Giảm Giá 20%",R.drawable.ts5);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Trà Sữa Thái Xanh BonBon","12 Ngô Gia Tự, Hải Châu, Đà Nẵng","55.000đ","3.7","3.0km","FreeShip 3km",R.drawable.ts6);
        myFoodList.add(mFoodData);

        Milk_Tea_Adapter myAdapter = new Milk_Tea_Adapter(getActivity(),myFoodList);
        mRecyclerView.setAdapter(myAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        // Inflate the layout for this fragment
        return view;


    }
}
