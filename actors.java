package java1;

import java.util.Scanner;

public class actors {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the hero names(dhanush,rajini,surya:)");
    String name=sc.nextLine();
    if(name.equalsIgnoreCase("dhanush")) {
    	System.out.println("captain miller");
    	System.out.println("three");
    	System.out.println("pattas");
    	}else
    if (name.equalsIgnoreCase("rajini")){
    	System.out.println("jailer");
    	System.out.println("padaiyapa");
    	System.out.println("annamalai");
    	
    }else
    	if(name.equalsIgnoreCase("surya")) {
    		System.out.println("kanguva");
    		System.out.println("singam");
    		System.out.println("24");
    		}
    	else {
    		System.out.println("the movie no in the list ");
    	}
    }	
}
    	
    		
    	}