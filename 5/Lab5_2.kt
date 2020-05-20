
fun main(args: Array<String>)
{
	var mathTeacher:MathTeacher = MathTeacher("Giorno Giovanna", 25, "CSUSB")
	var footBaller:Athlete = Athlete("Andrew Andrewson Andrewton", 57, "Muted E-Spooats", "Football")
	var businessMan:BusinessMan = BusinessMan("Tadata Tadadaka", 24, "Rocket Scientist", "Imperial Japanese Navy")

	mathTeacher.eat()
	mathTeacher.walk()
	mathTeacher.talk()
	mathTeacher.teach_the_Math()

	footBaller.walk()
	footBaller.talk()
	footBaller.do_the_football()

	businessMan.talk()
	businessMan.do_runBusiness()
}