import kotlin.math.max

fun main(){
    var a1=ArrayList<Int>()
    a1.add(12)
    a1.add(22)
    a1.add(13)
    a1.add(45)
    a1.add(15)

    var a=a1.size
    for(i in 0 until a){
        println("a[$i] : "+ a1[i])

    }

    var s=0
    for( c in a1) {
        if (c > s) {
            s = c
        }
    }
    println("maximum eliment in arraylist is $s")

}