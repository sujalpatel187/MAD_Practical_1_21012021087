fun main(){
    print("Enter Month number :")
    var a= readln()?.toInt()

    when(a){
        1 -> println("Month Name is : January")
        2 -> println("Month Name is : February")
        3 -> println("Month Name is : March")
        4 -> println("Month Name is : April")
        5 -> println("Month Name is : May")
        6 -> println("Month Name is : June")
        7 -> println("Month Name is : July")
        8 -> println("Month Name is : August")
        9 -> println("Month Name is : September")
        10 -> println("Month Name is : October")
        11 -> println("Month Name is : November")
        12 -> println("Month Name is : December")
        else -> {
            println("Please enter proper number.")
        }
    }
}