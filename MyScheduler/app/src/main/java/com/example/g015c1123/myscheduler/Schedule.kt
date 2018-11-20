<<<<<<< HEAD
package com.example.g015c1123.myscheduler

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Schedule :RealmObject(){
    @PrimaryKey
    var id: Long =0
    var date: Date = Date()
    var title: String = ""
    var detail: String = ""
    var time:Int=0
=======
package com.example.g015c1123.myscheduler

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Schedule :RealmObject(){
    @PrimaryKey
    var id: Long =0
    var date: Date = Date()
    var title: String = ""
    var detail: String = ""
    var time:Int=0
>>>>>>> 3046c1cc7ab9a5e23dd3820130f59c0e150c8d4e
}