package com.example.momo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class notification extends AppCompatActivity {
    ImageView ITEM_MT_ICON_BACK1;
    ListView listView;
    String mTitle[] = {"Vui lễ hội, khui KM 21.5% Viettheo","Chuyển tiền thành công","Nạp tiền thành công","Tiếp tục giới thiệu: Hốt 500k","Nhận 50.000đ từ Thu Thảo","Bí kíp MoMo: Nạp 4G giá rẻ vô đối "};
    String mDescription[] = {"KM 20% Vietel + Hoàn tiền 1.5% (mệnh giá từ 50k). Mua ngay","Quý khách đã chuyển tiền cho Nguyễn Văn A thành công","Quý khách đã nạp thành công 150.000đ",
            "Hốt quà 500l mỗi người, đón sale khủng 12.12 trên tiki,lazada,..","Đã chuyển. Nhấn để thêm chi tiết","Cứu net ngay cuối tuần với gói data 10k dùng trong 3 ngày"};
    int images[] = {R.drawable.momo, R.drawable.mm, R.drawable.mm1, R.drawable.momo, R.drawable.mm3,R.drawable.mm1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        ITEM_MT_ICON_BACK1 = findViewById(R.id.ITEM_MT_ICON_BACK1);

        ITEM_MT_ICON_BACK1 = findViewById(R.id.ITEM_MT_ICON_BACK1);
        ITEM_MT_ICON_BACK1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0){
                    Toast.makeText( notification.this, "KM 20% Vietel + Hoàn tiền 1.5% (mệnh giá từ 50k). Mua ngay", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( notification.this, "Quý khách đã chuyển tiền cho Nguyễn Văn A thành công", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( notification.this, "Quý khách đã nạp thành công 150.000đ", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( notification.this, "Hốt quà 500l mỗi người, đón sale khủng 12.12 trên tiki,lazada,..", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( notification.this, "Đã chuyển. Nhấn để thêm chi tiết", Toast.LENGTH_SHORT).show();
                }
                if(position ==0){
                    Toast.makeText( notification.this, "Cứu net ngay cuối tuần với gói data 10k dùng trong 3 ngày", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter(Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convretView, @Nullable ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View  row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;


        }
    }
}