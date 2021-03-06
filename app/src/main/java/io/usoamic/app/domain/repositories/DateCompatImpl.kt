package io.usoamic.app.domain.repositories

import io.usoamic.commons.crossplatform.api.DateCompat
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset
import javax.inject.Inject

class DateCompatImpl @Inject constructor() : DateCompat {
    override val currentTimestamp: Long
        get() = LocalDateTime.now(ZoneOffset.UTC).toEpochSecond(ZoneOffset.UTC)
}