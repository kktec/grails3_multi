package plugin


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(FooInterceptor)
class FooInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test foo interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"foo")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
