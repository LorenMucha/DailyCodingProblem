import dailycodingproblem.TaskSeventy

class Resolver {

    private val dailyProblems = mapOf(70 to TaskSeventy())

    fun exec(int: Number, value: Any): Any{
        val solution = dailyProblems[int]
        return solution!!.exec(value)
    }
}