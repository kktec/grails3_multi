package plugin


class FooInterceptor {

    FooInterceptor() {
        matchAll()
    }

    boolean before() {
        println "HELLO IN BEFORE"
        true 
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
