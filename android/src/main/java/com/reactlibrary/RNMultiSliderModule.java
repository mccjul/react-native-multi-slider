
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import io.apptik.widget.MultiSlider;

public class RNMultiSliderModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
//  MultiSlider multiSlider = (MultiSlider)v.findViewById(R.id.range_slider);

//    multiSlider.setOnThumbValueChangeListener(new MultiSlider.OnThumbValueChangeListener() {
//    @Override
//    public void onValueChanged(MultiSlider multiSlider, MultiSlider.Thumb thumb,
//    int thumbIndex,
//    int value)
//    {
//      if (thumbIndex == 0) {
//        doSmth(String.valueOf(value));
//      } else {
//        doSmthElse(String.valueOf(value));
//      }
//    }
//  });

  public RNMultiSliderModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMultiSlider";
  }
}