package dailycodingproblem


/*
Given the head of a singly linked list, reverse it in-place
 */

class TaskSeventyThree : DailyCodingProblem {

    data class Node(var value: Int, var next: Node? = null) {
        override fun toString(): String {
            return "$value,$next".replace("null","")
        }
    }

    override fun exec(value: Any): Any {
        return reverse(value as Node)
    }

    private fun reverse(node: Node?):String {
        var prev: Node? = null
        var curr: Node? = node
        var next: Node?
        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        val resultString = prev.toString()
        return resultString.substring(0, resultString.length - 1)
    }
}