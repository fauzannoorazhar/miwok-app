package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JurigXiaomi on 2/24/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> Word, int colorResourceId) {
        super(context,0, Word);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // GetItem is public method from class arrayAdapter
        // With param is integer (position)
        // Get the {@link Word} object located at this position in the list
        Word words = (Word) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID wibu_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.wibu_text_view);
        miwokTextView.setText(words.getWibuTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(words.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_icon_view);

        // Check if an image is provided for this word or not
        if (words.hasImage()){
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(words.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
