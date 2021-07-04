package com.arsh.taskmanagerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer

class MyBroadcastReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var mp = MediaPlayer.create(context,R.raw.alarm_android)
        mp.start()
    }

}