package course2;


import java.util.Scanner;
public class assignement2 {
public static void main(String[]args) {
	Scanner input =new Scanner(System.in);
	byte score;
	String name;
	
	for(int i =1; i<=100; i++) {
		
		System.out.println("Enter your Name");
		name = input.next();
		
		System.out.println("Enter your Score");
		score = input.nextByte();
		if(score >= 90 && score <=100 ) {
			System.out.println("Your name is:" + name + "And your grade is: A+");
			
		}
		else if(score >= 70 && score <=89 ) {
			System.out.println("Your name is:" + name + "And your grade is: B+");
			
	}
		else if(score >=60 && score <=69 ) {
			System.out.println("Your name is:" + name + "And your grade is: C");
			
	}
		else if(score >= 40 && score <=59 ) {
			System.out.println("Your name is:" + name + "And your grade is: D");
			
}
		else if(score >=0 && score <=39 ) {
			System.out.println("Your name is:" + name + "And your grade is: Failure");
			
	}
}}}

