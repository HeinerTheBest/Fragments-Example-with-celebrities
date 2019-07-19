package com.mobileapps.week05day04fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobileapps.week05day04fragment.database.DbHelperFake;
import com.mobileapps.week05day04fragment.models.Celebrity;
import com.squareup.picasso.Picasso;


public class DescriptionFragment extends Fragment {


    private TextView tvFirstName, tvLastName, tvCategory, tvBio;
    private ImageView imgCelebrity;
    private Context context;


    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        context =view.getContext();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvFirstName = view.findViewById(R.id.tvFirstName);
        tvLastName  = view.findViewById(R.id.tvLastName);
        tvCategory  = view.findViewById(R.id.tvCategory);
        tvBio       = view.findViewById(R.id.tvBio);
        imgCelebrity= view.findViewById(R.id.imgCelebrity);
    }



    public void setNameToFind(String string)
    {
        DbHelperFake db = new DbHelperFake();
        Celebrity celebrity = db.getCelebrityByName(string, db.getFakeListOfCelebrity());
        tvFirstName.setText(celebrity.getFirstName());
        tvLastName.setText(celebrity.getLastName());
        tvCategory.setText(celebrity.getCategory());
        tvBio.setText(celebrity.getBio());


        Resources res = getResources();
        String mDrawableName = celebrity.getPicture();
        int resID = res.getIdentifier(mDrawableName , "drawable", context.getOpPackageName());
        Drawable drawable = res.getDrawable(resID );
        imgCelebrity.setImageDrawable(drawable );

    }

}
