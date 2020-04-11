package ru.amrxt.androidactivitypresentshippet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class NavBottomFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_bottom, container, false);

        Button button = (Button) view.findViewById(R.id.button1);
               button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Button button = (Button) view.findViewById(R.id.button1);



                System.out.println(button.getText());
            }
        });

        return view;
    }
}
