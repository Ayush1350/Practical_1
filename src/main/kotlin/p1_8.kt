import java.util.*

fun main(){
    println("Create Array-1 by using arrayOf() method:")
    val arr1 = arrayOf(10,90,60,80,100)
    println(Arrays.toString(arr1))

    println("Create Array-2 by using Array<>():")
    val arr2 = Array<Int>(5, {0})
    println(Arrays.toString(arr2))

    println("Create Array-3 by using Array<>() and lambda function:")
    val arr3 = Array(7){i: Int -> i}
    println(Arrays.toString(arr3))

    println("Create Array-4 by using IntArray<>():")
    val arr4 = IntArray(5,{0})
    for (i in 0..arr4.size - 1){
        print(" "+arr4[i])
    }
    println("")

    println("Create Array-5 by using intArrayOf():")
    val arr5 = intArrayOf(12,10,1,5,18,19)
    for (i in 0..arr5.size - 1){
        print(" "+arr5[i])
    }
    println("")

    println("Create 2D array-6 by using arrayOf() and intArrayOf():")
    val arr6 = arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7)
    )
    println(arr6.contentDeepToString())

    val arr7: Array<Int> = Array(5, {0})
    println("Please Enter Array Value:")
    val read = Scanner(System.`in`)
    for (i in 0..arr7.size - 1) {
        print("a[$i]= ")
        arr7[i] = read.nextInt()
    }
    println("Entered Array:")
    println(Arrays.toString(arr7))

    println("*********** With Built-in Function ***********")
    val arr8:Array<Int> = arrayOf(12,49,23,2,56)
    println(Arrays.toString(arr8))
    arr8.sort()
    println(Arrays.toString(arr8))

    println("*********** Without Built-in Function ***********")
    val arr9:Array<Int> = arrayOf(56,23,49,12,2)
    println(Arrays.toString(arr9))

    for (i in 0..arr9.size - 1){
        for (j in i + 1..arr9.size - 1){
            if (arr9[i] > arr9[j]){
                val temp = arr9[i];
                arr9[i] = arr9[j]
                arr9[j] = temp
            }
        }
    }
    println(Arrays.toString(arr9))
}
