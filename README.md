

### Kotlin inherits the PJSIP softphone to enable communication between a mobile app and other VoIP phones through the FreeSWITCH, using the PJSIP Android dynamic library to implement features such as making calls, answering, and hanging up.

1. MainActivity.kt
2. MyApp.kt: PJSIP entry class
3. MyCall.kt: Call status class
4. MyAccount.kt: Registration status class

### registrations
```
 reg.setOnClickListener {
    if ("".equals(MyApp.sip_ip)) {
        Toast.makeText(this, "please input Freeswitch address ",          Toast.LENGTH_LONG).show()
    } else {
        app.initPJSIP()
    }
}
```

### make phone call
```
call.setOnClickListener {
    if (call_status == 0) {
        if ("".equals(MyApp.call_num)) {
            Toast.makeText(this, "please input call number ", Toast.LENGTH_LONG).show()
        } else {
            app.makeCall("sip:" + MyApp.call_num + "@" + MyApp.sip_ip + ":" + MyApp.port)
        }
    }

    if(call_status == 1){
        app.hangup()
    }
}
```



https://github.com/user-attachments/assets/54e52577-c528-450c-9faa-09437709367c

