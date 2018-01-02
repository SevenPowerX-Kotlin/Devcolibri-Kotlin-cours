package ua.com.sevenpowerx.kotlin.devcolibri.courses.kotlin.lesson4.function

fun main(args: Array<String>) {
	myFirstFunction()
	myFirstFunction2(1)
	val result = myFirstFunction4(1, 3.2)
	println(result)
}

fun myFirstFunction(): Int {
	return 1
}

fun myFirstFunction2(a: Long): Int {
	return a.toInt()
}

fun myFirstFunction3() {

}

fun myFirstFunction4(a: Long, b: Double) = a + b