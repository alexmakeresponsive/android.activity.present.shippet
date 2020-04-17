package ru.amrxt.androidactivitypresentshippet;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class ContentMiddleMainFragment extends Fragment {

    final int[] listButton = new int[] {
            0,
            0,
            0,
            0,
            0,
            R.id.button8,
            R.id.button9,
            R.id.button10,
    };

    final int[] listButtonForActivity = new int[] {
            R.id.button6,
            R.id.button7,
            R.id.button11,
            R.id.button12,
            R.id.button13,
            R.id.button14,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_content_middle_main, container, false);

        for (int i=5; i<=7; i++)
        {
            final int index = i;
            final Button button = (Button) view.findViewById(listButton[i]);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    ((MainActivity)getActivity()).contentFragmentReplace(index);
                }
            });
        }

        for (int i=0; i<=5; i++)
        {
            final int index = i;
            final Button button = (Button) view.findViewById(listButtonForActivity[i]);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    ((MainActivity)getActivity()).contentActivityStart(index);
                }
            });
        }

        return view;
    }
}
