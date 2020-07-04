package com.bismillah.penyetan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity {
    FrameLayout frameLayout;
    LinearLayout layout_tab;
    TabLayout tab;
    ViewPager ViewPager;

    boolean load_fragment_buttom(Fragment fragment){
        if(fragment!=null){
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.layout_frame, fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        layout_tab=(LinearLayout)findViewById(R.id.layout_tab);
        frameLayout=(FrameLayout)findViewById(R.id.layout_frame);
        tab=(TabLayout)findViewById(R.id.tab);
        ViewPager=(ViewPager)findViewById(R.id.ViewPager);
        Tab_adapter tab_adapter=new Tab_adapter(getSupportFragmentManager(),tab.getTabCount());
        ViewPager.setAdapter(tab_adapter);
        ViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Hadiah");
            setSupportActionBar(toolbar);
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.hadiah);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.beranda:
                        layout_tab.setVisibility(View.VISIBLE);
                        frameLayout.setVisibility(View.GONE);
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.hadiah:
                        layout_tab.setVisibility(View.GONE);
                        frameLayout.setVisibility(View.VISIBLE);
                        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.toko:
                        layout_tab.setVisibility(View.VISIBLE);
                        frameLayout.setVisibility(View.GONE);
                        startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.menu:
                        layout_tab.setVisibility(View.VISIBLE);
                        frameLayout.setVisibility(View.GONE);
                        startActivity(new Intent(getApplicationContext(), Main4Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.lainnya:
                        layout_tab.setVisibility(View.VISIBLE);
                        frameLayout.setVisibility(View.GONE);
                        startActivity(new Intent(getApplicationContext(), Main5Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                }
                return false;
            }
        });



    }


}
class Tab_adapter extends FragmentStatePagerAdapter{
    int jumlahTab;
    public Tab_adapter(FragmentManager fm, int jumlahTab) {
        super(fm);
        this.jumlahTab = jumlahTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                tab_1 tab1=new tab_1();
                return tab1;
            case 1:
                tab_2 tab2=new tab_2();
                return tab2;

        }
        return null;
    }

    @Override
    public int getCount() {
        return jumlahTab;
    }
}