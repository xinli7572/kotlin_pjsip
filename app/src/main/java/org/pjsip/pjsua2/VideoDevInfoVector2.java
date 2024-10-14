/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class VideoDevInfoVector2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VideoDevInfoVector2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VideoDevInfoVector2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_VideoDevInfoVector2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VideoDevInfoVector2() {
    this(pjsua2JNI.new_VideoDevInfoVector2__SWIG_0(), true);
  }

  public VideoDevInfoVector2(long n) {
    this(pjsua2JNI.new_VideoDevInfoVector2__SWIG_1(n), true);
  }

  public long size() {
    return pjsua2JNI.VideoDevInfoVector2_size(swigCPtr, this);
  }

  public long capacity() {
    return pjsua2JNI.VideoDevInfoVector2_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.VideoDevInfoVector2_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.VideoDevInfoVector2_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.VideoDevInfoVector2_clear(swigCPtr, this);
  }

  public void add(VideoDevInfo x) {
    pjsua2JNI.VideoDevInfoVector2_add(swigCPtr, this, VideoDevInfo.getCPtr(x), x);
  }

  public VideoDevInfo get(int i) {
    return new VideoDevInfo(pjsua2JNI.VideoDevInfoVector2_get(swigCPtr, this, i), false);
  }

  public void set(int i, VideoDevInfo val) {
    pjsua2JNI.VideoDevInfoVector2_set(swigCPtr, this, i, VideoDevInfo.getCPtr(val), val);
  }

}
