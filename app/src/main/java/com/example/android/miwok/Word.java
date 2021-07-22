package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioId;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResouceId, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResouceId;
        mAudioId = audioId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

    public int getAudioResourceId() {
        return mAudioId;
    }


}
