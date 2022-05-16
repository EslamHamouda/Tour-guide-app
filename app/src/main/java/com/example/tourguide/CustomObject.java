package com.example.tourguide;

public class CustomObject {

    private int mImageResourceId;


    private int mTitle;


    private int mDescription;

    public CustomObject(int mImageResourceId, int mTitle, int mDescription) {
        this.mImageResourceId = mImageResourceId;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmTitle() {
        return mTitle;
    }

    public int getmDescription() {
        return mDescription;
    }
}
