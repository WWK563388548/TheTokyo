package com.example.wwk.thetokyo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wwk on 17/4/17.
 */

public class categoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link categoryAdapter} object.
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     * across swipes.
     */

    public categoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     *
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new spotListFragment();
        } else if (position == 1) {
            return new restaurantListFragment();
        } else if (position == 2){
            return new hotelListFragment();
        } else {
            return new shoppingListFragment();
        }
    }

    /**
     * Return the total number of pages.
     */

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_listOne);
        } else if (position == 1) {
            return mContext.getString(R.string.category_listTwo);
        } else if (position == 2) {
            return mContext.getString(R.string.category_listFour);
        } else {
            return mContext.getString(R.string.category_listThree);
        }
    }
}
