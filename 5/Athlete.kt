
class Athlete(name:String, age:Int, organization:String, occupation:String): Person(name,age)
{
	var Occupation:String
	var Organization:String

	init
	{
		Occupation = occupation
		Organization = organization
	}

	fun do_the_football()
	{
		println("I do the $Occupation for $Organization")
	}
}