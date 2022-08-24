fun main(){
    println("With Using Third Element")
    print("Before Swapping :")
    var a:Int = 10
    var b:Int = 20
    println("The Value of a is $a and Value of b is $b")
    var temp:Int
    temp=a
    a=b
    b=temp
    print("After Swapping :")
    println("The Value of a is $a and Value of b is $b")
    println("*********")
    println("Without Using Third Element")
    print("Before Swapping :")
    var c:Int = 10
    var d:Int = 20
    println("The Value of c is $c and Value of d is $d")
    c=c+d
    d=c-d
    c=c-d
    print("After Swapping :")
    print("The Value of c is $c and Value of d is $d")
}