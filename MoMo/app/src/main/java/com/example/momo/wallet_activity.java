package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class wallet_activity extends AppCompatActivity {
    ImageView IMAGE_BACK;
    Button btnaptien;
    TextInputEditText inputmoney;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_activity);

        IMAGE_BACK = findViewById(R.id.MAP_ICON_BACK);

        IMAGE_BACK = findViewById(R.id.MAP_ICON_BACK);
        IMAGE_BACK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        inputmoney = (TextInputEditText) findViewById(R.id.money);
        btnaptien = (Button) findViewById(R.id.btnt);
        btnaptien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tien = inputmoney.getText().toString();
                Toast.makeText(getApplicationContext(),"Bạn đã nạp " + tien +" vào ví thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
}