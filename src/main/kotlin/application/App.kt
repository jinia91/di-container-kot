package application

import di_container.ClassPathScanner
import di_container.DiContainer

fun main() {
    val context = DiContainer(ClassPathScanner.getAllClassesInSrc("application"))
    context.mockAction()
}