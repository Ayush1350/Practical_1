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
    var s1=Student("Ayush","Patel",20,20012011078,"CE","D","AB12")
    var s2=Student("Het","Patel",21,20012011010,"CE","D","AB12")
    var s3=Student("Kushi","Patel",18,20012011134,"CE","B","AB12")
    var s4=Student("Jainam","Patel",20,20012011123,"CE","A","AB12")
    var s5=Student("Yas","Patel",21,20012011023,"CE","C","AB12")
}