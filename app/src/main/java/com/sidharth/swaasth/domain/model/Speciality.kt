package com.sidharth.swaasth.domain.model

import com.sidharth.swaasth.common.enums.MedicalField

data class Speciality (
    val name: MedicalField,
    val image: String,
)