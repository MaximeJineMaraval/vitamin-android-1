package com.decathlon.vitamin.cards

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.StyleRes
import androidx.appcompat.widget.AppCompatImageView

abstract class AVitaminImageCardView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyleAttr: Int,
    @StyleRes private val defStyleRes: Int
) : AVitaminCardView(context, attrs, defStyleAttr, defStyleRes) {

    val imageView: AppCompatImageView?
        get() = findViewById(R.id.vtmn_card_image)

    override fun setupCardView() {
        super.setupCardView()
        retrieveAttributes()
    }

    private fun retrieveAttributes() {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.AVitaminImageCardView,
            defStyleAttr,
            defStyleRes
        )

        // Image
        attributes.getDrawable(R.styleable.AVitaminImageCardView_vtmnCardView_imageSrc)
            ?.let {
                imageView?.setImageDrawable(it)
            }

        attributes.recycle()
    }
}