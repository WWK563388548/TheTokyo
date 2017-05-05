package com.example.wwk.thetokyo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wwk on 17/4/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     * across swipes.
     */

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     *
     */

    // Try to optimize Fragment for better extensibility and maintain

    private Fragment[] pages = new Fragment[] {
            new SpotListFragment(),
            new RestaurantListFragment(),
            new HotelListFragment(),
            new ShoppingListFragment()
    };

    @Override
    public Fragment getItem(int position) {
        return pages[position];
    }

    /**
     * Return the total number of pages.
     */

    @Override
    public int getCount() {
        return pages.length;
    }

    private CharSequence[] titles = new CharSequence[] {
            mContext.getString(R.string.category_listOne),
            mContext.getString(R.string.category_listTwo),
            mContext.getString(R.string.category_listFour),
            mContext.getString(R.string.category_listThree)
    };

    @Override
    public CharSequence getPageTitle(int position) {
       return titles[position];
    }
}
