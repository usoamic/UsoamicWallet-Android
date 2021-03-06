package io.usoamic.app.domain.mappers.dashboard

import io.usoamic.commons.crossplatform.models.repository.dashboard.DashboardEntity
import io.usoamic.app.domain.models.realm.DashboardInfoRealm
import java.math.BigDecimal
import java.math.BigInteger

fun DashboardInfoRealm.toEntity() = DashboardEntity(
    ethBalance = BigDecimal(ethBalance!!),
    usoBalance = BigDecimal(usoBalance!!),
    height = BigInteger(height!!),
    supply = BigDecimal(supply!!)
)

fun DashboardEntity.toRealm() = DashboardInfoRealm(
    ethBalance = ethBalance.toPlainString(),
    usoBalance = usoBalance.toPlainString(),
    height = height.toString(),
    supply = supply.toPlainString()
)