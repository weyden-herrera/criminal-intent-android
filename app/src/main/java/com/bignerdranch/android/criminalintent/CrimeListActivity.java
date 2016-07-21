package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.fragment.CrimeListFragment;

/**
 * Created by weyden.herrera on 7/20/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
