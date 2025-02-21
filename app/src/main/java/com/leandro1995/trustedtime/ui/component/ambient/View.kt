package com.leandro1995.trustedtime.ui.component.ambient

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

abstract class View(
    protected val modifier: Modifier = Modifier,
    protected val textAlign: TextAlign = TextAlign.Start,
) {

    /**
     * Variable mutable para cambiar la posicion del texto
     */
    protected var textAlignmentMutable = mutableStateOf(textAlign)

    /**
     * @param style : Parametro que permite colocar el style de la app
     */
    @Composable
    open fun Modifier(style: TextStyle) {
        InstanceValuesDesign()
    }

    /**
     * Instanciar valores para diseño de las apps
     */
    @Composable
    private fun InstanceValuesDesign() {
        textAlignmentMutable = remember { mutableStateOf(textAlign) }
    }
}