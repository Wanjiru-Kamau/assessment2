fun main() {
    var savingAccount = savingAccount()
    var things = Data("mango",56.0,200,"grocery")
    println(things.Name)
    println(things.weight)
    println(things.price)
    println(things.category)
    //for (char in fruit) println(char)
    println()

}

open class currentAccount() {
    fun accountNumber() {
        println(1234568)
    }

    fun accountName() {
        println("Renee")
    }

    fun accountBalance() {
        println(350000)
    }
}

class savingAccount() {
    fun withdraw(){
        println()
    }
}
class Data(var Name:String, var weight: Double, var price:Int, var category:String)

fun indices(){
    var fruit = "banana"
    for (char in fruit) println(char)
    println(fruit)

}