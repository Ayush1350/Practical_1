import java.util.Scanner

fun main(){
    val read = Scanner(System.`in`)
    println("Enter number")
    val n = read.nextInt()
    val ans = if (n % 2 == 0){
        "Number is even"
    } else {
        "Number is odd"
    }
    println(ans)
}

