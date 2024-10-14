package com.example.kotlin_pjsip.phone

interface CallBack {
    fun registrations_notify(msg: Boolean)
    fun call_notify(msg: Boolean)
}