package com.example.kotlin_pjsip

import android.Manifest
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.media.AudioManager
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.kotlin_pjsip.phone.CallBack
import com.example.kotlin_pjsip.phone.MyApp


class MainActivity : AppCompatActivity() {


    lateinit var reg: Button
    lateinit var call: Button
    lateinit var adress: EditText
    lateinit var sip_num: EditText

    lateinit var num_1: Button
    lateinit var num_2: Button
    lateinit var num_3: Button
    lateinit var num_4: Button
    lateinit var num_5: Button
    lateinit var num_6: Button
    lateinit var num_7: Button
    lateinit var num_8: Button
    lateinit var num_9: Button
    lateinit var num_0: Button

    var sip: String = ""

    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    var registrations_status: Int = 0 //0 not registrate, 1 registration success
    var call_status: Int = 0 //0 no call, 1 call confirm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        System.loadLibrary("pjsua2");



        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.RECORD_AUDIO), 1)
        }


        val audioManager = getSystemService(AUDIO_SERVICE) as AudioManager

        audioManager.mode = AudioManager.MODE_IN_CALL
        audioManager.isSpeakerphoneOn = true

        var app = MyApp(Phone_CallBack())

        reg = findViewById<Button>(R.id.reg)
        call = findViewById<Button>(R.id.call)

        reg.setOnClickListener {
            if ("".equals(MyApp.sip_ip)) {
                Toast.makeText(this, "please input Freeswitch address ", Toast.LENGTH_LONG).show()
            } else {
                app.initPJSIP()
            }
        }

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


        adress = findViewById(R.id.address_server)
        sip_num = findViewById(R.id.sip_num)

        //================================================
        //save data
        //================================================
        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE)
        editor = sharedPreferences.edit()

        var sip_ip: String? = sharedPreferences.getString("sip_ip", "")
        adress.text = Editable.Factory.getInstance().newEditable(sip_ip)
        MyApp.sip_ip = adress.text.toString()

        var call_num: String? = sharedPreferences.getString("call_num", "")
        sip_num.text = Editable.Factory.getInstance().newEditable(call_num)
        MyApp.call_num = sip_num.text.toString()


        adress.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                MyApp.sip_ip = adress.text.toString()
                editor.putString("sip_ip", MyApp.sip_ip)
                editor.commit()
            }
        })

        val clearButton = sip_num.compoundDrawablesRelative[2]

        clearButton?.let {
            it.alpha = 0
        }

        sip_num.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                clearButton?.let {
                    it.alpha = if (s.isNullOrEmpty()) 0 else 255
                }
            }

            override fun afterTextChanged(s: Editable?) {
                MyApp.call_num = sip_num.text.toString();
                editor.putString("call_num", MyApp.call_num)
                editor.commit()
            }
        })

        sip_num.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                clearButton?.let {
                    if (event.rawX >= (sip_num.right - it.bounds.width())) {
                        sip_num.text.clear()
                        sip = ""
                        return@setOnTouchListener true
                    }
                }
            }
            false
        }

        num_1 = findViewById(R.id.num_1)
        num_2 = findViewById(R.id.num_2)
        num_3 = findViewById(R.id.num_3)
        num_4 = findViewById(R.id.num_4)
        num_5 = findViewById(R.id.num_5)
        num_6 = findViewById(R.id.num_6)
        num_7 = findViewById(R.id.num_7)
        num_8 = findViewById(R.id.num_8)
        num_9 = findViewById(R.id.num_9)
        num_0 = findViewById(R.id.num_0)

        num_1.setOnClickListener {
            sip += 1;
            sip_num.setText(sip)
        }
        num_2.setOnClickListener {
            sip += 2;
            sip_num.setText(sip)
        }
        num_3.setOnClickListener {
            sip += 3;
            sip_num.setText(sip)
        }
        num_4.setOnClickListener {
            sip += 4;
            sip_num.setText(sip)
        }
        num_5.setOnClickListener {
            sip += 5;
            sip_num.setText(sip)
        }
        num_6.setOnClickListener {
            sip += 6;
            sip_num.setText(sip)
        }
        num_7.setOnClickListener {
            sip += 7;
            sip_num.setText(sip)
        }
        num_8.setOnClickListener {
            sip += 8;
            sip_num.setText(sip)
        }
        num_9.setOnClickListener {
            sip += 9;
            sip_num.setText(sip)
        }
        num_0.setOnClickListener {
            sip += 0;
            sip_num.setText(sip)
        }

    }

    inner class Phone_CallBack : CallBack {

        override fun registrations_notify(msg: Boolean) {
            if (msg) {
                runOnUiThread {
                    reg.foreground =
                        ContextCompat.getDrawable(applicationContext, R.drawable.phone_start)
                }
                registrations_status = 1
            }
        }

        override fun call_notify(msg: Boolean) {
            if (msg) {
                runOnUiThread {
                    call.foreground =
                        ContextCompat.getDrawable(applicationContext, R.drawable.mic_open)
                }
                call_status = 1
            }else{
                runOnUiThread {
                    call.foreground =
                        ContextCompat.getDrawable(applicationContext, R.drawable._mic_close__)
                }
            }
        }
    }
}