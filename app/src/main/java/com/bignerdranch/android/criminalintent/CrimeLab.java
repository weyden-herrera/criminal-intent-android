package com.bignerdranch.android.criminalintent;

import android.content.Context;

import com.bignerdranch.android.criminalintent.model.Crime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by weyden.herrera on 7/20/2016.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    private CrimeLab(Context context){
        mCrimes = new ArrayList<Crime>();

        //temp
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Every other one
            mCrimes.add(crime);
        }
    }

    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes){
            if(crime.getId() == id){
                return crime;
            }
        }
        return null;
    }
}
