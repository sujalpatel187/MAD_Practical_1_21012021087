fun main(){
    print("Enter the number :")
    var a= readln()?.toInt()
    if(a!=null){
        if(a%2==0){
            println("$a is even number")
        }else{
            println("$a is odd number")
        }
    }
}