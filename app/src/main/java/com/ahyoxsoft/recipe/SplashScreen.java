package com.ahyoxsoft.recipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.ahyoxsoft.recipe.fragments.ExploreInfographicFragment;
import com.ahyoxsoft.recipe.fragments.MakeInfographicFragment;
import com.ahyoxsoft.recipe.fragments.ShareInfographicFragment;
import com.rd.PageIndicatorView;
import com.rd.animation.type.AnimationType;
import com.rd.draw.data.Orientation;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        initViews();
    }

    /**
     * Initialize views used in this activity
     */
    private void initViews() {
        ScreenSlidePagerAdapter adapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(adapter);

        PageIndicatorView pageIndicatorView = (PageIndicatorView) findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(pager);

        pageIndicatorView.setAnimationType(AnimationType.SWAP);
        pageIndicatorView.setOrientation(Orientation.HORIZONTAL);
        pageIndicatorView.setAutoVisibility(true);


        //This register and listen to close button being pressed
        findViewById(R.id.closeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When button is pressed close application
                finish();
            }
        });

    }


    /**
     * A simple pager adapter that represents 3 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new ShareInfographicFragment();//Share page info graphic
                    break;
                case 1:
                    fragment = new ExploreInfographicFragment();//Explore page info graphic
                    break;
                case 2:
                    fragment = new MakeInfographicFragment();//Make page info graphic
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;//No of fragment created
        }
    }


}
