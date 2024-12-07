package dev.jhale.react.locationstatus

import android.content.Context;
import android.location.LocationManager;
import android.util.Log

import androidx.core.location.LocationManagerCompat;

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class LocationStatusModule internal constructor(context: ReactApplicationContext) :
  LocationStatusSpec(context) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/legacy/native-modules-android
  @ReactMethod
  override fun isLocationEnabled(promise: Promise) {
    Log.d("LocationStatus", "isLocationEnabled invoked from Kotlin")
    promise.resolve(isLocationEnabledInContext(reactApplicationContext)) // <---- Here's what I'm trying to figure out
  }

  private fun isLocationEnabledInContext(context: ReactApplicationContext): Boolean {
    // From: https://stackoverflow.com/a/58109400/14765128
    val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
    return LocationManagerCompat.isLocationEnabled(locationManager)
  }

  companion object {
    const val NAME = "LocationStatus"
  }
}
