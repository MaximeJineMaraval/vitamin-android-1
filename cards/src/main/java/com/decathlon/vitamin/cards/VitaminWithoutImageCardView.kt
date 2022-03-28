package com.decathlon.vitamin.cards

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.decathlon.vitamin.cards.databinding.ViewWithoutImageCardviewBinding

open class VitaminWithoutImageCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : AVitaminCardView(
    context,
    attrs,
    R.attr.vtmnWithoutImageCardViewStyle,
    R.style.Widget_Vitamin_Card_WithoutImage
) {

    init {
        ViewWithoutImageCardviewBinding.inflate(LayoutInflater.from(context), this)
        setupCardView()
    }

}