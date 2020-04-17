package ru.amrxt.androidactivitypresentshippet.ui.mainviewmodelactivity2;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.amrxt.androidactivitypresentshippet.R;

public class MainViewModelActivity2Fragment extends Fragment {

    private MainViewModelActivity2ViewModel mViewModel;

    public static MainViewModelActivity2Fragment newInstance() {
        return new MainViewModelActivity2Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_view_model_activity2_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModelActivity2ViewModel.class);
        // TODO: Use the ViewModel
    }

}
