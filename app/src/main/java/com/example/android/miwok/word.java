package com.example.android.miwok;

import static android.bluetooth.BluetoothClass.Service.AUDIO;

/**
 * Created by El.Doc on 24/01/2017.
 */

public class word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId =NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId ;


    public word(String defaultTranslation, String miwokTranslation ,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;

      }
    public word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioResourceId) {
        mImageResourceId=imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
         public String getDefaultTranslation() {
         return mDefaultTranslation;
      }
         public String getMiwokTranslation() {
               return mMiwokTranslation;
      }
         public int getimageResourceId() {
        return mImageResourceId;
    }
        public int getmAudioResourceId(){return mAudioResourceId;}
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
