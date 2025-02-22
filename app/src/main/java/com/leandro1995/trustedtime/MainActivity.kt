package com.leandro1995.trustedtime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.leandro1995.trustedtime.config.Setting
import com.leandro1995.trustedtime.trustedtime.TrustedTime
import com.leandro1995.trustedtime.ui.component.ButtonView
import com.leandro1995.trustedtime.ui.component.TextView
import com.leandro1995.trustedtime.ui.theme.DP_15
import com.leandro1995.trustedtime.ui.theme.TextStyle1
import com.leandro1995.trustedtime.ui.theme.TrustedTimeTheme

class MainActivity : ComponentActivity() {

    private lateinit var dateText: TextView
    private lateinit var dateButton: ButtonView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstanceDesign()
            View()
            onClick()
        }
    }

    @Composable
    private fun InstanceDesign() {
        dateText = TextView(
            text = stringResource(R.string.date_show_text),
            textAlign = TextAlign.Center,
            style = TextStyle1
        )
        dateButton = ButtonView(
            text = stringResource(R.string.show_date_button),
            alignment = Alignment.CenterHorizontally
        )
    }

    @Composable
    private fun View() {
        TrustedTimeTheme {
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
                dateText.ComposeComponent()
                Spacer(modifier = Modifier.height(DP_15))
                dateButton.ComposeComponent()
            }
        }
    }

    private fun onClick() {
        dateButton.setOnclick {
            dateText.setText(text = TrustedTime.date(format = Setting.DATE_FORMAT_ONE))
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        InstanceDesign()
        View()
    }
}