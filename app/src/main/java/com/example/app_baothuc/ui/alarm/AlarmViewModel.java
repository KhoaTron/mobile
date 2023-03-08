package com.example.app_baothuc.ui.alarm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlarmViewModel extends ViewModel {

    private static MutableLiveData<String> mText = null;

    public AlarmViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Alarm");
    }

    public static LiveData<String> getText() {
        return mText;
    }
}