package com.example.shayariapp

import java.util.ArrayList
import java.util.Calendar
import java.util.Date
import java.util.GregorianCalendar

object SampleData {
    val data1 = "This is data 1"
    val data2 = "This is data 2"

    fun getdata(diff:Int) :Date{
        val calender = GregorianCalendar()
        calender.add(Calendar.MILLISECOND,diff)
        return calender.time
    }
    val data : List<DataEntity>
        get(){
            val tempList: MutableList<DataEntity> =ArrayList()
            tempList.add(DataEntity(1, getdata(45), data1))
            tempList.add(DataEntity(2, getdata(46), data2))
            return tempList
        }
}