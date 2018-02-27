package com.example.android.miwok;

/**
 * Created by JurigXiaomi on 2/23/2018.
 */

public class Word {

    /*Default translation for word*/
    private String mDefaultTranslation;

    /*Miwok translation for word*/
    private String mWibuTranslation;

    /*Construct object word*/
    public Word(String defaultTranslation, String wibuTranslation){
        mDefaultTranslation = defaultTranslation;
        mWibuTranslation = wibuTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getWibuTranslation() {
        return mWibuTranslation;
    }
}
