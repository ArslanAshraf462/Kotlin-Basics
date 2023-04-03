package com.example.kotlinbasics
//var b = 3
fun main(){
    var denis = Person("Denis", "Panjuta", 31)
    denis.hobby = "to Skateboard"
    denis.age = 32
    println("Denis is ${denis.age} years old")
    denis.stateHobby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHobby()
//    var ohnPeterson = Person(lastName = "Peterson")
    myFunction(5)
    //b = 5
}
class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member variable - properties
    var age : Int? = null
    var frstName : String? = null
    var hobby : String = "watch Netflix"

    // Initializer block
    init {
        this.frstName = firstName
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String,lastName: String,age: Int)
            : this(firstName, lastName){
                this.age = age
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName age = $age")
            }

    // Member function : Methods

    fun stateHobby(){
        println("$frstName\'s hobby is $hobby")
    }
}
//Scope and Shadowing
// this a is a parameter
fun myFunction(a:Int){
    // a is a variable
    var b = 4
    println("a is $b")
}