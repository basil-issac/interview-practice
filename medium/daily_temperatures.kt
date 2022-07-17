// LeetCode link: https://leetcode.com/problems/daily-temperatures/
// Time: O(n)
// Space: O(n)

class DailyTemperatures {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack = ArrayDeque<Pair<Int, Int>>()
        
        for((index, value) in temperatures.withIndex()) {
            while(stack.isNotEmpty() && stack.last().first < value) {
                val last = stack.removeLast()  
                result[last.second] = index - last.second 
            }
            stack.add(Pair(value, index))
        }
        
        return result
    }
}