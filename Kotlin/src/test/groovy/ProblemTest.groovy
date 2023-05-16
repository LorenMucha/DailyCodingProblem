import spock.lang.Specification

class ProblemTest extends Specification {

    def "Problem should return 1"() {

        expect:
        new Resolver().exec(70, x) == result

        where:
        x | result
        1 | 19
        2 | 28
        3 | 37
        4 | 46
    }
}
