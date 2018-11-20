<<<<<<< HEAD
package com.example.g015c1123.myscheduler

import android.app.Application
import io.realm.Realm

class MySchedulerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
=======
package com.example.g015c1123.myscheduler

import android.app.Application
import io.realm.Realm

class MySchedulerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
>>>>>>> 3046c1cc7ab9a5e23dd3820130f59c0e150c8d4e
}