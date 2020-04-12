package ru.amrxt.androidactivitypresentshippet;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager         = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        ContentMiddleMainFragment fragment = new ContentMiddleMainFragment();

                            fragmentTransaction.add(R.id.fragment_container, fragment);
                            fragmentTransaction.commit();
    }
}
