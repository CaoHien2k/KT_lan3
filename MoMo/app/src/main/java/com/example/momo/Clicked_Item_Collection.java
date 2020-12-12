package com.example.momo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Clicked_Item_Collection extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    TextView tvbackbst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicked_item_collection);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.tvName);

        Intent intent = getIntent();
        if(intent.getExtras() != null){
            String selectedName = intent.getStringExtra("name1");
            int selectedImage = intent.getIntExtra("image1",0);

            textView.setText(selectedName);
            imageView.setImageResource(selectedImage);
        }
        tvbackbst = (TextView) findViewById(R.id.backbst);
        tvbackbst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Clicked_Item_Collection.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
