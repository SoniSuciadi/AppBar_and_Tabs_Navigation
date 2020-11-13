package com.sonisuciadi.si52.appbarandtabsnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FloatingActionButton floatingActionButton;
    private TabsFragmentStatePageAdapter tabsFragmentStatePageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabsLayout);
        floatingActionButton=findViewById(R.id.fab);
        tabsFragmentStatePageAdapter= new TabsFragmentStatePageAdapter(getSupportFragmentManager());
        tabsFragmentStatePageAdapter.addFragment(new HomeFragment(),"Home");
        tabsFragmentStatePageAdapter.addFragment(new MenuFragment(),"Menu");
        tabsFragmentStatePageAdapter.addFragment(new ProfilFragment(),"Profil");

        viewPager.setAdapter(tabsFragmentStatePageAdapter);
        tabLayout.setVisibility(View.VISIBLE);
        tabLayout.setupWithViewPager(viewPager);

    }
}