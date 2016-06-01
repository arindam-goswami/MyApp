package com.mymenu.freshmenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int NumbOfTabs) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = NumbOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            TabMain tab1 = new TabMain();
            return tab1;
        }
        else if (position == 1){
            TabSalads tab2 = new TabSalads();
            return tab2;
        }
        else{
            TabDesserts tab3 = new TabDesserts();
            return tab3;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
