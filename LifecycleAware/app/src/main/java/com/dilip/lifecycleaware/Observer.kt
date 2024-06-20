package com.dilip.lifecycleaware

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d("MAIN", "OBSERVER - ON CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onMyStart() {
        Log.d("MAIN", "onStart()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onMyResume() {
        Log.d("MAIN", "onResume()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onMyPause() {
        Log.d("MAIN", "onPause()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onMyStop() {
        Log.d("MAIN", "onStop()")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onMyDestroy() {
        Log.d("MAIN", "onDestroy()")
    }

}