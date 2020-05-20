
class MathTeacher(name:String, age:Int, organization:String): Person(name,age)
{
	var Occupation:String
	var Organization:String

	init
	{
		Occupation = "Math Teacher"
		Organization = organization
	}

	fun teach_the_Math()
	{
		println("I teach the math at $Organization haha")
	}
}