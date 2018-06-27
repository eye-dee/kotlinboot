package com.igor.kotlinboot

import com.igor.kotlinboot.dao.ClientDao
import com.igor.kotlinboot.model.Client
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinbootApplication(val clientDao: ClientDao) : CommandLineRunner {
    override fun run(vararg args: String?) {
        clientDao.deleteAll()

        IntProgression.fromClosedRange(0, 100, 1)
                .map { "John" + it }
                .map { Client(firstName = it) }
                .forEach { clientDao.save(it) }

        clientDao.findAll()
                .forEach { println(it) }
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinbootApplication>(*args)
}
