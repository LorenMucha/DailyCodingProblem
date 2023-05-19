package dailycodingproblem

/*

A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.
 */

class TaskSeventy : DailyCodingProblem {
    override fun exec(value: Any): Any {
        var y = 9
        val x = value as Int
        var res = 0

        while(true){
            if(x + y == 10){
                res = "${x}${y}".toInt()
                break
            }
            y -=1
        }
        return res
    }
}