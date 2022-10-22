package application.src

import di_container.annotation.Autowired
import di_container.annotation.Component

@Component
class MockController(
){
    @field:Autowired
    private lateinit var mockService : MockService

    fun action() {
        println("controller action")
        mockService.action()
    }

}