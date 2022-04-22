package com.example.ramadan_app.ui.dua;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ramadan_app.databinding.FragmentDuaBinding;

public class DuaFragment extends Fragment {

    private FragmentDuaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DuaViewModel slideshowViewModel =
                new ViewModelProvider(this).get(DuaViewModel.class);

        binding = FragmentDuaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       /* final TextView textView = binding.textDua;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}