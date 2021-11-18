package com.example.safecomposeargs

import com.example.annotation.ComposeDestination

@ComposeDestination(name = "functionWithoutArgs")
interface FunctionWithoutArgs

@ComposeDestination(name = "myAmazingFunction")
interface MyAmazingFunction {
    val arg1: String?
    val arg2: List<Int?>
    val arg3: List<Map<String, *>>
}
