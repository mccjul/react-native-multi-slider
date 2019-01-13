import * as React from "react";
import { ColorPropType } from "react-native";
export interface RNMultiSliderProps extends React.Props<RNMultiSlider> {
  readonly minimumValue?: number;
  readonly maximumValue?: number;
  readonly lowerValue?: number;
  readonly lowerMaximumValue?: number;
  readonly upperValue?: number;
  readonly upperMinimumValue?: number;
  readonly minimumRange?: number;
  readonly stepValue?: number;
  readonly stepValueContinuously?: boolean;
  readonly continuous?: boolean;
  readonly lowerCenter?: {}; // CGPoint?
  readonly upperCenter?: {}; // CGPoint?
  readonly onChange?: (value: number) => void;
  readonly trackColor?: ColorPropType;
  readonly disabled?: boolean;
}
export default class RNMultiSlider extends React.PureComponent<
  RNMultiSliderProps
> {
  render(): JSX.Element;
}
