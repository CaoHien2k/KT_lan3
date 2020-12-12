package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class movie extends AppCompatActivity {
    private ViewPager VP_IMAGE1;
    GridView GV_03 ;
    String names3[] = {"Trạng quỳnh", "Tấm cám", "Tôi là não cá vàng", "Ba Chàng Khuyết", "Gái già lắm chiêu"};
    int images3[] = {R.drawable.mv1, R.drawable.mv2, R.drawable.mv3, R.drawable.mv4, R.drawable.mv5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        GV_03 = findViewById(R.id.GV_03);
        List_Movie_Adapter List_Collection_Adapter = new List_Movie_Adapter(names3,images3,this);
        GV_03.setAdapter(List_Collection_Adapter);

        VP_IMAGE1 = findViewById(R.id.VP_IMAGE1);
        Movie_Slides viewPagerAdapter = new Movie_Slides(this);
        VP_IMAGE1.setAdapter(viewPagerAdapter);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new movie.MyTimerTask(),1000,2000);


    }
    public class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            movie.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(VP_IMAGE1.getCurrentItem() == 0){
                        VP_IMAGE1.setCurrentItem(1);
                    }else if(VP_IMAGE1.getCurrentItem()==1){
                        VP_IMAGE1.setCurrentItem(2);
                    }else if(VP_IMAGE1.getCurrentItem()==2){
                        VP_IMAGE1.setCurrentItem(3);
                    }else if(VP_IMAGE1.getCurrentItem()==3){
                        VP_IMAGE1.setCurrentItem(4);
                    }else if(VP_IMAGE1.getCurrentItem()==4){
                        VP_IMAGE1.setCurrentItem(5);
                    }else if(VP_IMAGE1.getCurrentItem()==5){
                        VP_IMAGE1.setCurrentItem(6);
                    }else{
                        VP_IMAGE1.setCurrentItem(0);
                    }
                }
            });
        }
    }
}