package za.co.server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client80 {
	public static void main(String args[]) throws UnknownHostException, IOException{  
		   String userName , pwd;
		   Scanner sc = new Scanner(System.in);  
//		   Socket s = new Socket("127.0.0.1", 80);
		   Socket s = new Socket("localhost", 80);
		   
		   Scanner sc1 = new Scanner(s.getInputStream());  
		   System.out.println("Enter UserName:");  
		   userName = sc1.nextLine();
		   
		   Scanner sc2 = new Scanner(s.getInputStream());  
		   System.out.println("Enter Password:");  
		   pwd = sc2.next();
		   
		   PrintStream ps = new PrintStream(s.getOutputStream());
		   ps.println(userName);
		   ps.println(pwd);
		   
		   System.out.println(userName);
		   System.out.println(pwd);
		 }  
}