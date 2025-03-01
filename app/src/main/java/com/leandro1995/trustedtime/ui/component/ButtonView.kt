package com.leandro1995.trustedtime.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.leandro1995.trustedtime.ui.component.ambient.View
import com.leandro1995.trustedtime.ui.theme.DP_40
import com.leandro1995.trustedtime.ui.theme.TextButtonStyle1

class ButtonView(
    private val text: String = "",
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center,
    alignment: Alignment.Horizontal = Alignment.Start,
    textStyle: TextStyle = TextButtonStyle1,
) : View(modifier = modifier, textAlign = textAlign, alignment = alignment, style = textStyle) {

    @Composable
    override fun ComposeComponent() {
        super.ComposeComponent()

        Column(horizontalAlignment = alignmentMutable.value, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { onClickCallBack?.onClick() }, modifier = modifier.height(DP_40)) {
                Text(
                    text = text, style = style, textAlign = textAlignmentMutable.value
                )
            }
        }
    }
}