package application

import di_container.ApplicationContext
import di_container.ClassPathScanner

fun main() {
    val context = ApplicationContext(ClassPathScanner.getAllClassesInSrc("application.src"))
    context.mockAction()
}