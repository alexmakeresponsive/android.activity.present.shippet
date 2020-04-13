package ru.amrxt.androidactivitypresentshippet;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class ContentMiddleMainFragment extends Fragment {

    final int[] listCheckbox = new int[] {
            R.id.checkedTextView,
            R.id.checkedTextView2,
            R.id.checkedTextView3,
            R.id.checkedTextView4
    };

    final String[] listAutocompleteCountry = new String[] {
        "Rossia",
        "Belarussia",
        "Ukraine",
        "Kazahstan",
        "Litva",
        "Latvia",
    };

    final String[] listAutocompleteCountryRegions = new String[] {
            "Omsksaya oblast",
            "Moskovskaya oblast",
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_content_middle_main, container, false);



        return view;
    }
}
