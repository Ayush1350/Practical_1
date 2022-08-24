open class Product(name: String,quantity: Int){
    var p:Int=-1
    init {
        println("Product name :$name")
        println("Quantity: $quantity")

    }
    constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
        this.p=p
        println("Price :$p per piece")
    }
}
class Laptop(name: String,quantity: Int,price : Int,cpu_n:String,RAM_s:String):Product(name,quantity,price){
    var hdd:String=""
    init{
        println("CPU name:$cpu_n")
        println("RAM_Size:$RAM_s")

    }
    constructor(name: String,quantity:Int,price: Int,cpu_n: String,RAM_s: String,hdd:String):this(name,quantity,price,cpu_n,RAM_s){
        this.hdd=hdd
        println("HDD_Size:$hdd")
        println("---------------")
    }

}

fun main(){
    var l1=Laptop("DELL",10,35000,"4Core","8GB","1024")
    var l2=Laptop("Lenovo",4,60000,"8Core","6GB","512")
    var l3=Laptop("HP",6,45000,"8Core","16GB","512")
    var l4=Laptop("ASUS",7,55000,"8Core","32GB","1024")
    var l5=Laptop("ACER",9,30000,"4Core","4GB","256")
}
