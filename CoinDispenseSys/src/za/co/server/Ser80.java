package za.co.server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ser80 {

	public static void main(String args[]) throws IOException{  
		String userName, temp;
		ServerSocket ss1 = new ServerSocket(81);  
		Socket sc1 = ss1.accept();
		Scanner s1 =  new Scanner(sc1.getInputStream());
		userName = s1.next();
	    System.out.println(userName);  
	    
		PrintStream ps = new PrintStream(sc1.getOutputStream());
		ps.println(userName);
	    System.out.println(userName);  
	}
}
