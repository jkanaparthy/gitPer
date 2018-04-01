package za.co.fnb.util;

import java.util.HashSet;
import java.util.Set;

public class VerifyRandAmt {

	public static boolean verifyRandAmt(int randAmt) {
		boolean isValidRandAmt = false;
		Set<Integer> randDenom = new HashSet<Integer>();
		randDenom.add(10);
		randDenom.add(20);
		randDenom.add(50);
		randDenom.add(100);
		randDenom.add(200);

		if (randDenom.contains(randAmt)) { 
			isValidRandAmt = true;	
			System.out.println("The rand note value is correct"+randAmt);
		}else {
			System.out.println("The rand note value is incorrect"+randAmt);
		}
		return isValidRandAmt;
	}
	
	public static boolean verifyRandCoin(int randCoin) {
		boolean isValidRandCoin = false;
		Set<Integer> randDenomCoin = new HashSet<Integer>();
		randDenomCoin.add(5);
		randDenomCoin.add(10);
		randDenomCoin.add(25);
		randDenomCoin.add(50);
		randDenomCoin.add(1);
		randDenomCoin.add(2);
		randDenomCoin.add(5);

		if (randDenomCoin.contains(randCoin)) { 
			isValidRandCoin = true;	
			System.out.println("The rand coin value is correct:"+randCoin);
		}else {
			System.out.println("The rand coin value is incorrect:"+randCoin);
		}
		return isValidRandCoin;
	}
	
	
	public static void main(String[] args) {
//		verifyRandAmt(100);
		verifyRandCoin(5);
	}
	
}
