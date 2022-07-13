class FibonacciIterative {
    // Iterative approach
    fun fib(n: Int): Int {
        if(n < 2) return n
        
        var prev1 = 0
        var prev2 = 1
        for(i in 2..n) {
            val temp = prev2
            prev2 = prev1 + prev2
            prev1 = temp
        }
        
        return prev2
    }
}

class FibonacciRecursive {
    // Recursive approach
    fun fib(n: Int): Int {
        if(n < 2) return n
        return fib(n-1) + fib(n-2)
    }
}

class FibonacciRecursiveMemoization {
    // Recursive approach with memoization
    val valueMap = mutableMapOf<Int, Int>(0 to 0, 1 to 1)
    
    fun fib(n: Int): Int {
        valueMap[n]?.let {
            return it
        }
        
        valueMap[n] = fib(n-1) + fib(n-2)
        return valueMap[n]!!
    }
}