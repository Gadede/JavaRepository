package chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year");
		
		int year = input.nextInt();
		
		switch (year % 12)
		{
		case 0: System.out.println(" The Chinese Zodiac Sign is Monkey"); break;
		case 1: System.out.println(" The Chinese Zodiac Sign is Rooster"); break;
		case 2: System.out.println(" The Chinese Zodiac Sign is Dog "); break;
		case 3: System.out.println(" The Chinese Zodiac Sign is Pig"); break;
		case 4: System.out.println(" The Chinese Zodiac Sign is Rat "); break;
		case 5: System.out.println(" The Chinese Zodiac Sign is Ox "); break;
		case 6: System.out.println(" The Chinese Zodiac Sign is Tiger "); break;
		case 7: System.out.println(" The Chinese Zodiac Sign is Rabbit "); break;
		case 8: System.out.println(" The Chinese Zodiac Sign is Dragon "); break;
		case 9: System.out.println(" The Chinese Zodiac Sign is Snake "); break;
		case 10: System.out.println(" The Chinese Zodiac Sign is Horse "); break;
		case 11: System.out.println(" The Chinese Zodiac Sign is Sheep "); break;
		
		
		}
		input.close();

	}

}
