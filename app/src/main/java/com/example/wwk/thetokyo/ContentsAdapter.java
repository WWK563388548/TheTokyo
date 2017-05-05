package com.example.wwk.thetokyo;

import android.app.Activity;
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

/**
 * Created by wwk on 17/4/17.
 */

public class ContentsAdapter extends ArrayAdapter<Contents> {

    private int mColorResourceId;

    public ContentsAdapter(Activity context, ArrayList<Contents> Spots, int colorResourceId) {
        super(context, 0 ,Spots);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link contents} object located this position in the list
        Contents currentCotents = getItem(position);

        ImageView displayImage = (ImageView) listItemView.findViewById(R.id.image_view);
        // Check if an image is provided for this word or not
        if (currentCotents.hasImage()) {

            // If an image is available, display the provided image based on the resource ID
            displayImage.setImageResource(currentCotents.getmImageResourceId());

            // Make sure the view is visible
            displayImage.setVisibility(View.VISIBLE);
        } else {

            // Otherwise hide the ImageView (set visibility to GONE)
            displayImage.setVisibility(View.GONE);
        }


        // Set the theme color for the list item
        View textcontainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textcontainer.setBackgroundColor(color);


        // Find the TextView in the list_item.xml layout with the ID japanese_text_view.
        TextView spotNameTextView = (TextView) listItemView.findViewById(R.id.spotname_text_view);

        // Get the Japanese translation from the currentWords object and set this text
        // on the TextView
        spotNameTextView.setText(currentCotents.getmSpotsName());

        TextView spotAddressTextView = (TextView) listItemView.findViewById(R.id.spotaddress_text_view);
        spotAddressTextView.setText(currentCotents.getmSpotsAddress());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}
