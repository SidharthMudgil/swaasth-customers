package com.sidharth.swaasth.domain.model

import com.sidharth.swaasth.common.enums.MedicalField

data class Doctor(
    val id: String,
    val name: String,
    val speciality: MedicalField,
    val experience: Int,
    val patientsCount: Int,
    val rating: Double,
    val appointmentDuration: Int,
    val availableDayOfWeek: List<Int>,
    val availableTimeRange: List<Pair<String, String>>
)