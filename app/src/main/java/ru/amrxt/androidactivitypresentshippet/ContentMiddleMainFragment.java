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

        for (int i=0; i<=3; i++)
        {
            final CheckedTextView textView = view.findViewById(listCheckbox[i]);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View view) {
                    if (textView.isChecked()) {
                        textView.setChecked(false);
                        textView.setCheckMarkDrawable(android.R.drawable.checkbox_off_background);
                    } else {
                        textView.setChecked(true);
                        textView.setCheckMarkDrawable(android.R.drawable.checkbox_on_background);
                    }
                }
            });

        }

        AutoCompleteTextView autoCompleteTextView = view.findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter              = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item, listAutocompleteCountry);

                             autoCompleteTextView.setAdapter(adapter);


        MultiAutoCompleteTextView multiAutoCompleteTextView = view.findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> adapterMultiple                = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item, listAutocompleteCountryRegions);

                                  multiAutoCompleteTextView.setAdapter(adapterMultiple);
                                  multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


        return view;
    }
}
