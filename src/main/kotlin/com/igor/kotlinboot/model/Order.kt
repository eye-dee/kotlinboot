package com.igor.kotlinboot.model

import org.springframework.data.annotation.Id

data class Order (@Id val id: String, val dishes: List<Dish>)