#import "RCTBridgeModule.h"
#import "RCTViewManager.h"
#import "NMRangeSlider.h"

@interface RNMultiSlider : RCTViewManager

- (void)sendValues:(NSString *)eventName touch:(UITouch *)touch;

@end
