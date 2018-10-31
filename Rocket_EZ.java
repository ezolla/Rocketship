/*
Ethan Zoller
10/28/18
Rocketship!
Project Description - Java program that creates a print out of a rocket ship, utilizing methods, nested for loops, print/println statements.
*/

public class Rocket_EZ {
   // Scale Determinator
   public static final int SIZE = 3;
   
   public static void main(String [] args) {
      cone();
      line();
      half1();
      half2();
      line();
      half2();
      half1();
      line();
      cone();
   }// Main Close
   
   // Creates the cone which is used on the top and bottom of the rocket
   public static void cone() {
		for (int line = 1; line <= (SIZE * 2 - 1); line++) {
         // starting space of new line
			System.out.print(" ");
			for (int spaces = 1; spaces <= (SIZE * 2 - 1) - line; spaces++){
				System.out.print(" ");
			}
         // / pattern (increasing)
			for (int slashes = 1; slashes <= line; slashes++) {
				System.out.print("/");
			}
         // Middle section **
			System.out.print("**");
         // \ pattern (increasing)
			for (int slashes = 1; slashes <= line; slashes++) {
				System.out.print("\\");
			}
         // ending space that sends to the next line
			System.out.println(" ");
		}
	} // Cone Close
   
   // Creates line used to intersect multiple sections within the rocket
   public static void line() {
      // + start
      System.out.print("+");
      // =*=* pattern
      for(int row = 1; row <= SIZE * 2; row++) {
         System.out.print("=*");
      }
      // + end
      System.out.println("+");      
   } // Line Close
   
   // Creates the top pattern of the 1st center section, and the 2nd half of the 2nd center section of the rocket.
   public static void half1() {
      for(int row = 1; row <= SIZE; row++) {
         // Pipe Open
         System.out.print("|");
         // Split it in half, print it twice to make full pattern
         for (int twotimes = 1; twotimes <= 2; twotimes++) {
            // Dots (Decreasing)
				for (int dots = 1; dots <= SIZE - row; dots++) {
					System.out.print(".");
				}
            // /\ (Increasing)
				for (int slants = 1; slants <= row; slants++) {
					System.out.print("/\\");
				}
            // Dots (Decreasing)
				for (int dots = 1; dots <= SIZE - row; dots++) {
					System.out.print(".");
				}
         } // Repeat For Loop Close
         // Pipe Close
         System.out.println("|");
      } // For Loop Close
   } // Half1 Close
   
   // Creates the bottom section of the 1st center section, and the top section of the 2nd center section. 
   public static void half2() {
      for (int row = SIZE; row >= 1; row--) {
         // Pipe Open
   		System.out.print("|");
         // Repeats pattern twice, side by side to create the full pattern
   		for (int twotimes = 1; twotimes <= 2; twotimes++) {
            // Dots (Increasing)
   			for (int dots = 1; dots <= SIZE - row; dots++) {
   				System.out.print(".");
   			}
            // \/ (Decreasing)
   			for (int slants = 1; slants <= row; slants++) {
   				System.out.print("\\/");
   			}
            // Dots (Increasing)
   			for (int dots = 1; dots <= SIZE - row; dots++) {
   				System.out.print(".");
   			}
   		}
         // Pipe Close
   		System.out.println("|");
   	} 
   } // Half2 Close
} // Rocket_EZ Close 

/*
Pseudo Code
-----------
Method Order
cone();
line();
half1();
half2();
line();
half2();
half1();
line();
cone();

cone();
/ (increasing)
** 
\ (increasing)

line();
+
=*=* (pattern)
+

half1();
|
.. (descreasing)
/\ (increasing)
.... (decreasing)
/\ (increasing)
.. (descreasing)
|

half2();

|
\/\/\/ (decreasing)
\/\/\/ (decreasing)
|

*/
