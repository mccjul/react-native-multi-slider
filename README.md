# react-native-multi-slider

This is currently under development. It doesn't work yet.

## Getting started

`$ npm install react-native-multi-slider --save`

### Mostly automatic installation

`$ react-native link react-native-multi-slider`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-multi-slider` and add `RNMultiSlider.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMultiSlider.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNMultiSliderPackage;` to the imports at the top of the file
- Add `new RNMultiSliderPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
   ```
   include ':react-native-multi-slider'
   project(':react-native-multi-slider').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-multi-slider/android')
   ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
   ```
     compile project(':react-native-multi-slider')
   ```

## Usage

```javascript
import RNMultiSlider from "react-native-multi-slider";

// TODO: What to do with the module?
RNMultiSlider;
```
