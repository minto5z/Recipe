package com.ahyoxsoft.recipe.extra;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ahyoxsoft.recipe.DashboardActivity;
import com.ahyoxsoft.recipe.R;
import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExtraThreeFragment extends Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    SliderLayout advertSlider;
    DashboardActivity dashboardActivity;

    public ExtraThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_extra_three, container, false);

        advertSlider = (SliderLayout) view.findViewById(R.id.slider);

        /**
        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("Hannibal", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
        url_maps.put("Game of Thrones", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");
         **/

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Hannibal",R.drawable.advert);
        file_maps.put("Big Bang Theory",R.drawable.recipe_1);
        file_maps.put("House of Cards",R.drawable.recipe_3);
        file_maps.put("Game of Thrones", R.drawable.recipe_2);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(dashboardActivity);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            advertSlider.addSlider(textSliderView);
        }
        advertSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        advertSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        advertSlider.setCustomAnimation(new DescriptionAnimation());
        advertSlider.setDuration(4000);


        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        advertSlider.stopAutoCycle();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        dashboardActivity = (DashboardActivity) context;
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
