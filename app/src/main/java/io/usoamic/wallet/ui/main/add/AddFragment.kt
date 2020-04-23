package io.usoamic.wallet.ui.main.add

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import io.usoamic.wallet.R
import io.usoamic.wallet.databinding.FragmentAddBinding
import io.usoamic.wallet.extensions.ARGS
import io.usoamic.wallet.models.AppArguments
import io.usoamic.wallet.ui.base.BaseFragment

class AddFragment : BaseFragment(R.layout.fragment_add) {
    override val viewModel: AddViewModel by viewModels()
    override val binding: FragmentAddBinding by lazy { FragmentAddBinding.bind(requireView()) }

    private val args get() = requireArguments().getParcelable<AppArguments.Add>(ARGS)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar)
        requireSupportActionBar().apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
}