package com.decathlon.vitamin.cards

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import androidx.core.widget.TextViewCompat
import com.google.android.material.card.MaterialCardView

abstract class AVitaminCardView @JvmOverloads constructor(
    context: Context,
    private val attrs: AttributeSet? = null,
    private val defStyleAttr: Int,
    @StyleRes private val defStyleRes: Int
) : MaterialCardView(context, attrs, defStyleAttr) {

    private val titleView: TextView?
        get() = findViewById(R.id.vtmn_card_title)
    private val descriptionView: TextView?
        get() = findViewById(R.id.vtmn_card_description)
    val customLayout: ViewGroup
        get() = findViewById(R.id.vtmn_card_custom_layout)

    var title: String? = null
        set(value) {
            field = value
            titleView?.text = value
        }
    var description: String? = null
        set(value) {
            field = value
            descriptionView?.text = value
        }

    @StyleRes
    var titleTextAppearance: Int = -1
        set(value) {
            field = value
            titleView?.let { TextViewCompat.setTextAppearance(it, value) }
        }

    @StyleRes
    var descriptionTextAppearance: Int = -1
        set(value) {
            field = value
            descriptionView?.let { TextViewCompat.setTextAppearance(it, value) }
        }

    fun setTitle(@StringRes resId: Int) {
        title = resources.getString(resId)
    }

    fun setDescription(@StringRes resId: Int) {
        description = resources.getString(resId)
    }

    fun setCustomLayout(@LayoutRes resId: Int) {
        // Hide title and description
        titleView?.visibility = View.GONE
        descriptionView?.visibility = View.GONE
        // Reset and inflate the custom part
        customLayout.removeAllViews()
        customLayout.visibility = View.VISIBLE
        inflate(context, resId, customLayout)
    }

    internal open fun setupCardView() {
        radius = resources.getDimension(R.dimen.vtmn_radius_200)
        cardElevation = resources.getDimension(R.dimen.vtmn_card_elevation)

        val typedValue = TypedValue()
        context.theme.resolveAttribute(R.attr.vtmnBackgroundPrimary, typedValue, true)
        setCardBackgroundColor(typedValue.data)

        retrieveAttributes()
    }

    private fun retrieveAttributes() {
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.AVitaminCardView,
            defStyleAttr,
            defStyleRes
        )

        // Title
        title = attributes.getString(R.styleable.AVitaminCardView_vtmnCardView_title)
        // Description
        description =
            attributes.getString(R.styleable.AVitaminCardView_vtmnCardView_description)
        // CustomLayout
        attributes.getResourceId(
            R.styleable.AVitaminCardView_vtmnCardView_customLayout,
            -1
        ).let { layoutRes ->
            if (layoutRes != -1) {
                setCustomLayout(layoutRes)
            }
        }

        // Title text appearance
        titleTextAppearance = attributes.getResourceId(
            R.styleable.AVitaminCardView_vtmnCardView_titleTextAppearance,
            -1
        )
        // Description text appearance
        descriptionTextAppearance = attributes.getResourceId(
            R.styleable.AVitaminCardView_vtmnCardView_descriptionTextAppearance,
            -1
        )

        attributes.recycle()
    }
}