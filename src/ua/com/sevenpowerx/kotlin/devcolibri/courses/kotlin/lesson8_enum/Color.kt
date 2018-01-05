package ua.com.sevenpowerx.kotlin.devcolibri.courses.kotlin.lesson8_enum

enum class Color(var colorHex: String, var opacity: Double? = 1.0){

	WHITE("#FFFFFF"),
	BLACK("#000000"),
	RED("#22rr3333",0.5),
	GREEN("#qweqwee");


	fun some() {
		print("my logic " + this.name)


	}
}