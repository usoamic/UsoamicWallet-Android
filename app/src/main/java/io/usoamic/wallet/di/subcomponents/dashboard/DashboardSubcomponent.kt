package io.usoamic.wallet.di.subcomponents.dashboard

import dagger.Subcomponent
import io.usoamic.commons.crossplatform.scopes.AccountScope
import io.usoamic.wallet.ui.main.dashboard.DashboardFragment

@AccountScope
@Subcomponent
interface DashboardSubcomponent {
    fun inject(dashboardFragment: DashboardFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): DashboardSubcomponent
    }
}