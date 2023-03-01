fun main() {
    var people= Human("Otieno",22,60)
    people.eat(20)
    people.weight
    println(people.weight)
     people.speak(speech = "I am rich")
    people.birthday()
    var person1=Person("Dosantos","Otieno","dosantosotieno@gmail.com",713685299,2022)
    println(person1.password)
    println(person1.email)

}
class Human(var name : String, var age: Int, var weight: Int ) {
    fun eat(foodweight: Int){
        println("I am eating $foodweight Kgs of food")
        weight += foodweight

    }
    fun speak(speech: String){
        println("I am rich")

}
fun birthday() {
    age+=1
    println(age)
}
}




//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class Person(var firstName: String, var lastName: String, var email: String, val phoneNumber: Int, var password: Int)



