package com.igor.kotlinboot.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Client(@Id val id: String? = null, val firstName: String, val orders: List<Order> = mutableListOf())