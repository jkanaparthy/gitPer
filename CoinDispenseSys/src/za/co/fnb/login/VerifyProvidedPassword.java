package za.co.fnb.login;

import za.co.fnb.pwd.PasswordUtils;

public class VerifyProvidedPassword {
	
    protected static boolean VerifyPwd(String providedPassword ){
                
        // Encrypted and Base64 encoded password read from database
//        String securePassword = "HhaNvzTsVYwS/x/zbYXlLOE3ETMXQgllqrDaJY9PD/U=";
//    	 String securePassword = "Rgug99iM3ZyCDTLT6EM5/c6/C5ejDPyEbUnBxngkr0Y=";
    	
    	 String securePassword = "D45bMHUMuvGayRpIE6MhXUCEpIn6NlsjmunWh7/Gf5k=";
        
        // Salt value stored in database 
//        String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
//        String salt = "FdpBACPt6Xbw6JHttBohL8n9lP5TsJ";
    	 String salt = "iH1gQMVPJ6m5Gx5C6ekspLOjrH8EAx";
        
        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
        
        if(passwordMatch) 
        {
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
        return passwordMatch;
    }
   
	 public static void main(String[] args){
	     // User provided password to validate for TESTING only
		 VerifyPwd("54321");
	    }
}
