package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelesFragment extends Fragment {


    public HotelesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list,container,false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.hotel_des1,R.string.hotel_1,R.drawable.hotel1));
        words.add(new Word(R.string.hotel_des2,R.string.hotel_2,R.drawable.hotel2));
        words.add(new Word(R.string.hotel_des3,R.string.hotel_3,R.drawable.hotel3));

        WordAdapter adapter = new WordAdapter(getActivity(), words);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;

}
}
