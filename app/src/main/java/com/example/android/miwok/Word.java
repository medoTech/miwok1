package com.example.android.miwok;

public class Word {
    private String mDefaltTranslation;
    private String mMiwokTranslation;

public Word(String defaltTranslation, String miwokTranslation){
    mDefaltTranslation = defaltTranslation;
    mMiwokTranslation = miwokTranslation;
}

    public String getDefaltTranslation() {
        return mDefaltTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
