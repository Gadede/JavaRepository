package subtractionQuizLoop;

import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
int sum = 0;

System.out.println("Enter a new value blaaaaaa: ");
int number = input.nextInt();

 do {
	 System.out.println("Enter an integer " +
	 "(the input ends if it is 0)");
	
	 number = input.nextInt();
	 sum += number;
	 
 } while (number != 0);

input.close();
System.out.println("The sum is " + sum);





	}

}
