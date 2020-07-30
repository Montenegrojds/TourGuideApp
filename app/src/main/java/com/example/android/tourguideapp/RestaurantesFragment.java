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
public class RestaurantesFragment extends Fragment {


    public RestaurantesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list,container,false);

       ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.restaurante_des1,R.string.restaurante_1,R.drawable.chicha));
        words.add(new Word(R.string.restaurante_des2,R.string.restaurante_2,R.drawable.ekeko));
        words.add(new Word(R.string.restaurante_des3,R.string.restaurante_3,R.drawable.guisos));
        words.add(new Word(R.string.restaurante_des4,R.string.restaurante_4,R.drawable.gaucho));

        WordAdapter adapter = new WordAdapter(getActivity(), words);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
