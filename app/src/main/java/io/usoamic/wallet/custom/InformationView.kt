package io.usoamic.wallet.custom

import android.content.Context
import android.util.AttributeSet
import io.usoamic.wallet.R
import io.usoamic.wallet.custom.base.BaseFrameLayout
import io.usoamic.wallet.databinding.ViewInformationBinding


class InformationView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : BaseFrameLayout(context, attrs, defStyleAttr, R.layout.view_information) {
    override val binding: ViewInformationBinding by lazy { ViewInformationBinding.bind(requireView()) }

    init {
        val a = context.obtainStyledAttributes(
            attrs,
            R.styleable.InformationView, 0, 0
        )
        binding.tvInfo.text = a.getString(R.styleable.InformationView_informationText)
        a.recycle()
    }
}