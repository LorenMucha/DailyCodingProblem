import dailycodingproblem.TaskSeventy
import dailycodingproblem.TaskSeventyThree

class Resolver {

    private val dailyProblems = mapOf(70 to TaskSeventy(), 73 to TaskSeventyThree())

    fun exec(int: Number, value: Any): Any{
        val solution = dailyProblems[int]
        return solution!!.exec(value)
    }
}