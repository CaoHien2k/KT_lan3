package com.example.momo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class List_Movie_Adapter  extends BaseAdapter
{
    private String[] imageNames;
    private int[] imagePhoto;
    private Context context;
    private LayoutInflater layoutInflater;

    public List_Movie_Adapter(String[] imageNames, int[] imagePhoto, Context context) {
        this.imageNames = imageNames;
        this.imagePhoto = imagePhoto;
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagePhoto.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_movie, viewGroup, false);
        }
        TextView tvName = view.findViewById(R.id.tvName1);
        ImageView imageView = view.findViewById(R.id.imageView1);

        tvName.setText(imageNames[i]);
        imageView.setImageResource(imagePhoto[i]);

        return view;

    }

}