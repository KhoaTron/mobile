package com.example.app_baothuc.ui.hengio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HengioViewModel extends ViewModel {
    private static MutableLiveData<String> mText = null;

    public HengioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hengio");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}
