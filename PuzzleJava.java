import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

//  /////////////////////////////////////////////////////////////////////
//  PUZZLE JAVA CLASS
//  By: Viriglio D. Cabading Jr.    Created at: November 30, 2021 0730
//  /////////////////////////////////////////////////////////////////////

// To use methods from the Random library you will need to create an instance of Random

// From there you can use any of the methods listed in the documentation. For example:
 // <--- you won't need to use this method.


public class PuzzleJava {

    // generate and return an array with 10 random numbers between 1 and 20 inclusive.
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");
        int currentTime = Integer.parseInt(simpleDateFormat.format(new Date()));

        Random randMachine = new Random();
        randMachine.setSeed(currentTime);
        for (int i=0; i<10; i++) {
            intArray.add( randMachine.nextInt(20) + 1 );
        }
        return intArray;
    }
    
}