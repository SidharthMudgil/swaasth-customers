package com.sidharth.swaasth.domain.model

import com.sidharth.swaasth.common.enums.Gender

data class User(
    val id: String,
    val name: String,
    val phone: String,
    val email: String,
    val sex: Gender,
    val dob: Long,
    val cover: String,
)
