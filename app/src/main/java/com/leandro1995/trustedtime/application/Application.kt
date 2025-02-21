package com.leandro1995.trustedtime.application

import android.app.Application
import com.leandro1995.trustedtime.trustedtime.TrustedTime

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        TrustedTime.instance(this)
    }
}