package kotlinSessions

/**
 * The main method is the entry point for any application in almost all
 * programming languages including kotlin, write all your executable code here.
 * NB : Comments represent non-compilable and non-executable code.
 */
fun main() {
    // Comments represent non-compilable and non-executable code
    //single line comment
    /**
     * Documentation comment
     */

    /*
     * Multiline comment
     * Yes, as you can see, this is not compiled by the kotlin compiler
     */

    // printing things onto your screen
    println("Welcome to our lovely course !")

    // basic types

    // an integer is either a +ve or -ve non-fractional 32-bit number
    val positiveInt = 23222222
    val integerSize = Int.SIZE_BITS
    val integerMax: Int = Int.MAX_VALUE
    println(positiveInt)
    println(integerSize)
    println(integerMax)

    // a long is either a +ve or -ve non-fractional 64-bit number
    val positiveLong = 23222222L
    val longSize = Long.SIZE_BITS
    val longMaxValue: Long = Long.MAX_VALUE
    println(positiveLong)
    println(longSize)
    println(longMaxValue)

    // unsigned integers are either +ve nor -ve ones
    var unsignedInt : UInt = 20u
    unsignedInt += 2u
    println(unsignedInt)

    // boolean values are either true or false
    var myBoolean = true
    // print before flipping
    println("Boolean test : $myBoolean")
    // to flip a boolean use the inverse or inverter operator
    myBoolean = !myBoolean
    // print after flipping
    println("Boolean test : $myBoolean")


    // if we want to represent a letter from alphabet
    var letter = 'A'
    letter = 'a'
    println("My Letter is a changing value : $letter")

    // using a value not a variable
    val letter2 = 'D'
    println("My Letter is a constant value : $letter2")

    //-------------------------Exercise-------------------------

    // 1) creating your ID data
    // your name is a constant and its a String or some characters from alphabets
    val myName = "Mohammed"
    // your age is changing
    var myAge = 21
    // your work is a constant
    // defining the type of data as String is optional here
    val work: String = "Engineer"
    // your religion is a constant
    val religion = "Muslim"
    // your ID number is stable
    // defining the type of data is a must here or else append L at the end of a big number
    val idNumber: Long = 22341512312343
    // now print your own ID
    println("Name : $myName")
    println("Age : $myAge")
    println("Work : $work")
    println("Religion : $religion")
    println("ID Number : $idNumber")

    // 2) print your ID after 2 years
    println("Name : $myName")
    println("Age : ${myAge + 2}")
    println("Work : $work")
    println("Religion : $religion")
    println("ID Number : $idNumber")

    // Basic Operations

    // 1) a pointer (mouse) and a screen size, showing addition/subtraction operations
    var x = 20
    var y = 30
    // screen size is constant
    val length = 50
    val width = 100
    // create a string (text)
    val display = "Screen Dimensions = L($length) x W($width)."
    println(display)
    println("Pointer location = (x($x), y($y))")
    // move the pointer upward on the y-axis
    y = y + 10
    // move the pointer horizontally on the x-axis
    x = x + 10
    // print the new location
    println("Pointer location = (x($x), y($y))")
    // move the pointer back to its origin
    y = y - 10
    x = x - 10
    // print the new location
    println("Pointer location = (x($x), y($y))")
    // print the current screen state in a different format
    //  \n is an escape sequence, means new line
    // the plus sign can concatenate strings or text together
    // println() vs print(), println() prints the message in a new line while print() prints the message with
    // the same line as previous message do.
    print("----------------------\n"
            +"| Retina Screen : | \n" +
            "| $display | \n" +
            "| Pointer location = (x($x), y($y)) | \n"
            +"----------------------\n")

    // equivalent operations
    // 'x += 10' is the same as 'x = x + 10'
    // '++x' is called a prefix increment the same as 'x += 1' and 'x = x + 1'
    // 'x++' is called a postfix increment, its same as :
    // 'x = x' at this line
    // 'x = x + 1' at the next line

    // Boolean operations for dummies -- Boolean Algebra --
    // think of logic gates when it comes to booleans or the probability of certainty/truth and impossibility/lie (0 or 1)
    // true means 1 means certain
    // false means 0 means impossible
    var probability1 = true
    var probability0 = false
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

    // Assignment on operations
    /*
     * Create a simple calculator CLI application, to display the calculator model number
     * and vendor at the beginning of the application and to do operations on 2 numbers only.
     *
     *
     * The mathematical operations that should be supported are :
     * - Addition
     * - Subtraction
     * - Multiplication
     * - Division
     *
     */

}