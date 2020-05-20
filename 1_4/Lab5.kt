	
import java.util.Scanner

fun main(args: Array<String>)
{
	println("YEET")
	println("Enter two numbers you want to compare")
	var compareA = Scanner(System.`in`)
	var compareB = Scanner(System.`in`)
	var comparison:Int = compare(compareA.nextInt(), compareB.nextInt())
	println(comparison)

	println("How old are you?")
	var age = Scanner(System.`in`)
	determineAgeGroup(age.nextInt())

	println("How many sheckles do you have?")
	var numSheckles = Scanner(System.`in`)
	cardTricks(numSheckles.nextInt())
	
	readfromtextFile()

}

