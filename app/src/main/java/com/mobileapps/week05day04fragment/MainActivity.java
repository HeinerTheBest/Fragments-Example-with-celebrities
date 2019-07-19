package com.mobileapps.week05day04fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements ListFragment.OnFragmentInteractionListener{


    private FragmentManager fragmentManager;
    private DescriptionFragment descriptionFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        setUpAndAddDescriptionFragment();
        setUpAndAddListFragment();
    }

    private void setUpAndAddDescriptionFragment()
    {
       descriptionFragment = new DescriptionFragment();
       fragmentManager.beginTransaction()
               .add(R.id.frmDescription,descriptionFragment)
               .addToBackStack("DESCRIPTION_FRAGMENT")
               .commit();
    }

    private void setUpAndAddListFragment()
    {
        ListFragment listFragment = new ListFragment();
        fragmentManager.beginTransaction()
                .add(R.id.frmList, listFragment)
                .addToBackStack("LIST_FRAGMENT")
                .commit();
    }

    @Override
    public void onFragmentInteraction(String s)
    {
        descriptionFragment.setNameToFind(s);
    }
}
