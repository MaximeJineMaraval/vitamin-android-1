package com.decathlon.vitamin.cards

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.decathlon.vitamin.cards.databinding.ViewTopImageCardviewBinding

open class VitaminTopImageCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : AVitaminImageCardView(
    context,
    attrs,
    R.attr.vtmnTopImageCardViewStyle,
    R.style.Widget_Vitamin_Card_TopImage
) {

    init {
        ViewTopImageCardviewBinding.inflate(LayoutInflater.from(context), this)
        setupCardView()
    }

}