/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudioDevInfoVector2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AudioDevInfoVector2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioDevInfoVector2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AudioDevInfoVector2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AudioDevInfoVector2() {
    this(pjsua2JNI.new_AudioDevInfoVector2__SWIG_0(), true);
  }

  public AudioDevInfoVector2(long n) {
    this(pjsua2JNI.new_AudioDevInfoVector2__SWIG_1(n), true);
  }

  public long size() {
    return pjsua2JNI.AudioDevInfoVector2_size(swigCPtr, this);
  }

  public long capacity() {
    return pjsua2JNI.AudioDevInfoVector2_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.AudioDevInfoVector2_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.AudioDevInfoVector2_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.AudioDevInfoVector2_clear(swigCPtr, this);
  }

  public void add(AudioDevInfo x) {
    pjsua2JNI.AudioDevInfoVector2_add(swigCPtr, this, AudioDevInfo.getCPtr(x), x);
  }

  public AudioDevInfo get(int i) {
    return new AudioDevInfo(pjsua2JNI.AudioDevInfoVector2_get(swigCPtr, this, i), false);
  }

  public void set(int i, AudioDevInfo val) {
    pjsua2JNI.AudioDevInfoVector2_set(swigCPtr, this, i, AudioDevInfo.getCPtr(val), val);
  }

}
