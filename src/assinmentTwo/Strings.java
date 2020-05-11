package assinmentTwo;

import java.util.Scanner;

public class Strings {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a Sting:");
		Scanner input = new Scanner(System.in); //request to user
		String abc = input.nextLine(); // reading the code
		String strUpper = abc.toUpperCase();
		System.out.println(strUpper);
		int strLen = abc.length();
		System.out.println(strLen);
		String strRep = strUpper.replace("O", "Z");
		System.out.println(strRep);
		System.out.println(strRep.charAt(strLen-1));
		System.out.println(abc.concat(" ").concat("Test"));
		
		
		
			
	}

}
