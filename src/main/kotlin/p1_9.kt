import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    val arr = ArrayList<Int>()
    println("Enter size of arraylist:")
    val n = read.nextInt()
    println("Please Enter Array Value:")
    for (i in 0 .. n - 1) {
        print("a[$i]:" )
        arr.add(read.nextInt())
    }

    var max = arr[0]
    for(i in arr) {
        if (i > max){
            max = i
        }
    }
    println("Largest element = $max")
}