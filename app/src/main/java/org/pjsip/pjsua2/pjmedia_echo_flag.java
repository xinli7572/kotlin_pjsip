/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjmedia_echo_flag {
  public final static pjmedia_echo_flag PJMEDIA_ECHO_DEFAULT = new pjmedia_echo_flag("PJMEDIA_ECHO_DEFAULT", pjsua2JNI.PJMEDIA_ECHO_DEFAULT_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_SPEEX = new pjmedia_echo_flag("PJMEDIA_ECHO_SPEEX", pjsua2JNI.PJMEDIA_ECHO_SPEEX_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_SIMPLE = new pjmedia_echo_flag("PJMEDIA_ECHO_SIMPLE", pjsua2JNI.PJMEDIA_ECHO_SIMPLE_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_WEBRTC = new pjmedia_echo_flag("PJMEDIA_ECHO_WEBRTC", pjsua2JNI.PJMEDIA_ECHO_WEBRTC_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_ALGO_MASK = new pjmedia_echo_flag("PJMEDIA_ECHO_ALGO_MASK", pjsua2JNI.PJMEDIA_ECHO_ALGO_MASK_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_NO_LOCK = new pjmedia_echo_flag("PJMEDIA_ECHO_NO_LOCK", pjsua2JNI.PJMEDIA_ECHO_NO_LOCK_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_USE_SIMPLE_FIFO = new pjmedia_echo_flag("PJMEDIA_ECHO_USE_SIMPLE_FIFO", pjsua2JNI.PJMEDIA_ECHO_USE_SIMPLE_FIFO_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_USE_SW_ECHO = new pjmedia_echo_flag("PJMEDIA_ECHO_USE_SW_ECHO", pjsua2JNI.PJMEDIA_ECHO_USE_SW_ECHO_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_USE_NOISE_SUPPRESSOR = new pjmedia_echo_flag("PJMEDIA_ECHO_USE_NOISE_SUPPRESSOR", pjsua2JNI.PJMEDIA_ECHO_USE_NOISE_SUPPRESSOR_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_AGGRESSIVENESS_DEFAULT = new pjmedia_echo_flag("PJMEDIA_ECHO_AGGRESSIVENESS_DEFAULT", pjsua2JNI.PJMEDIA_ECHO_AGGRESSIVENESS_DEFAULT_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_AGGRESSIVENESS_CONSERVATIVE = new pjmedia_echo_flag("PJMEDIA_ECHO_AGGRESSIVENESS_CONSERVATIVE", pjsua2JNI.PJMEDIA_ECHO_AGGRESSIVENESS_CONSERVATIVE_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_AGGRESSIVENESS_MODERATE = new pjmedia_echo_flag("PJMEDIA_ECHO_AGGRESSIVENESS_MODERATE", pjsua2JNI.PJMEDIA_ECHO_AGGRESSIVENESS_MODERATE_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_AGGRESSIVENESS_AGGRESSIVE = new pjmedia_echo_flag("PJMEDIA_ECHO_AGGRESSIVENESS_AGGRESSIVE", pjsua2JNI.PJMEDIA_ECHO_AGGRESSIVENESS_AGGRESSIVE_get());
  public final static pjmedia_echo_flag PJMEDIA_ECHO_AGGRESSIVENESS_MASK = new pjmedia_echo_flag("PJMEDIA_ECHO_AGGRESSIVENESS_MASK", pjsua2JNI.PJMEDIA_ECHO_AGGRESSIVENESS_MASK_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjmedia_echo_flag swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjmedia_echo_flag.class + " with value " + swigValue);
  }

  private pjmedia_echo_flag(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjmedia_echo_flag(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjmedia_echo_flag(String swigName, pjmedia_echo_flag swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjmedia_echo_flag[] swigValues = { PJMEDIA_ECHO_DEFAULT, PJMEDIA_ECHO_SPEEX, PJMEDIA_ECHO_SIMPLE, PJMEDIA_ECHO_WEBRTC, PJMEDIA_ECHO_ALGO_MASK, PJMEDIA_ECHO_NO_LOCK, PJMEDIA_ECHO_USE_SIMPLE_FIFO, PJMEDIA_ECHO_USE_SW_ECHO, PJMEDIA_ECHO_USE_NOISE_SUPPRESSOR, PJMEDIA_ECHO_AGGRESSIVENESS_DEFAULT, PJMEDIA_ECHO_AGGRESSIVENESS_CONSERVATIVE, PJMEDIA_ECHO_AGGRESSIVENESS_MODERATE, PJMEDIA_ECHO_AGGRESSIVENESS_AGGRESSIVE, PJMEDIA_ECHO_AGGRESSIVENESS_MASK };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

