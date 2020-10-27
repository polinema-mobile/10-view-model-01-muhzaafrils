package id.putraprima.courtcounter.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.courtcounter.R;
import id.putraprima.courtcounter.databinding.FragmentCounterBinding;
import id.putraprima.courtcounter.models.Score;
import id.putraprima.courtcounter.viewmodels.CounterViewModels;

public class CounterFragment extends Fragment {

    public CounterViewModels mViewModels;

    public CounterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentCounterBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_counter, container, false);
        mViewModels = new ViewModelProvider(this).get(CounterViewModels.class);
        binding.setCounterViewModel(mViewModels);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}