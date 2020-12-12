package com.example.momo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Milk_Tea_Activity_Main extends AppCompatActivity
{
    private ViewPager pager;
    private TabLayout tabLayout;
    ImageView ITEM_MT_ICON_BACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.milk_tea_activity_main);
        addControl();

        ITEM_MT_ICON_BACK = findViewById(R.id.ITEM_MT_ICON_BACK);

        ITEM_MT_ICON_BACK = findViewById(R.id.ITEM_MT_ICON_BACK);
        ITEM_MT_ICON_BACK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addControl() {
        pager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        FragmentManager manager = getSupportFragmentManager();
        Milk_Tea_Fragment_One_Adapter View_Pager_Adapter = new Milk_Tea_Fragment_One_Adapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pager.setAdapter(View_Pager_Adapter);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(View_Pager_Adapter); //deprecated;
    }
}
