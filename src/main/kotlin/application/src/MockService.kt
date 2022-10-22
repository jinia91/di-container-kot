package application.src

import di_container.annotation.Component

@Component
class MockService : MockUseCase{
    override fun action() {
        println("service action")
    }
}