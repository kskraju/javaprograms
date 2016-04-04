import scala.util.matching.Regex

object RegExTest {
   def main(args: Array[String]) {
      val pattern = "Scala".r
      var pattern1 = new Regex("[Ss]cala")
      val str = "Scala is Scalable and cool scala test one two Scala"

      println("************** Find First & All ************")
      println(pattern findFirstIn str)
      println((pattern findAllIn str).mkString(","))
      println("************** Replace ************")
      println(pattern replaceFirstIn(str,"Java"))
   }
}