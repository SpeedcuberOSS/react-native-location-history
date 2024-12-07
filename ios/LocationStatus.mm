#import "LocationStatus.h"
#import <React/RCTLog.h>

@implementation LocationStatus
RCT_EXPORT_MODULE()

// Example method
// See // https://reactnative.dev/docs/legacy/native-modules-ios
RCT_EXPORT_METHOD(isLocationEnabled:(RCTPromiseResolveBlock)resolve
                  reject:(RCTPromiseRejectBlock)reject)
{
    RCTLogInfo(@"Invoking isLocationStatus from Objective-C");
    resolve(@NO);  // UNSUPPORTED: I haven't added iOS support yet.
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeLocationStatusSpecJSI>(params);
}
#endif

@end
