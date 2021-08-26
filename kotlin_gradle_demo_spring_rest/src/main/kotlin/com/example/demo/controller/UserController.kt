package com.example.demo.controller

import com.example.demo.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    val users = mutableListOf<User>()

    init {
        users.add(User(1, "사과", "빨강"))
        users.add(User(2, "사과", "파랑"))
        users.add(User(3, "바나나", "노랑"))
        users.add(User(4, "딸기", "빨강"))
    }

    @GetMapping("user/readUserList")
    fun getUserAll(): List<User> = users
}