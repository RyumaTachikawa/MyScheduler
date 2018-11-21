package com.example.hayashihiroaki.myapplication

import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.support.v4.content.ContextCompat.getSystemService
import kotlin.concurrent.timer

class MainActivity : AppcompatActivity() {
    override  fun onCreate() {
        var vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        val pattern = longArrayOf(3000, 1000, 2000, 5000, 3000, 1000) // OFF/ON/OFF/ON...

        timer(initialDelay = 60000, period = 60000) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createWaveform(pattern, -1))
            } else {
                vibrator.vibrate(pattern, -1)
            }
        }
    }
}