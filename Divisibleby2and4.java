package java1;

import samplejava.Scanner;

public class Divisibleby2and4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to divoisible by 2 and 4 :");
		int value=sc.nextInt();
		while(true){
			if(value%2==0 && value%4==0) {
				System.out.println("the number"+value+"is divisible by both 2and 4");
				
			}else {
				System.out.println("the number"+value+"is not divisible by both 2 and 4");
			}
		break;
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
