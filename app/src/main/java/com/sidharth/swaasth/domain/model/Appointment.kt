package com.sidharth.swaasth.domain.model

data class Appointment(
    val timeslot: String,
    val date: String,
    val doctor: Doctor,
)
