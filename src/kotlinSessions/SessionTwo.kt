package kotlinSessions

fun main() {

    //---------------------------------Loops----------------------------------

    // a loop is a block which is designed to be of a repeated execution
    // so instead of saying
    // println(x + 1)
    // println(x + 1)
    // we would commonly say
    println("Test while loop")
    var i: Int = 0
    while (i < 2) {
        i = i + 1
        println(i)
    }

    // do while loop is the same as while loop but the first condition is a mandatory condition (ie is executed even if the condition is not true)
    println("Test do while loop")
    i = 0
    do {
        i = i + 1
        println(i)
    } while (i > 2)

    // we can have a list of any data type
    // in this example we have a list of names
    val array = listOf("Ahmed", "Pavly", "Nabil")
    // a for-each loop  is used to loop over a list and display its items
    for (name in array) {
        println(name)
    }

    // 5) Ranges, a range define an interval with a lowest value and a highest value in an array
    // a range from 1 to 5
    val range = 1..5
    // test for loop with a step factor 1 in the range from 1 to 5
    for (number in range step 1) {
        println(number)
    }

    // 6) Jump statements
    // break is used to stop the loop block from running
    for (number in range step 1) {
        println("Before break")
        if (number > 3) {
            // stops looping
            break
        }
        println("After break")
    }

    // continue is used to skip the lines after it and continue looping
    for (number in range step 1) {
        println("Before continue")
        if (number > 3) {
            // skips the lines after it and continue looping
            continue
        }
        println("After continue")
    }
    //-----------------------------------------------------------------------
}