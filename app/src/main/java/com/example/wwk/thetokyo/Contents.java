package com.example.wwk.thetokyo;

/**
 * Created by wwk on 17/4/17.
 */

public class Contents {

    private String mSpotsName;

    private String mSpotsAddress;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Contents (String spotsName, String spotsAddress, int imageResourceId) {
        mSpotsName = spotsName;
        mSpotsAddress = spotsAddress;
        mImageResourceId = imageResourceId;
    }

    public String getmSpotsName() {
        return mSpotsName;
    }

    public String getmSpotsAddress() {
        return mSpotsAddress;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
