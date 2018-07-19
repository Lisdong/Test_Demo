package com.example.lrd.mvp.main;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.SegmentTabLayout;

/**
 * Created by lrd on 2018/2/1.
 */

public interface MainModel {
    interface OnChangeListener{
        void init();
        void change(int position);
    }
    void changeState(Context context, FragmentManager fragmentManager, CommonTabLayout tabLayout, ViewPager viewPager, OnChangeListener listener);
}
