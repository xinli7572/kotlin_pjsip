package com.example.kotlin_pjsip.phone

import android.util.Log
import org.pjsip.pjsua2.Account
import org.pjsip.pjsua2.AccountConfig
import org.pjsip.pjsua2.CallOpParam
import org.pjsip.pjsua2.OnIncomingCallParam
import org.pjsip.pjsua2.OnRegStateParam
import org.pjsip.pjsua2.pjsip_status_code

class MyAccount(cfg: AccountConfig, var callBack: CallBack) : Account() {

    init {
        create(cfg)
    }

    override fun onRegState(prm: OnRegStateParam?) {
        try {
            val info = info
            Log.d("PJSIP", "registration status : ${info.regIsActive}")
            callBack.registrations_notify(info.regIsActive)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onIncomingCall(prm: OnIncomingCallParam) {
        val call = MyCall(this, prm.callId, callBack)
        val prms = CallOpParam()
        prms.statusCode = pjsip_status_code.PJSIP_SC_OK
        try {
            call.answer(prms)
        } catch (e: Exception) {
            println(e)
        }
    }
}