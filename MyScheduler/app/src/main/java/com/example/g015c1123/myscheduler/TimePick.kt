package com.example.g015c1123.myscheduler
import android.annotation.SuppressLint
import android.app.Dialog
import android.widget.TimePicker
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.support.v4.app.DialogFragment


class TimePick : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    // Bundle sould be nullable, Bundle?
    @SuppressLint("NewApi")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // to initialize a Calender instance
        val c = Calendar.getInstance()

        // at the first, to get the system current hour and minute
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(
                activity,
                // in order to return parameters to MainActivity
                activity as ScheduleEditActivity?,
                hour,
                minute,
                true)
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        //
    }
}