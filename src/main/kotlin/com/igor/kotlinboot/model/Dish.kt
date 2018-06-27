package com.igor.kotlinboot.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Dish (@Id val id: String, val name: String, val cost: Int);