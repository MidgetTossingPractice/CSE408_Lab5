
class BusinessMan(name:String, age:Int, organization:String, occupation:String): Person(name,age)
{
	var Occupation:String
	var Organization:String

	init
	{
		Occupation = occupation
		Organization = organization
	}

	fun do_runBusiness()
	{
		println("I am a $Occupation for $Organization")
	}
}