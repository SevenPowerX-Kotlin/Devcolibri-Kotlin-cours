package ua.com.sevenpowerx.kotlin.devcolibri.courses.kotlin.lesson6

fun main(args: Array<String>) {

	val car = Car(9.2, 10)
	car.isNew = false
	car.isNew = true

	val person = Person("Andrii", "Lavryniuk", 40)

	print(person.age)
	print(" ")
	print(person.firstName)
	print(" ")
	print(person.lastName)
	print(".")


}