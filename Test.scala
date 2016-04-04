object Test {
   def main(args: Array[String]) {
      var x = 30;
      var y = 10;

      if( y < 20 ){
         println("This is if statement");
      } else {
	 println("This is else statement");
      }

      if( x < 20 ){
         println("This is if statement");
      } else {
	 println("This is else statement");
      }

      // While loop Test

      var a = 10;
      // An infinite loop.
      while( true ){
         println( "Value of a: " + a );
      }
   }
}