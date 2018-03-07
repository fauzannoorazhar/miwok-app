package com.example.android.miwok;

import android.content.Intent;

/**
 * Created by JurigXiaomi on 2/23/2018.
 */

public class Word {

    /** Default translation for word*/
    private String mDefaultTranslation;

    /** Miwok translation for word*/
    private String mWibuTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as Indonesia)
     * @param wibuTranslation is the word in the Japanes language
     *
     */
    public Word(String defaultTranslation, String wibuTranslation){
        mDefaultTranslation = defaultTranslation;
        mWibuTranslation = wibuTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as Indonesia)
     * @param wibuTranslation is the word in the Japanes language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String wibuTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mWibuTranslation = wibuTranslation;
        mImageResourceId = imageResourceId;
    }

    public Word(String defaultTranslation, String wibuTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mWibuTranslation = wibuTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getWibuTranslation() {
        return mWibuTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /** Check if hasImage */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
