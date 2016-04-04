import java.io._

object PrintWriterTest {
	def main(args : Array[String]){
		// Write to the file
		val writer = new PrintWriter("printwrite.txt")
		writer.write("Hello Scala write to text file")
		writer.close()
		
		//Read from the Scala
		println("Please enter your input ......")
		var line = Console.readLine
		println("Thanks for enterting the text in te console "+line)


	}
}