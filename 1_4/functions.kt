import java.io.File
import java.io.InputStream
import java.nio.charset.Charset

//Write a function to compare two numbers a and b
//if a < b, return 1
//if a > b, return -1
//if a == b, return 0
fun compare(a:Int, b:Int):Int
{
	var result:Int? = null
	when
	{
		a > b -> result = -1
		a < b -> result = 1
		else  -> result = 0
	}
	return result
}

//Write kotlin code to display age group based on the map
//0-20 Family
//60-100 Senior
//Else normal
fun determineAgeGroup(age:Int)
{
	when(age)
	{
		in 0..20 -> println("You are a youngster.")
		in 21..59 -> println("You are a normal person")
		in 60..100 -> println("You are an old person")
		else -> println("You are too old or too young")
	}

}
//re-write the following code to use when instead of ifs
fun cardTricks(cardPoints:Int)
{
	//val cardPoints:Int = 7_000
	val cardLevel:String = when(cardPoints)
	{
		in 0..1000 -> "pearl"
		in 1001..5_000 -> "silver"
		in 5_001..10_000 -> "gold"
		else -> "platinum"
	}

	val plural = when(cardPoints)
	{
		0 -> ""
		else -> "sheckles"
	}
	println("You have $cardPoints$plural and are at the $cardLevel level.")
}
//write the code to read from a text file and print its content
fun readfromtextFile()
{
	val file = File("turd.txt")
	var fileExists = file.exists()
	if(fileExists)
	{
		var ips:InputStream = file.inputStream()
		var textFile = ips.readBytes().toString(Charset.defaultCharset())
		println(textFile)
	}
	else
	{
		print("$file does NOT exist")
	}
}