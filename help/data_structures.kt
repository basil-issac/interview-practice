// Arrays
fun arraysExample() {
    val integerArray = IntArray(5)
    println(integerArray) // 0, 0, 0, 0, 0

    val intArrayOf = intArrayOf(1, 2, 3, 4)
    println(intArrayOf)

    val stringArray = Array<String>(5){i -> "$i"}
    println(stringArray)

    // byteArrayOf(), charArrayOf(), longArrayOf()
    val stringArrayOf = arrayOf("1", "2", "3", "4") 
    println(stringArrayOf) // 1, 2, 3, 4
    println(stringArrayOf.get(0)) // or stringArrayOf[0]
    println(stringArrayOf[1])

    stringArrayOf.set(0, "0") // or stringArrayOf[0] = "0"
    println(stringArrayOf) // "0", "2", "3", "4"

    println(stringArrayOf.size) // 4
}

// List
fun initializeList() {
    // Fill an immutablelist
    val doubleList = List(5) {i -> i * 2}
    println(doubleList)

    val doubleListOf = listOf(0, 1, 2, 3)
    println(doubleListOf.size)

    val mutableListOf = mutableListOf(0,1,2,3)
    println(mutableListOf.size)

    // Fill a mutable list of ten elements with zeros
    val zeroList = MutableList(10) {0}
    println(zeroList)
}


// ArrayDeque
fun arrayDequeExample() {
    val dayQueue = ArrayDeque<String>()
    
    dayQueue.add("Monday")  
    dayQueue.add("Tuesdy")  
    dayQueue.add("Wednesday")      
    println(dayQueue)
    // "Monday", "Tuesday", "Wednesday"
    
    dayQueue.addLast("Thursday")
    println(dayQueue)   
    // "Monday", "Tuesday", "Wednesday", "Thursday"

    dayQueue.addAll(listOf("Friday", "Saturday"))
    println(dayQueue)
    // "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"

    dayQueue.addFirst("Sunday")
    println(dayQueue)
    // "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"

    println(dayQueue.isNotEmpty())
    // True

    println(dayQueue.first())
    // "Sunday"

    println(dayQueue.last())
    // "Saturday"

    println(dayQueue.removeFirst())
    // "Sunday"

    println(dayQueue.removeLastOrNull()) 
    // "Saturday"
}