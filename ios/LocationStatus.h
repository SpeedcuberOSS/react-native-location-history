
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNLocationStatusSpec.h"

@interface LocationStatus : NSObject <NativeLocationStatusSpec>
#else
#import <React/RCTBridgeModule.h>

@interface LocationStatus : NSObject <RCTBridgeModule>
#endif

@end
