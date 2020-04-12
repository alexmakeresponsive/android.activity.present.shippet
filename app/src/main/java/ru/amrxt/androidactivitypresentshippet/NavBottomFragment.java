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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class NavBottomFragment extends Fragment {

    final int[] listButton = new int[] {
        R.id.button1,
        R.id.button2,
        R.id.button3,
        R.id.button4,
        R.id.button5,
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_bottom, container, false);

        for (int i=0; i<=4; i++)
        {
            final Button button = (Button) view.findViewById(listButton[i]);
                         button.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    System.out.println(button.getText());
                }
            });
        }

        return view;
    }
}
