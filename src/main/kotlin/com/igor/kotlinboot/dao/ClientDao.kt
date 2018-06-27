package com.igor.kotlinboot.dao

import com.igor.kotlinboot.model.Client
import org.springframework.data.mongodb.repository.MongoRepository

interface ClientDao : MongoRepository<Client, String> {
}