package com.ebenezer.gana.callapp

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var callButton: Button

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: Called")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: Called")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Link the Id the of the button in xml
        callButton = findViewById(R.id.btnCall)
        textView = findViewById(R.id.textView)


        callButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }


//    private fun checkPermission() {
//        if (ContextCompat.checkSelfPermission(
//                this,
//                Manifest.permission.CALL_PHONE
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//
//            // Permission is not granted
//            // Should we show an explanation?
//            if (ActivityCompat.shouldShowRequestPermissionRationale(
//                    this,
//                    Manifest.permission.CALL_PHONE
//                )
//            ) {
//                // Show an explanation to the user *asynchronously* -- don't block
//                // this thread waiting for the user's response! After the user
//                // sees the explanation, try again to request the permission.
//            } else {
//                // No explanation needed, we can request the permission.
//                ActivityCompat.requestPermissions(
//                    this,
//                    arrayOf(Manifest.permission.CALL_PHONE),
//                    DIAL_REQUEST_CODE
//                )
//            }
//        } else {
//            // Permission has already been granted
//            //TODO: Launch the Intent to SecondActivity
//            makeCall("+31231412151")
//        }
//
//
//        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED){
//            // Permission is not granted
//            // Should we show an explanation?
//            if (ActivityCompat.shouldShowRequestPermissionRationale(
//                    this,
//                    Manifest.permission.READ_PHONE_STATE
//                )
//            ) {
//                // Show an explanation to the user *asynchronously* -- don't block
//                // this thread waiting for the user's response! After the user
//                // sees the explanation, try again to request the permission.
//            } else {
//                // No explanation needed, we can request the permission.
//                ActivityCompat.requestPermissions(
//                    this,
//                    arrayOf(Manifest.permission.READ_PHONE_STATE),
//                    10
//                )
//            }
//        } else {
//            // Permission has already been granted
//
//        }
//
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<String>, grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == DIAL_REQUEST_CODE) {
//            // If request is cancelled, the result arrays are empty.
//            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
//                // permission was granted, yay!
//                makeCall("+31231412151")
//            } else {
//                // permission denied, boo! Disable the
//                // functionality
//            }
//            return
//        }else if(requestCode == 10){
//            return
//        }
//
//
//    }
//
//    private fun makeCall(phone: String) {
//        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phone"))
//        startActivity(intent)
//
//    }

    override fun onDestroy() {
        super.onDestroy()
        //this.unregisterReceiver(callReceiver)
    }

//    override fun onCallCompleted(text: String) {
//        callButton.text = text
//
//    }


}
