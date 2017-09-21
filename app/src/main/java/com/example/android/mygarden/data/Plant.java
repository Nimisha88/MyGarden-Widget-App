package com.example.android.mygarden.data;

/**
 * Created by T2MISHU on 9/21/2017.
 */

public class Plant {

    private int mPlantID;
    private int mPlantType;
    private long mPlantCreationTime;
    private long mPlantLastWateredTime;

    public int getPlantID() {
        return mPlantID;
    }

    public int getPlantType() {
        return mPlantType;
    }

    public long getPlantCreationTime() {
        return mPlantCreationTime;
    }

    public long getPlantLastWateredTime() {
        return mPlantLastWateredTime;
    }
}
