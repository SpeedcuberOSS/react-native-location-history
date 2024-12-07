package dev.jhale.react.locationstatus

import com.facebook.react.bridge.ReactApplicationContext

abstract class LocationStatusSpec internal constructor(context: ReactApplicationContext) :
  NativeLocationStatusSpec(context) {
}
