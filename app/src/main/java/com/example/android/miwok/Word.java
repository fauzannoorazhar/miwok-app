package com.example.android.miwok;

/**
 * Created by JurigXiaomi on 2/23/2018.
 */

public class Word {

    /*Default translation for word*/
    private String mDefaultTranslation;

    /*Miwok translation for word*/
    private String mMiwokTranslation;

    /*Construct object word*/
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
