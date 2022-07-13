// If-Else conditions
fun ifElse() {
    val a = 10
    val b = 15
    var max = a
    if (a < b) max = b
    println(max)

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println(max)

    // As expression
    max = if (a > b) a else b
    println(max)

    max =
            if (a > b) {
                print("Choose a")
                a
            } else {
                print("Choose b")
                b
            }
    println(max)
}

// When expression
fun whenExpression() {
    val x = 2
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3, 4 -> print("x == 3 or 4")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
}

// For loops
fun forLoops() {
    val items = listOf("item 1", "item 2", "item 3", "item 4")

    for (item in items) {
        print(item)
    }

    // Inclusive
    for (i in 1..3) {
        println(i)
        // 1, 2, 3
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
        // 6, 4, 2, 0
    }

    for (i in 1 until 5) {  // i in 1 until 10, excluding 5
        print(i)
        // 1, 2, 3, 4
    }

    for (i in items.indices) {
        println(items[i])
    }

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}

// While loops
fun whileLoops() {
    var num = 10

    while(num>=5){
        println("Loop: $num")
        num--
    }

    // Do-while loop
    do {
        println("Loop: $num")
        num++
    }
    while (num<=105)
}