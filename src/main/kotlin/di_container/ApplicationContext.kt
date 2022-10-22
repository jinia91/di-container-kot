package di_container

import application.src.MockController

class ApplicationContext(
    classes : Set<Class<*>>
) : DiContainer(classes) {
    fun mockAction(){
        val mock : MockController = beans.find { it.javaClass.isAssignableFrom(MockController::class.java) } as MockController
        mock.action()
    }
}