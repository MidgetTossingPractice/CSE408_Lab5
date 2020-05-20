
open class Person(name:String, age:Int)
{
	var Name:String
	var Age:Int
	var eating:Boolean
	var walking:Boolean

	init
	{
		Name = name
		Age = age
		eating = false
		walking = false
	}

	fun walk()
	{
		walking = !walking
	}

	fun eat()
	{
		eating = !eating
	}

	fun talk()
	{
		println("My name is $Name")
		println("I am $Age years old")

		when
		{
			eating == true && walking == true -> println("I, $Name, am currently eating and walking at the same time!")
			eating == true && walking == false -> println("I, $Name, am currently eating.")
			eating == false && walking == true -> println("I, $Name, am currently walking.")
			eating == false && walking == false -> println("I, $Name, am not eating or walking at all.")
		}
	}
}