package kotlinSessions

/**
 * The main method is the entry point for any application in almost all
 * programming languages including kotlin, write all your executable code here.
 * NB : Comments represent non-compilable and non-executable code.
 */
fun main() {

    //------------------------------ Introduction to applications and kotlin --------------------------
    // Refer to our manual for intro.
    //-------------------------------------------------------------------------------------------------


    //---------------------------------------Basic Syntax---------------------------------------------
    // Refer to our manual for basic syntax.
    // https://kotlinlang.org/docs/basic-syntax.html
    //-------------------------------------------------------------------------------------------------


    // printing things onto your screen
    println("Welcome to our lovely course !")


    //---------------------------------------Basic Types---------------------------------------------

    // var is a changeable data
    // val is an unchangeable data (constant data)

    // an integer is either a +ve or -ve non-fractional 32-bit number
    val positiveInt: Int = 23222222
    val integerSize: Int = Int.SIZE_BITS
    val integerMax: Int = Int.MAX_VALUE
    println(positiveInt)
    println(integerSize)
    println(integerMax)

    // a long is either a +ve or -ve non-fractional 64-bit number
    val positiveLong: Long = 23222222L
    val longSize = Long.SIZE_BITS
    val longMaxValue: Long = Long.MAX_VALUE
    println(positiveLong)
    println(longSize)
    println(longMaxValue)

    // a float is either a +ve or -ve real number of 32-bit storage, it ends with F or f
    val positiveFloat: Float = 2.23F

    // a Double is either a +ve or -ve real number of 64-bit storage
    val positiveDouble: Double = 2.2314141241241421414

    // unsigned integers are neither +ve nor -ve numbers 
    // common examples are age, device vendors, phone numbers, serial numbers, music duration and battery percentage
    var unsignedInt: UInt = 20u
    unsignedInt += 2u
    println(unsignedInt)

    // boolean values are either true or false
    var myBoolean: Boolean = true
    // print before flipping
    println("Boolean test : $myBoolean")
    // to flip a boolean use the inverse or inverter operator
    myBoolean = !myBoolean
    // print after flipping
    println("Boolean test : $myBoolean")

    // if we want to represent a letter from alphabet, we use Chars
    var letter: Char = 'A'
    letter = 'a'
    println("My Letter is a changing value : $letter")

    // using a value not a variable
    val letter2: Char = 'D'
    println("My Letter is a constant value : $letter2")

    //-----------------------------------------------------------------------------------------------


    //----------------------------------------Comments in kotlin---------------------------------------------

    // Comments represent non-compilable and non-executable code
    //single line comment
    /**
     * Documentation comment
     */

    /*
     * Multiline comment
     * Yes, as you can see, this is not compiled by the kotlin compiler
     */

    //-------------------------------------------------------------------------------------------------------


    //---------------------------------------Casting between data types---------------------------------------------

    // casting is converting from a data type to another data type
    // converting boolean to a string
    var condition4: Boolean = true
    val convert4: String = condition4.toString()
    //converting from string to boolean
    condition4 = convert4.toBoolean()
    // converting an Int to a String
    val myNumber: Int = 2
    val convertMyNumber: String = myNumber.toString()

    //--------------------------------------------------------------------------------------------------------------


    //---------------------------------------Exercise---------------------------------------------

    // 1) creating your ID data

    // your name is a constant data and its a String or some characters from alphabets
    val myName: String = "Mohammed"
    // your age is changing and unsigned number
    var myAge: UInt = 21u
    // your work is a constant data
    // defining the type of data as String is optional here
    val work: String = "Engineer"
    // your religion is a constant
    val religion: String = "Muslim"
    // your ID number is a constant value
    // defining the type of data is a must here or else append L at the end of a big number
    val idNumber: Long = 22341512312343
    // now print your own ID
    println("----------------------------")
    println("| Name : $myName |")
    println("| Age : ${myAge} |")
    println("| Work : $work |")
    println("| Religion : $religion |")
    println("| ID Number : $idNumber |")
    println("----------------------------")

    // 2) print your ID after 2 years

    println("----------------------------")
    println("| Name : $myName |")
    println("| Age : ${myAge + 2u} |")
    println("| Work : $work |")
    println("| Religion : $religion |")
    println("| ID Number : $idNumber |")
    println("----------------------------")

    //-----------------------------------------------------------------------------------------------------


    //--------------------------------------- Basic Operations ---------------------------------------------

    // 1) a calculator example
    val x: Int = 2
    val y: Int = 3

    val addition: Int = x + y
    println("Sum = $addition")

    val subtraction: Int = y - x
    println("Difference = $subtraction")

    val product: Int = x * y
    println("Product = $product")

    // multiplication will be done before addition
    val multiplicativeProperty: Int = (x * y) + 1
    println("Result = $multiplicativeProperty")

    val division: Int = 4 / 2
    println("Division = $division")

    // equivalent operations
    // 'x += 10' is the same as 'x = x + 10'
    // '++x' is called a prefix increment the same as 'x += 1' and 'x = x + 1'
    // 'x++' is called a postfix increment, its same as :
    // 'x = x' at this line
    // 'x = x + 1' at the next line

    //-----------------------------------------------------------------------------------------------------


    //--------------------------------------- Boolean Algebra ---------------------------------------------

    // boolean is either true or false
    // think of logic gates when it comes to booleans or the probability of certainty/truth and impossibility/lie (0 or 1)
    // true means 1 means (certain)
    // false means 0 means (impossible) OR (uncertain)
    var probability1: Boolean = true
    var probability0: Boolean = false
    // when 1 (true) and 0 (false) are combined in a logic gate AND the result would be 0 (false)
    // the AND gate is designated by && symbol for logical AND
    println("Test booleans AND : ${probability0 && probability1}")
    // when 1 and 0 are combine in a logic gate OR the result would be 1
    // the OR gate is designated by || symbol for logical OR
    println("Test booleans OR : ${probability0 || probability1}")
    // when 1 (true) is inverted, the result is zero (false)
    // ! is called the inverter gate or the logical inverse
    println(!probability1)
    // when 0 (false) is inverted, the result is one (true)
    // ! is called the inverter gate or the logical inverse
    println(!probability0)

    //---------------------------------------------------------------------------------------------


    //--------------------------------------- Operand Operations ---------------------------------------------

    // Operand Operations are operations that involve using '==' for operand equal, '>=' for bigger than or equal and '<=' for less than or equal
    // to compare between numbers, the result is a boolean expression
    val condition: Boolean = 1 >= 2
    println("Test operand bigger than or equal : $condition")
    var age: UInt = 20u
    // checks whether this age is a university student age
    val isStudent: Boolean = age >= 20u
    println("Check my age : $isStudent")

    //---------------------------------------------------------------------------------------------------------


    //--------------------------------------- Control flow statements ---------------------------------------------

    // Control flow statements (if{}else{}, when{}, for{}, while{}, do{} while{} loops)
    // 1) Conditional if else accepts a condition and if its true the if block would be executed otherwise the else would be used and
    // the if block would be skipped.
    if (probability0 == true) {
        println("The condition is true")
    } else {
        println("The condition is false")
    }

    // nested if..else, to check multiple conditions
    if (age > 0u && age <= 5u) {
        println("Kindergarten -- KG")
    } else if (age > 5u && age <= 10u) {
        println("Primary School")
    } else if (age > 10u && age <= 14u) {
        println("Preparatory School")
    } else if (age > 14u && age <= 17u) {
        println("Secondary School")
    } else if (age > 17u && age <= 24u) {
        println("University Student")
    } else {
        println("Worker")
    }

    // 2) when is to check for a specific case, if this case is equal to the input
    // then execution of that block would take place
    // Syntax
    val input: Int = 200
    when (input) {
        // if input equals to 3 then execute this block
        (3) -> {
            println("Input was 3")
        }
        (4) -> {
            println("Input was 4")
        }
        (200) -> {
            println("Input was 200")
        }
    }

    // 3) another use case
    // increment the age
    age = age + 10u
    when (age > 20u && age >= 18u) {
        (true) -> {
            println("Worker")
        }
        (false) -> {
            println("University Student")
        }
    }

    // 4) loops, a loop is a block which is designed to be of a repeated execution
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

    //---------------------------------------------------------------------------------------------------------


    //---------------------------------------- An introduction to Exception Handling -------------------------------------------------
    // Exception handling is used to control the flow of your program if an un-accepted action takes place
    // for example : dividing a number by zero would result in a ArithmeticException which is the same
    // as the math error message you see in your calculator
    val number1: Int = 1
    val number0: Int = 0
    var result: Int
    try {
        // when we divide a number by zero, the program skips the lines after this operation and enters the catch() block
        // a throws a math error message
        result = number1 / number0
    } catch (e: ArithmeticException) {
        println("Math Error")
    }
    //-----------------------------------------------------------------------------------------

}
