package com.leandro1995.trustedtime.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

    /**
     * Variable mutable para cambiar el texto del componente
     */
    private var textMutable = mutableStateOf(text)

    @Composable
    override fun ComposeComponent() {
        super.ComposeComponent()

        InstanceValuesDesign()

        Text(
            text = textMutable.value,
            style = style,
            modifier = modifier.fillMaxWidth(),
            textAlign = textAlignmentMutable.value,
        )
    }

    /**
     * Funcion para cambiar el texto del componente
     */
    fun setText(text: String) {
        textMutable.value = text
    }

    /**
     * Instanciar valores para diseño de las apps
     */
    @Composable
    private fun InstanceValuesDesign() {
        textMutable = remember { mutableStateOf(text) }
    }
}
