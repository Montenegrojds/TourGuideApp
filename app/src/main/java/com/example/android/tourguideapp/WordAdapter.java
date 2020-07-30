package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words) {




        super(context,0,words);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord= getItem(position);

        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.nombre_lugar);
        miwokTextView.setText(currentWord.getMiwokTranslation());



        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.descripcion_lugar);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());




        return listItemView;

    }

}