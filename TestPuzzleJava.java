import java.util.ArrayList;
import java.util.Random;

//  /////////////////////////////////////////////////////////////////////
//  TEST PUZZLE JAVA APP
//  By Virgilio D. Cabading Jr.     Created at: November 30, 2021 0730
//  /////////////////////////////////////////////////////////////////////

public class TestPuzzleJava {
	public static void main(String[] args) {
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("TEST PUZZLE JAVA APPLICATION\n");
		
		PuzzleJava generator = new PuzzleJava();

		System.out.println("*****************************************************");
		System.out.println("Get Ten Rolls\n");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		System.out.println("");
		
		System.out.println("*****************************************************");
		System.out.printf("Get Random Letter: %s\n\n", generator.getRandomLetter());
    	
		System.out.println("*****************************************************");
		System.out.println("Generate Password\n");

		System.out.println("Password is: " + generator.generatePassword());
		System.out.println("");

		System.out.println("*****************************************************");
		System.out.println("Generate New Password Set\n");
		for (String password : generator.getNewPasswordSet(10)) {
			System.out.println(password);
		}
	}
}

