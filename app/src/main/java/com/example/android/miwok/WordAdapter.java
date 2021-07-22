package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColor = color;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);


        if(currentWord.hasImage()) {
                imageView.setImageResource(currentWord.getImageResourceId());
                imageView.setVisibility((View.VISIBLE));
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        View listText = listItemView.findViewById(R.id.text_container);
        listText.setBackgroundColor(ContextCompat.getColor(getContext(), mColor));

        return listItemView;
    }
}
