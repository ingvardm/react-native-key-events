
package com.ingvardm.KeyEvents;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.view.KeyEvent;
import com.github.kevinejohn.keyevent.KeyEventModule;

public class RNKeyEventsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNKeyEventsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNKeyEvents";
  }
  @Override
  public boolean dispatchKeyEvent(KeyEvent event) {
    int action = event.getAction();
    int keyCode = event.getKeyCode();
    switch (keyCode) {
    case KeyEvent.KEYCODE_VOLUME_UP:
      if (action == KeyEvent.ACTION_DOWN) {
          //TODO
      }
      return true;
    case KeyEvent.KEYCODE_VOLUME_DOWN:
      if (action == KeyEvent.ACTION_DOWN) {
          //TODO
      }
      return true;
    default:
      return super.dispatchKeyEvent(event);
    }
  }
}