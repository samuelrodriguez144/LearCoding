package com.guren.learncoding.base

import android.app.Application
import android.content.Context
import com.facebook.stetho.Stetho

class BaseApplication: Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: BaseApplication? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        val context: Context = BaseApplication.applicationContext()
    }

}