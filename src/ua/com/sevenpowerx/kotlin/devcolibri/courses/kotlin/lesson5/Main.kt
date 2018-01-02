package ua.com.sevenpowerx.kotlin.devcolibri.courses.kotlin.lesson5

fun main(args: Array<String>) {
	var str: String? = "hello"   //Переменная изменяемая (mutable)

	val size = str!!.length   //Переменная неизменяемая (unmeetable)
	println(size)
	str = getSt()   //Переменная

	var sizeTwo = str!!.length
	println(sizeTwo)
}


fun getSt(): String?{
	throw NullPointerException()
	return null
}
