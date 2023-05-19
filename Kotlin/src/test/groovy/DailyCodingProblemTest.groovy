import dailycodingproblem.TaskSeventy
import dailycodingproblem.TaskSeventyThree
import spock.lang.Specification

class DailyCodingProblemTest extends Specification {

    def "Task #70"() {

        expect:
        new Resolver().exec(70, x) == result

        where:
        x | result
        1 | 19
        2 | 28
        3 | 37
        4 | 46
    }

    def "Task 73"() {

        given:
        def fourList = new TaskSeventyThree.Node(0,
                new TaskSeventyThree.Node(1,
                        new TaskSeventyThree.Node(2,
                                new TaskSeventyThree.Node(3,
                                        new TaskSeventyThree.Node(4, null)))))
        def result =  new Resolver().exec(73, fourList).toString()

        expect:
        result == "4,3,2,1,0"
    }
}
