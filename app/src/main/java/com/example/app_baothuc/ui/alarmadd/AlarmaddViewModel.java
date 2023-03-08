package com.example.app_baothuc.ui.alarmadd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlarmaddViewModel extends ViewModel {

    private static MutableLiveData<String> mText = null;

    public AlarmaddViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("them bao thuc");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}