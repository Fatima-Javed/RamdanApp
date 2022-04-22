package com.example.ramadan_app.ui.dua;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DuaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DuaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dua fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}