package com.example.kotlin_pjsip.phone

import android.util.Log
import org.pjsip.pjsua2.AudioMedia
import org.pjsip.pjsua2.Call
import org.pjsip.pjsua2.CallInfo
import org.pjsip.pjsua2.Media
import org.pjsip.pjsua2.OnCallMediaStateParam
import org.pjsip.pjsua2.OnCallStateParam
import org.pjsip.pjsua2.pjmedia_type
import org.pjsip.pjsua2.pjsip_inv_state
import org.pjsip.pjsua2.pjsua_call_media_status

class MyCall(account: MyAccount?, callId: Int,var callBack: CallBack) : Call(account, callId) {


    var am: AudioMedia? = null

    override fun onCallState(prm: OnCallStateParam?) {
        try {
            val ci = info
            Log.d("PJSIP", "call status: ${ci.state}")

            if (ci.state == pjsip_inv_state.PJSIP_INV_STATE_DISCONNECTED) {
                Log.d("PJSIP", "call disconnected")
                delete()
                callBack.call_notify(false)
            }

            if (ci.state == pjsip_inv_state.PJSIP_INV_STATE_CONFIRMED) {
                Log.d("PJSIP", "call confirmed")
                callBack.call_notify(true)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    override fun onCallMediaState(prm: OnCallMediaStateParam?) {
        val ci: CallInfo
        ci = try {
            info
        } catch (e: java.lang.Exception) {
            return
        }
        val cmiv = ci.media
        for (i in 0 until cmiv.size()) {
            val cmi = cmiv[i.toInt()]
            if (cmi.type == pjmedia_type.PJMEDIA_TYPE_AUDIO &&
                (cmi.status ==
                        pjsua_call_media_status.PJSUA_CALL_MEDIA_ACTIVE ||
                        cmi.status == pjsua_call_media_status.PJSUA_CALL_MEDIA_REMOTE_HOLD)
            ) {
                val m: Media = getMedia(i)
                am = AudioMedia.typecastFromMedia(m)

                try {
                    MyApp.endpoint.audDevManager().captureDevMedia.startTransmit(am)
                    with(am) {
                        this?.startTransmit(MyApp.endpoint.audDevManager().playbackDevMedia)
                    }
                } catch (e: java.lang.Exception) {
                    continue
                }
            }
        }
    }
}
