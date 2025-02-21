package com.leandro1995.trustedtime.trustedtime

import android.content.Context
import com.google.android.gms.time.TrustedTime
import com.google.android.gms.time.TrustedTimeClient
import com.leandro1995.trustedtime.extension.dateFormat
import java.util.Date

object TrustedTime {

    private var trustedTimeClientInstance: TrustedTimeClient? = null

    fun instance(context: Context) {
        TrustedTime.createClient(context).addOnSuccessListener { trustedTimeClientInstance = it }
            .addOnFailureListener { trustedTimeClientInstance = null }
    }

    fun date(format: String): String = trustedTimeClientInstance?.computeCurrentUnixEpochMillis()
        ?.let { Date(it).dateFormat(format = format) } ?: Date().dateFormat(format = format)
}