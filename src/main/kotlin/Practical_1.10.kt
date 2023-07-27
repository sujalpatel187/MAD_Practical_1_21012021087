fun main(){
    var c1=Car("BMW","C-class",200000,150000,"sujal patel",2000);
    var c2=Car("Swift","dzier",100000,50000,"sujal patel",200);


}

class Car(var typ:String,var model:String,var originalprice:Int,var currentprice:Int,var owner:String,var milesDriven:Int){
    fun getCarPrice(){
        println("The price of the car is  $currentprice")
    }
    init {
        println("init function called")
        println("Car information : $typ $model")
        println("Car Owner : $owner")
        println("Miles Driven : $milesDriven")
        println("Original car price $originalprice")
        println("Current car price  $currentprice")
        println("*******************************************")
    }
}
