import scala.io.Source

object ConsoleReadTest {
	def main(args : Array[String]){
		
		 println("Following is the content read:" )
		      Source.fromFile("printwrite.txt" ).foreach{ 
			print 
		}

		//Read from the Scala
		//println("Please enter your input ......")
		//var line = scala.io.Stdin
		//println("Thanks for enterting the text in te console "+line)


	}
}