package com.leandro1995.trustedtime.ui.component.ambient

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.leandro1995.trustedtime.ui.component.config.callback.OnClickCallBack

abstract class View(
    protected val modifier: Modifier = Modifier,
    protected val textAlign: TextAlign = TextAlign.Start,
    protected val alignment: Alignment.Horizontal = Alignment.Start,
) {

    /**
     * Variable mutable para cambiar la posicion del texto
     */
    protected var textAlignmentMutable = mutableStateOf(textAlign)

    /**
     * Variable mutable para cambiar la posicion del componente
     */
    protected var alignmentMutable = mutableStateOf(alignment)

    /**
     * Variable para eventos de onClick de los componentes
     */
    protected var onClickCallBack: OnClickCallBack? = null

    /**
     * @param style : Parametro que permite colocar el style de la app
     */
    @Composable
    open fun Modifier(style: TextStyle) {
        InstanceValuesDesign()
    }

    /**
     * Funcion para la accion de eventos al momento de tocar el click
     */
    fun setOnclick(onclick: () -> Unit = {}) {
        onClickCallBack = object : OnClickCallBack {
            override fun onClick() {
                onclick()
            }
        }
    }

    /**
     * Instanciar valores para diseño de las apps
     */
    @Composable
    private fun InstanceValuesDesign() {
        textAlignmentMutable = remember { mutableStateOf(textAlign) }
        alignmentMutable = remember { mutableStateOf(alignment) }
    }
}