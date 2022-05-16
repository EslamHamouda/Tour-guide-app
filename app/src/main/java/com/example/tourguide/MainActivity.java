package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ViewPager2 viewPager2=(ViewPager2) findViewById(R.id.viewpager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        ViewStateAdapter viewStateAdapter=new ViewStateAdapter(fragmentManager,getLifecycle());
        viewPager2.setAdapter(viewStateAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Cultural").setIcon(R.drawable.outline_public_24));
        tabLayout.addTab(tabLayout.newTab().setText("Religious").setIcon(R.drawable.outline_fort_24));
        tabLayout.addTab(tabLayout.newTab().setText("Medical").setIcon(R.drawable.outline_science_24));
        tabLayout.addTab(tabLayout.newTab().setText("Leisure").setIcon(R.drawable.outline_sailing_24));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}