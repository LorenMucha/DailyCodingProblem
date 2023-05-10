import spock.lang.Specification

class ProblemTest extends Specification {

    def "Problem should return 1" () {
        given:
        def resolver = new DailyProblem()

        when:
        int result = resolver.exec()

        then:
        result == 1
    }
}
