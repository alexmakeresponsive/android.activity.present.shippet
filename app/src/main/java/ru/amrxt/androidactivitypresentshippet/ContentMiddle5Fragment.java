package ru.amrxt.androidactivitypresentshippet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class ContentMiddle5Fragment extends Fragment {

    final int[] listButton = new int[] {
            R.id.button18,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_content_middle_5, container, false);

        for (int i=0; i<1; i++)
        {
            final int index = i;
            final Button button = (Button) view.findViewById(listButton[i]);
            button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    ((MainActivity)getActivity()).contentFragmentShow(index);
                }
            });
        }


        return view;
    }
}
