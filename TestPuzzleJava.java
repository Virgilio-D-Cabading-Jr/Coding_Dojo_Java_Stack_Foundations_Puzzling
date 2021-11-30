import java.util.ArrayList;
import java.util.Random;

//  /////////////////////////////////////////////////////////////////////
//  TEST PUZZLE JAVA APP
//  By Virgilio D. Cabading Jr.     Created at: November 30, 2021 0730
//  /////////////////////////////////////////////////////////////////////

public class TestPuzzleJava {
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		

    	//..
		// Write your other test cases here.
		//..
	}
}

