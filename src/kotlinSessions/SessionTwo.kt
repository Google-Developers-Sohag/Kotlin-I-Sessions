package kotlinSessions

fun main() {

    //---------------------------------Loops----------------------------------

    // a loop is a block which is designed to be of a repeated execution
    // instead of saying
    // var x: Int = 0
    // println(x + 1)
    // println(x + 1) .....
    // we would commonly say
    println("Test for loop")
    for (number in 0..2 step 1) {
        println(number)
    }

    // the same code can be written using a while loop with operand inequalities operations (>=, <=, ==, !=)
    println("Test equivalent while loop")
    // var i = 0 and i <= 2 is the same as ordering a looper in the range 0..2
    var i: Int = 0
    while (i <= 2) {
        println(i)
        // equivalent to step 1 in the previous for loop
        i = i + 1
    }

    // do while loop is the same as while loop but the first condition is a mandatory condition .
    // (ie: it is executed only one time even if the condition is not true).
    println("Test do while loop")
    // testing a mandatory action with an impossible condition or a false condition.
    i = 0
    do {
        i = i + 1
        println(i)
    } while (i > 2)

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
            println("Inside the condition !")
            // stops looping
            break
        }
        println("After break")
    }

    // continue is used to skip the lines after it and continue looping
    for (number in range step 1) {
        println("Before continue")
        if (number > 3) {
            println("Inside the condition !")
            // skips the lines after it and continue looping
            continue
        }
        println("After continue")
    }

    //-----------------------------------------------------------------------


    //--------------------------------- Exercises --------------------------------------------

    // The factorial function (symbol: !) refers to multiplying all whole numbers from our chosen number down to 1.
    // Rule = n! = n × (n−1) x (n-2) x (n-3) x .........
    // see more at : https://www.mathsisfun.com/numbers/factorial.html
    // request user input for a number value
    val number: String? = readLine()
    // check if the number is available
    if (number != null) {
        //convert the input to a number
        val input: Int = number.toInt()
        // create an interval for the factorial
        val range = 1..input
        // create a memory to hold the result
        var result: Int = 1
        // find the product of this range
        for (n in range) {
            result = n * result
        }
        println(result)
    } else {
        println("Invalid Input !")
    }

    // equivalent code

    // !! is the 'not-null assertion operator'
    // it checks if the value is null, if so then it converts it to a non-null value or empty string "".
    // it asserts the value to be non-null.
    // and its equivalent to
    /*
     *
     *  var number: String? = readLine()
     *  if (number != null) {
     *     number = number
     *  } else {
     *     number = ""
     *  }
     *
     */
    val input: Int = readLine()!!.toInt()
    // create an interval for the factorial
    // create a memory to hold the result
    var result: Int = 1
    // find the product of this range
    for (n in 1..input) {
        result = n * result
    }
    println(result)

    /*
    * Debugging exercise (DIY) :
    *
    * In the previous examples, try to input non-number values such as : your
    * name for example, observe and record your output and try to find a solution.
    *
    * Send the solution back to us !
    *
    */

    // multiplication table examples

    // In this example, we will guide you step-by-step to build a CLI program to print the
    // multiplication table of a given number.

    // 1) Request user input and convert it to an empty string "" if it was null (assertion).
    val userInput: String = readLine()!!
    // 2) Create a variable to hold some data
    val data: Int
    // 3) try to convert user input to a number, if it was convertible then use the input
    // otherwise exit with a user message.
    try {
        // try to convert the user input to a number
        data = userInput.toInt()
        // the block would continue if the input is a number
        // 4) Now let's find our multiplication table for this input, a multiplication table is in range from 1 to 12
        println("The multiplication table of $data")
        for (n in 1..12 step 1) {
            println("$data x $n = ${data * n}")
        }
    } catch (e: NumberFormatException) {
        // gets executed if the input is not a number
        println("Invalid Input !")
    }

}