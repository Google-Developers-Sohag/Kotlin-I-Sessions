package kotlinSessions

//-------------------------------------Functions----------------------------------------------
// A function : represents a task block inside any software application.
// the fun main() represents the main thread process and we usually call it the main method.
// A thread : is a collection of program tasks (user-code) that run serially line by line.
// A function is a descriptive block for a task to be ran on a thread.
// main() : defines the main thread which is the main channel to run our tasks.
// A task : is the user code, examples : adding 2 numbers, collecting names and data, sending a message,...etc.
// There a 2 types of functions :
// Functions that don't return any value and they are usually called Unit Functions or Methods.
// Functions that have a return value, you can declare a return type using the colon ': Type' after the function names.

// 1) Unit Functions :
fun makePizza(): Unit{
    // a unit function is a process function that doesn't have a return value
    println("---------------------------My Pizza Task-----------------------------")
    println("Bake Pizza")
    println("Disperse Ingredients")
    println("Package Pizza")
    println("Deliver Pizza")
    println("---------------------------My Pizza Task-----------------------------")
}

// 2) Return functions :
fun add(): Int {
    // a function that adds 2 numbers and output the result
    return 2 + 3
}

// 3) String return function :
fun myID(): String {
    return "Amer\n" +
            "29 yrs old \n" +
            "Engineer \n" +
            "ID : 2982319842093091 \n"
}
// 4) a return function can return any type, even arrays and ranges :
// a range returning function
fun absoluteRange(): IntRange {
    return 2..20
}
// a progression returning function
fun absoluteProgression(): IntProgression {
    return 20 downTo 10
}
// an array returning function
fun studentNames(): ArrayList<String> {
    val names: ArrayList<String> = ArrayList()
    names.add("Micheal")
    names.add("Derek")
    names.add("John")
    return names
}
// you have noticed using this syntax 'fun name()' to define a function, but what's ()
// '()' are double parenthesis for passing parameters or variables locally to the function
// so if we want to add x and y and return the sum then x and y can be function's parameter variables.
// example
fun getSum(x: Int, y:Int): Int {
    return x + y
}
// We can modify the previous examples to use a parameterized functions.
// modify the studentNames function to accept a list parameter and wrap it inside a dynamic array, an ArrayList
fun studentNames(defaults: List<String>): ArrayList<String> {
    return ArrayList(defaults)
}

/**
 * The main function is the entry point for any kotlin application.
 */
fun main(): Unit {
    // call the pizza task
    makePizza()
    println(add())
    println(myID())
    // print the range values
    val absoluteRange: IntRange = absoluteRange()
    absoluteRange.forEach {
        println(it)
    }
    absoluteProgression().forEach {
        println(it)
    }
    val studentNames: ArrayList<String> = studentNames()
    studentNames.forEach {
        println(it)
    }
    println("Get the sum of 2 numbers : ${getSum(100, 101)}")
    // adding the default names
    val myList: ArrayList<String> = studentNames(listOf("Amer", "Ahmed", "Gamal"))
    // printing the defaults
    myList.forEach {
        println(it)
    }
    // adding extra names
    myList.add("New Name 1")
    myList.add("New Name 2")
    myList.forEach {
        println(it)
    }
}
