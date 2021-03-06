package com.clog.clog.Auth.dto

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

class RegisterDto (
    @field:NotBlank
    val name: String,

    @field:Email
    val email: String,

    @field:NotBlank
    val password: String
)