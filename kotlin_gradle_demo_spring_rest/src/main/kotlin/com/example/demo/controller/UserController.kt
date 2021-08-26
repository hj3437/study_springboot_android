package com.example.demo.controller

import com.example.demo.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    val users = mutableListOf<User>()

    init {
        users.add(User(1, "뽀로로", "펭귄"))
        users.add(User(2, "크롱", "공룡"))
        users.add(User(3, "에디", "여우"))
        users.add(User(4, "패티", "비버"))
    }

    @GetMapping("user/readUserList")
    fun getUserAll(): List<User> = users
}