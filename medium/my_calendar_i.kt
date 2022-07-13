// LeetCode Link: https://leetcode.com/problems/my-calendar-i/

class MyCalendar() {

    var root: Node? = null

    class Node(val start: Int, val end: Int) {
        var left: Node? = null
        var right: Node? = null

        fun insert(node: Node): Boolean {

            if (node.start < this.end && node.end > this.start) {
                return false
            }

            if (node.start < this.start) {

                if (this.left == null) {
                    this.left = node
                    return true
                } else {
                    this.left?.insert(node)
                }
            } else {

                if (this.right == null) {
                    this.right = node
                    return true
                } else {
                    this.right?.insert(node)
                }
            }
            return false
        }
    }

    fun book(start: Int, end: Int): Boolean {

        val nodeToInsert = Node(start, end)

        return root?.insert(nodeToInsert)
                ?: run {
                    root = nodeToInsert
                    true
                }
    }
}
