package com.locationstatus

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class LocationStatusModule internal constructor(context: ReactApplicationContext) :
  LocationStatusSpec(context) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  override fun multiply(a: Double, b: Double, promise: Promise) {
    promise.resolve(a * b)
  }

  companion object {
    const val NAME = "LocationStatus"
  }
}
