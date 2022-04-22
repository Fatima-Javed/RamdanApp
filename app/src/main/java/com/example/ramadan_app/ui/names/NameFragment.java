package com.example.ramadan_app.ui.names;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ramadan_app.databinding.FragmentNamesBinding;

public class NameFragment extends Fragment {
    private FragmentNamesBinding binding;
    Activity context;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        context=getActivity();
        NameViewModel nameViewModel =
                new ViewModelProvider(this).get(NameViewModel.class);

        binding = FragmentNamesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       /* final TextView textView = binding.textName;
        nameViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);*/
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
