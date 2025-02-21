package com.leandro1995.trustedtime.extension

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date

@SuppressLint("SimpleDateFormat")
fun Date.dateFormat(format: String): String = SimpleDateFormat(format).format(this)