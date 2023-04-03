package com.example.kotlinbasics
//var b = 3
fun main(){
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var ohnPeterson = Person(lastName = "Peterson")
    myFunction(5)
    //b = 5
}
class Person(firstName: String = "John", lastName: String = "Doe"){
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}
//Scope and Shadowing
// this a is a parameter
fun myFunction(a:Int){
    // a is a variable
    var b = 4
    println("a is $b")
}