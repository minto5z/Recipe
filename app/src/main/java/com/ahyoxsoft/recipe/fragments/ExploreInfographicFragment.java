package com.ahyoxsoft.recipe.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahyoxsoft.recipe.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreInfographicFragment extends Fragment {


    public ExploreInfographicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore_infographic, container, false);
    }

}
