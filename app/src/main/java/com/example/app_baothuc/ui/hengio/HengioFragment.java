package com.example.app_baothuc.ui.hengio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_baothuc.databinding.FragmentHengioBinding;

public class HengioFragment extends Fragment {

    private FragmentHengioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HengioViewModel hengioViewModel = new ViewModelProvider(this).get(HengioViewModel.class);

        binding = FragmentHengioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.edtTime;
        HengioViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}