package Variables

fun main(){

    print("Enter name")
    var name = readLine()
    println("Enter Age")
    var age = readLine()!!.toInt()  // !! will be sed here to deal with string value now the system will accept only f you type integer number only

    println("========Your Given Information")
    println("Name $name")
    println("Age $age")
}