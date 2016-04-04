object PatternTest {
	def main(args: Array[String]){
		println(matchTest(5))
		println(matchTest(1))
		println(matchTest("two"))
		println(matchTest("test"))
		println("---------------")
		println(matchTest1(2))
		println(matchTest1(4))
	}

	def matchTest(x: Any): Any = x match {
		case 1 => "one"
		case "two" => 2
		case 3 => "three"
		case y: Int => "scala.Int"
		case _ => "many"
	}

	def matchTest1(x: Int): String = x match {
		case 1 => "one"
		case 2 => "two"
		case _ => "many"
	}
}
