package daysOftheWeek;

import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Index of the day with 0 starting from Sunday");
		
		int Day = input.nextInt();
		
		switch (Day) {
		
		case 0: System.out.println(" The Day is Sunday "); break;
		case 1: System.out.println(" The Day is Monday "); break;
		case 2: System.out.println(" The Day is Tuesday "); break;
		case 3: System.out.println(" The Day is Wednesday "); break;
		case 4: System.out.println(" The Day is Thursday "); break;
		case 5: System.out.println(" The Day is Friday "); break;
		case 6: System.out.println(" The Day is Saturday "); break;
		
		}
		input.close();
		Double x = Math.max(2.5, 3);
		System.out.print(x);
	
	int i = 0;
	while (i < 10) {
		 System.out.println("Let's Do This Java Thing");
		 i++;
		 
		 
		
	}
	}

}
