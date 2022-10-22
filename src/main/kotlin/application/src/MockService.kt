package application.src

import di_container.annotation.Component

@Component
class MockService {
    fun action() {
        println("service action")
    }
}