import java.util.Arrays

fun main(){
    var a=IntArray(size = 5)
    a[0]=1
    a[1]=2
    a[2]=3
    a[3]=4
    a[4]=5

    print("the array using IntArray is : ")
    for(b in a){
        print("$b  ")
    }
    println("")

    println("*****************************************************************")

    var b= arrayOf(1,2,3,4,5)
    println("array using arrayof() mathod is : "+ Arrays.deepToString(b))

    println("*****************************************************************")

    var c = intArrayOf(1,2,3,4,5)
    print("array using intarrayof() is : ")
    for(b in c){
        print("$b  ")
    }
    println(" ")

    println("using lambda function")
    var d=Array<Int>(5){i:Int->i+1 }
    for(i in d){
        print("$i  ");
    }
   println(" ")
    var s = intArrayOf(1,4,2,5,3)
    s.sort()
    println("using built in function")
    for(i in s){
        print("$i  ");
    }
    println(" ")

    var array = intArrayOf(1,4,2,5,3).toTypedArray()
    sortarray(array)

}
fun sortarray(a: Array<Int>){
    var n=a.size
    var temp: Int
    for(i in 0 until n){
        for(j in 0 until n){
            if(a[i]<a[j]){
                temp=a[i]
                a[i]=a[j]
                a[j]=temp
            }
        }
    }
    println("without built in function")
    for(i in a){
        print("$i  ");
    }
    println(" ")
}



// lemda function
//higher order function
//anoynomys function