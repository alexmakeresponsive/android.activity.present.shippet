package ru.amrxt.androidactivitypresentshippet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.amrxt.androidactivitypresentshippet.ui.mainviewmodelactivity2.MainViewModelActivity2Fragment;

public class MainViewModelActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view_model_activity2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainViewModelActivity2Fragment.newInstance())
                    .commitNow();
        }
    }
}
