package checkTriangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	int s1 = 0, s2 = 0, s3 = 0;
	
	System.out.println("Enter Sides Of Triange :");
	
s1 = Sc.nextInt();
s2 = Sc.nextInt();
s3 = Sc.nextInt();


 
if (s1 == s2 && s2 ==s3) {
	System.out.println("Triangle is Equilateral ");
}
else if (s1 != s2 && s2 != s3 && s1 !=s3) {
	System.out.println("The Triangle is Scalene ");
	
}
else {
	System.out.println("The Triangle is Isosceles. ");
}

Sc.close();
	}

}
