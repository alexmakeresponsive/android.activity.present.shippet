package ru.amrxt.androidactivitypresentshippet;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import ru.amrxt.androidactivitypresentshippet.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    final Fragment[] fragmentList = new Fragment[] {
        new WithViewModelFragment(),
        new ContentMiddle2Fragment(),
        new ContentMiddleMainFragment(),
        new ContentMiddle4Fragment(),
        new ContentMiddle5Fragment(),
        new ContentMiddleMainChild1Fragment(),
        new ContentMiddleMainChild2Fragment(),
        new ContentMiddleMainChild3Fragment(),
        new ContentMiddleMainChild3Fragment(),
    };

    final BottomSheetDialogFragment[] fragmenBottomtList = new BottomSheetDialogFragment[] {
        new MedDocListDialogFragment()
    };

    final Class[] classtList = new Class[] {
        MovieListActivity.class,
        FullscreenActivity.class,
        MainViewModelActivity2.class,
        NavDrawerActivity.class,
        BottomNavActivity.class,
        TabbedActivity.class,
        ScrollingActivity.class,
        LoginActivity.class,
        SettingsActivity.class,
    };

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

    public void contentFragmentReplace(Integer index) {
        FragmentManager fragmentManager         = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                            fragmentTransaction.replace(R.id.fragment_container, fragmentList[index]);
                            fragmentTransaction.commit();
    }

    public void contentFragmentShow(Integer index) {
//        System.out.println(index);
        BottomSheetDialogFragment bottomSheetDialogFragments = fragmenBottomtList[index];

        bottomSheetDialogFragments.show(getSupportFragmentManager(), "medDocumentListDialog");
    }

    public void contentActivityStart(Integer index) {

        Intent intent = new Intent(this, classtList[index]);

        startActivity(intent);
    }
}
