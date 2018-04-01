package za.co.server;

import java.util.Scanner;

public class LoginCmd {
	public static void main(String args[]){  
		   Scanner sc = new Scanner(System.in);  
		     
		   System.out.println("Enter your User Name");  
		   String userName=sc.next();  
		   System.out.println("Enter your Password");  
		   String pwd=sc.next();  
		   System.out.println("User Name:"+userName+" Password:"+pwd);  
		   sc.close();  
		 }  
}
