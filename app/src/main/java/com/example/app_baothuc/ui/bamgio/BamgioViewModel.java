package com.example.app_baothuc.ui.bamgio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BamgioViewModel extends ViewModel {

    private static MutableLiveData<String> mText = null;

    public BamgioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("bamgio");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}