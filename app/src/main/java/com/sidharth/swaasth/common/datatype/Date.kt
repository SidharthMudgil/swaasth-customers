package com.sidharth.swaasth.common.datatype

import java.time.Instant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

data class Date(
    private val timeInMillis: Long
) {
    val date by lazy {
        LocalDateTime.from(Instant.ofEpochMilli(timeInMillis))
    }

    val DATE: Int
    val DAY: Int
    val YEAR: Int
    val MONTH: Int

    init {
        DAY = date.dayOfWeek.value
        DATE = date.dayOfMonth + 1
        MONTH = date.monthValue
        YEAR = date.year
    }

    fun getApproximateDifferenceInUnits(date: Date): String {
        val differenceInDays = ChronoUnit.DAYS.between(this.date, date.date)

        return when {
            differenceInDays < 1 -> {
                val hours = ChronoUnit.HOURS.between(date.date, this.date)
                "$hours ${if (hours == 1L) "hour" else "hours"}"
            }

            differenceInDays < 7 -> {
                "$differenceInDays ${if (differenceInDays > 1) "days" else "day"}"
            }

            differenceInDays < 28 -> {
                val weeks = differenceInDays / 7
                "$weeks ${if (weeks > 1) "weeks" else "week"}"
            }

            differenceInDays < 365 -> {
                val months = differenceInDays / 28
                "$months ${if (months > 1) "months" else "month"}"
            }

            else -> {
                val years = differenceInDays / 365
                if (years > 1) {
                    "$years years"
                } else {
                    "1 year"
                }
            }
        }
    }

    fun formattedDate(
        pattern: String = "dd-MM-yyyy"
    ) = DateTimeFormatter.ofPattern(pattern).format(
        Instant.ofEpochMilli(timeInMillis)
    )

    operator fun invoke(timeInMillis: Long) = Date(timeInMillis)
}