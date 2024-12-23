package java1;



import samplejava.Scanner;

public class vote {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the nationality");
	String input=obj.nextLine();
	System.out.println("enter the age");
	int age=obj.nextInt();
		if(input.equalsIgnoreCase("Indian")) {
			if(age>=18) {
				System.out.println("you are eligible to vote");
			}
			else {
				System.out.println("you are not eligible to vote due to age");
			}
		}
		else {
		  System.out.println("you are not eligible to vote");
		}
		}
	}