package com.example.app_baothuc.ui.alarmadd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_baothuc.databinding.FragmentAlarmaddBinding;

import com.example.app_baothuc.ui.bamgio.BamgioViewModel;

public class AlarmaddFragment extends Fragment {
    private FragmentAlarmaddBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AlarmaddViewModel alarmaddViewModel = new ViewModelProvider(this).get(AlarmaddViewModel.class);

        binding = FragmentAlarmaddBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAlarmadd;
        AlarmaddViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
