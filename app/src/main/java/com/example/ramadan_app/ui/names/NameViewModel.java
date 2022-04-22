package com.example.ramadan_app.ui.names;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NameViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public NameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Name fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
