

import spock.lang.Specification

class PrimeNumberServiceTest extends Specification {
    def "send method 1"() {
        given:
        def input1 = 10
        def input2 = 25

        when:
        def result = input1 + input2
        def result2 = input1 - input1
        def result3 = input2 + input2

        then:
        result == 35
        result2 == 0
        result3 == 50
    }

    def "Send"() {
        given:
        int input1 = 10
        int input2 = 25

        when:
        int result = input1 + input2

        then:
        result == 35
    }
}
