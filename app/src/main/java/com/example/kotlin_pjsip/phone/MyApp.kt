package com.example.kotlin_pjsip.phone

import android.util.Log
import org.pjsip.pjsua2.AccountConfig
import org.pjsip.pjsua2.AuthCredInfo
import org.pjsip.pjsua2.CallOpParam
import org.pjsip.pjsua2.Endpoint
import org.pjsip.pjsua2.EpConfig
import org.pjsip.pjsua2.TransportConfig
import org.pjsip.pjsua2.pjsip_transport_type_e

class MyApp(var callBack: CallBack) {

    var account: MyAccount? = null
    var currentCall: MyCall? = null

    companion object {
        var endpoint = Endpoint()

        var sip_ip = ""
        var port = "7321"
        var passward = "5223"
        var local_num = "1001"
        var call_num = ""
    }

    fun initPJSIP() {
        try {
            // init PJSUA2 Endpoint
            endpoint.libCreate()

            // set config PJSUA2
            val epConfig = EpConfig()
            endpoint.libInit(epConfig)

            // FreeSWITCH port 7321
            val sipTpConfig = TransportConfig()
            sipTpConfig.port = 7321
            endpoint.transportCreate(pjsip_transport_type_e.PJSIP_TRANSPORT_UDP, sipTpConfig)

            // start PJSUA2
            endpoint.libStart()

            // set account
            val accCfg = AccountConfig()
            accCfg.idUri = "sip:" + local_num + "@" + sip_ip + ":" + port + "" // 设置账户 URI
            accCfg.regConfig.registrarUri = "sip:" + sip_ip + ":" + port // FreeSWITCH 注册服务器

            val authCred = AuthCredInfo("digest", "*", local_num, 0, passward)
            accCfg.sipConfig.authCreds.add(authCred)

            // creat my account
            account = MyAccount(accCfg,callBack)
            account?.create(accCfg)

            Log.d("PJSIP", "SIP ACCOUNT start")

        } catch (e: Exception) {
            Log.e("PJSIP", "PJSIP init fail: ${e.message}")
        }
    }

    // start call
    fun makeCall(destUri: String) {
        if (account == null) {
            Log.e("PJSIP", "account not create，no call")
            return
        }

        try {
            // create call
            currentCall = MyCall(account, -1, callBack)

            // set call param
            val prm = CallOpParam(true)
            // call
            currentCall?.makeCall(destUri, prm)
            Log.d("PJSIP", "call: $destUri")
            currentCall?.am?.adjustTxLevel(5F)
            currentCall?.am?.adjustRxLevel(5F)



        } catch (e: Exception) {
            Log.e("PJSIP", "call fail: ${e.message}")
        }
    }

    fun hangup() {
        val prm = CallOpParam(true)
        currentCall?.hangup(prm)
    }
}