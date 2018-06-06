package com.ahyoxsoft.recipe.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ahyoxsoft.recipe.LoginActivity;
import com.ahyoxsoft.recipe.R;
import com.ahyoxsoft.recipe.SplashScreen;

/**
 * A simple {@link Fragment} subclass.
 */
public class MakeInfographicFragment extends Fragment {
    private SplashScreen mSplashScreen;


    public MakeInfographicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_make_infographic, container, false);

        view.findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Store action in preference so that we know when to display info graphics
                startActivity(new Intent(mSplashScreen, LoginActivity.class));
                mSplashScreen.finish();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mSplashScreen = (SplashScreen) context;
    }
}
