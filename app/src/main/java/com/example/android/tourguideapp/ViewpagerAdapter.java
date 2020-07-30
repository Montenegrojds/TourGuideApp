package com.example.android.tourguideapp;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter{

    private Context mContext;

    /**
     * Create a new {@link ViewpagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public ViewpagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LugaresTFragment();
        } else if (position == 1) {
            return new RestaurantesFragment();
        } else if (position == 2) {
            return new HotelesFragment();
        } else {
            return new CiudadesFragment();
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
            return mContext.getString(R.string.category_lugarest);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurantes);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hoteles);
        } else {
            return mContext.getString(R.string.category_ciudades);
        }
    }
}
