package com.ebenezer.gana.callapp

import android.content.Context
import android.content.Intent
import android.os.Build
import java.util.*

class CallReceiver : PhonecallReceiver() {
    override fun onIncomingCallReceived(ctx: Context?, number: String?, start: Date?) {
        //
    }

    override fun onIncomingCallAnswered(ctx: Context?, number: String?, start: Date?) {
        //
    }

    override fun onIncomingCallEnded(ctx: Context?, number: String?, start: Date?, end: Date?) {
        //
    }

    override fun onOutgoingCallStarted(ctx: Context?, number: String?, start: Date?) {
        //

    }

    override fun onOutgoingCallEnded(ctx: Context?, number: String?, start: Date?, end: Date?) {
        //
        val intent = Intent(ctx, SecondActivity::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        ctx?.startActivity(intent)
        //Toast.makeText(ctx, "Call Ended", Toast.LENGTH_SHORT).show()
    }

    override fun onMissedCall(ctx: Context?, number: String?, start: Date?) {
        //
    }
}