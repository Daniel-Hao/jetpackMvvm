package com.example.jetpackmvvm.test

class Test {
    fun sss() {
        val type = "a"
        var i = 0
        i = if (type == "a") {
            1
        } else if (type == "b") {
            2
        } else if (type == "c") {
            3
        } else {
            4
        }
    }
}
