package com.idealcn.todo.kotlin

import android.app.Application

/**
 * author:guoning
 * date: 2018/11/25 22:09
 * 描述:
 */
class TaskApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }

    companion object {
         val application = TaskApplication
    }




}