// @flow

// $FlowFixMe
import React, { requireNativeComponent, ColorPropType } from "react-native";

const RNMultiSliderNative = requireNativeComponent("RCTRNMultiSliderView");

type RNMultiSliderProps = {
  minimumValue?: number,
  maximumValue?: number,
  lowerValue?: number,
  lowerMaximumValue?: number,
  upperValue?: number,
  upperMinimumValue?: number,
  minimumRange?: number,
  stepValue?: number,
  stepValueContinuously?: boolean,
  continuous?: boolean,
  lowerCenter?: {}, // CGPoint?
  upperCenter?: {}, // CGPoint?
  onChange?: (value: number) => void,
  trackColor?: ColorPropType,
  disabled?: boolean
};

type RNMultiSliderState = RNMultiSliderProps;

class RNMultiSlider extends React.PureComponent<
  RNMultiSliderProps,
  RNMultiSliderState
> {
  componentDidMount() {
    this.setState({ ...this.props });
  }

  componentWillReceiveProps(nextProps: RNMultiSliderProps) {
    this.setState(nextProps);
  }

  convertNativeEvent = (event: any) => {
    return [
      parseInt(event.nativeEvent.lowerValue, 10),
      parseInt(event.nativeEvent.upperValue, 10)
    ];
  };

  _onChange = (event: any) => {
    if (!this.props.onChange) {
      return;
    }
    this.props.onChange(this.convertNativeEvent(event));
  };

  render() {
    return (
      <RNMultiSliderNative
        {...this.props}
        lowerValue={0}
        upperValue={0}
        disabled={false}
        {...this.state}
        onChange={this._onChange}
      />
    );
  }
}

export default RNMultiSlider;
