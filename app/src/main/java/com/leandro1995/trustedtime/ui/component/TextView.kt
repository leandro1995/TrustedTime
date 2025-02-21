package com.leandro1995.trustedtime.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.leandro1995.trustedtime.ui.component.ambient.View

class TextView(
    private val text: String = "",
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    style: TextStyle = TextStyle(),
) : View(modifier = modifier, textAlign = textAlign, style = style) {

    @Composable
    override fun ComposeComponent() {
        super.ComposeComponent()

        Text(
            text = text,
            style = style,
            modifier = modifier.fillMaxWidth(),
            textAlign = textAlignmentMutable.value,
        )
    }
}
