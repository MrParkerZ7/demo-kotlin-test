package com.example.demo.kotlin.test.demokotlintest

import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/**"])
class DemoController(@Autowired val demoRepository: DemoRepository) {

    @RequestMapping
    fun nanoURI(@RequestBody(required = false) body: Any?): Any? {
        return body
    }
}

@Document
data class Demo(@Id val id: ObjectId, var name: String)

@Repository
interface DemoRepository : JpaRepository<Demo, ObjectId>