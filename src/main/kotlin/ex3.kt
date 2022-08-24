open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Nirmal","Patel",20,20012011114,"CE","D","AB12")
    var s2=Student("Het","Patel",21,20012011010,"CE","D","AB12")
    var s3=Student("Kush","Patel",20,20012011034,"CE","B","AB12")
    var s4=Student("Jenies","Patel",20,20012011023,"CE","A","AB12")
    var s5=Student("Parth","Patel",21,20012011123,"CE","C","AB12")
}