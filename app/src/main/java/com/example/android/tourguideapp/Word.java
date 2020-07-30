package com.example.android.tourguideapp;

public class Word {


    private int mDefaultTranslation;

    private int mMiwokTranslation;

    private int mImageResourceId;

    /*
     * contructor nuevo para 2 textos
     *
     *
     * */


    public Word(int defaultTranslation, int miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*
     * contructor nuevo para 2 textos y una imagen
     *
     *
     * */

    public Word(int defaultTranslation, int miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public int getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }




}

