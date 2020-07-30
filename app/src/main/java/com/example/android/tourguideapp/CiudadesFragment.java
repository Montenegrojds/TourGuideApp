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
public class CiudadesFragment extends Fragment {


    public CiudadesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list,container,false);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.cuzcodes,R.string.cuzco,R.drawable.cuzco));
        words.add(new Word(R.string.trujillodes,R.string.trujillo,R.drawable.trujillo));
        words.add(new Word(R.string.callaodes,R.string.callao,R.drawable.callao));

        WordAdapter adapter = new WordAdapter(getActivity(), words);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
