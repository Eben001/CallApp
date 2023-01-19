package com.ebenezer.gana.callapp

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneStateListener
import android.telephony.TelephonyManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val telephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        val callState = telephonyManager.callState

        telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_CALL_STATE)





    }
    private val phoneStateListener = object : PhoneStateListener() {
        override fun onCallStateChanged(state: Int, phoneNumber: String?) {
            when (state) {
                TelephonyManager.CALL_STATE_IDLE -> {
                    // call ended, set the result and finish the activity
                    setResult(Activity.RESULT_OK)
                    finish()
                }
                // Handle other call states as needed
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        val telephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_NONE)
    }
}