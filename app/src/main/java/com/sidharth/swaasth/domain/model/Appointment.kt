package com.sidharth.swaasth.domain.model

data class Appointment(
    val timeslot: String,
    val timestamp: Long,
    val doctor: Doctor,
)
