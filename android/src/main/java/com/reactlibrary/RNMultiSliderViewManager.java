package com.reactlibrary;

import android.app.Activity;
import android.support.annotation.Nullable;

import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

import io.apptik.widget.MultiSlider;

class RNMultiSliderViewManager extends SimpleViewManager<MultiSlider> {
    private ThemedReactContext mContext = null;
    private Activity mActivity = null;
    public static final String REACT_CLASS = "RCTRNMultiSliderView";

    public RNMultiSliderViewManager(Activity activity) {
        mActivity = activity;
    }

    @Override
    public MultiSlider createViewInstance(ThemedReactContext context){
        mContext = context;
        return new MultiSlider(context);
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "numOfSliders")
    public void setNumOfSliders(MultiSlider view, int numOfSliders) {
        view.addThumb(numOfSliders);
    }

    @ReactProp(name = "max")
    public void setMax(MultiSlider view, int max) {
        view.setMax(max);
    }

    @ReactProp(name = "min")
    public void setMin(MultiSlider view, int min) {
        view.setMin(min);
    }


    @ReactProp(name = "steps")
    public void setSteps(MultiSlider view, int steps) {
        view.setStep(steps);
    }
}
