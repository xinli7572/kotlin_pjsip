/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_event_type {
  public final static pjmedia_event_type PJMEDIA_EVENT_NONE = new pjmedia_event_type("PJMEDIA_EVENT_NONE");
  public final static pjmedia_event_type PJMEDIA_EVENT_FMT_CHANGED = new pjmedia_event_type("PJMEDIA_EVENT_FMT_CHANGED", pjsua2JNI.PJMEDIA_EVENT_FMT_CHANGED_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_WND_CLOSING = new pjmedia_event_type("PJMEDIA_EVENT_WND_CLOSING", pjsua2JNI.PJMEDIA_EVENT_WND_CLOSING_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_WND_CLOSED = new pjmedia_event_type("PJMEDIA_EVENT_WND_CLOSED", pjsua2JNI.PJMEDIA_EVENT_WND_CLOSED_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_WND_RESIZED = new pjmedia_event_type("PJMEDIA_EVENT_WND_RESIZED", pjsua2JNI.PJMEDIA_EVENT_WND_RESIZED_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_MOUSE_BTN_DOWN = new pjmedia_event_type("PJMEDIA_EVENT_MOUSE_BTN_DOWN", pjsua2JNI.PJMEDIA_EVENT_MOUSE_BTN_DOWN_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_KEYFRAME_FOUND = new pjmedia_event_type("PJMEDIA_EVENT_KEYFRAME_FOUND", pjsua2JNI.PJMEDIA_EVENT_KEYFRAME_FOUND_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_KEYFRAME_MISSING = new pjmedia_event_type("PJMEDIA_EVENT_KEYFRAME_MISSING", pjsua2JNI.PJMEDIA_EVENT_KEYFRAME_MISSING_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_ORIENT_CHANGED = new pjmedia_event_type("PJMEDIA_EVENT_ORIENT_CHANGED", pjsua2JNI.PJMEDIA_EVENT_ORIENT_CHANGED_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_RX_RTCP_FB = new pjmedia_event_type("PJMEDIA_EVENT_RX_RTCP_FB", pjsua2JNI.PJMEDIA_EVENT_RX_RTCP_FB_get());
  public final static pjmedia_event_type PJMEDIA_EVENT_AUD_DEV_ERROR = new pjmedia_event_type("PJMEDIA_EVENT_AUD_DEV_ERROR", pjsua2JNI.PJMEDIA_EVENT_AUD_DEV_ERROR_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_event_type swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_event_type.class + " with value " + swigValue);
  }

  private pjmedia_event_type(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_event_type(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_event_type(String swigName, pjmedia_event_type swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_event_type[] swigValues = { PJMEDIA_EVENT_NONE, PJMEDIA_EVENT_FMT_CHANGED, PJMEDIA_EVENT_WND_CLOSING, PJMEDIA_EVENT_WND_CLOSED, PJMEDIA_EVENT_WND_RESIZED, PJMEDIA_EVENT_MOUSE_BTN_DOWN, PJMEDIA_EVENT_KEYFRAME_FOUND, PJMEDIA_EVENT_KEYFRAME_MISSING, PJMEDIA_EVENT_ORIENT_CHANGED, PJMEDIA_EVENT_RX_RTCP_FB, PJMEDIA_EVENT_AUD_DEV_ERROR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

