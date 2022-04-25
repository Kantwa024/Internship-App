package com.kantwarahul.nhai;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    private int Indx = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        try {
            Intent intent = getIntent();
            Indx = intent.getIntExtra("indx",0);
        }catch (Exception e){
            e.printStackTrace();
        }
        tabLayout= findViewById(R.id.tabLayout);
        viewPager= findViewById(R.id.viewPager);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Indian Codes");
        arrayList.add("American Codes");
        arrayList.add("Related Research Papers");

        prepareViewPager(viewPager,arrayList);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void prepareViewPager(ViewPager viewPager, ArrayList<String> arrayList) {
        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        Bundle bundle = new Bundle();
        bundle.putInt("indx",Indx);

        IndianFragment tabFragment1 = new IndianFragment();
        tabFragment1.setArguments(bundle);
        mainAdapter.addFragment(tabFragment1,arrayList.get(0));
        AmericanFragment tabFragment2 = new AmericanFragment();
        tabFragment2.setArguments(bundle);
        mainAdapter.addFragment(tabFragment2,arrayList.get(1));
        RelatedResearchPapersFragment tabFragment3 = new RelatedResearchPapersFragment();
        tabFragment3.setArguments(bundle);
        mainAdapter.addFragment(tabFragment3,arrayList.get(2));

        viewPager.setAdapter(mainAdapter);
    }

    private class MainAdapter extends FragmentPagerAdapter {
        ArrayList<String> arrayList = new ArrayList<>();
        List<Fragment> fragmentList = new ArrayList<>();

        public MainAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }


        public void addFragment(Fragment fragment,String title)
        {
            arrayList.add(title);
            fragmentList.add(fragment);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return arrayList.get(position);
        }
    }
}