fun main(){
var  jane = human("Jane",34,56)
   var sam = human("Sam",12,55)
    sam.eat(2)
    jane.eat(2)
    println(sam.weight)
    println(jane.weight)
    sam.speak("high")
    sam.birthday(1)
    jane.speak("Low")
    jane.birthday(1)
    var p = User("John","Pipi")
    println(p.firstName + p.lastName)

}
class human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
    weight+= foodWeight
        println("I am eating $foodWeight kgs of food")
        return weight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(x:Int){
        age+=x
println(age)
    }
}
data class User(val firstName:String, val lastName:String, /*val email:String, val phoneNumber:Int*/){

}