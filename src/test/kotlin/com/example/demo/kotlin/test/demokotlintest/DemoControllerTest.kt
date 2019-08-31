package com.example.demo.kotlin.test.demokotlintest

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(DemoController::class)
@RunWith(SpringRunner::class)
@ContextConfiguration(initializers = [ConfigFileApplicationContextInitializer::class])
internal class DemoControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun nanoURI() {
        mockMvc.perform(MockMvcRequestBuilders.get("/Hello"))
                .andExpect(MockMvcResultMatchers.status().isOk)
    }
}