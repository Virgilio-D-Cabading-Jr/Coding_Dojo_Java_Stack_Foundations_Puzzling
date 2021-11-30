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
    private Random randMachine;

    public PuzzleJava() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");
        int currentTime = Integer.parseInt(simpleDateFormat.format(new Date()));
        randMachine = new Random();
        randMachine.setSeed(currentTime);
    }

    //  **** Get Ten Rolls **********************************************
    //  generate and return an array with 10 random numbers between 1 and 20 inclusive
    //  @return: ArrayList of Integers
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        for (int i=0; i<10; i++) {
            intArray.add( randMachine.nextInt(20) + 1 );                    // Add random int from 1 to 20
        }
        return intArray;
    }

    //  **** Get Random Letter ******************************************
    //  @return: char
    public char getRandomLetter() {
        char[] alphabet = {'A', 'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        int randomInt = randMachine.nextInt(26);                            // Generates a random int from 0 to 25
        if (randomInt % 2 == 0) {
            // Character temp = alphabet[randomInt].toLowerCase(); 
            return (char) Character.toLowerCase(alphabet[randomInt]);
        }
        return alphabet[randomInt];
    }

    //  **** Generate password ******************************************
    //      Creates a random string of eight characters
    //  @return String password
    public String generatePassword() {
        String password = "";
        for (int i=0; i<8; i++) {
            password += this.getRandomLetter();
        }
        return password;
    }

    //  **** Get New Password Set ***************************************
    //  @param: int numPassword: determines how many passwords to make
    //  @return: ArrayList<String> password set
    public ArrayList<String> getNewPasswordSet(int numPassword) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i=0; i<numPassword; i++) {
            passwordSet.add(this.generatePassword());
        }
        return passwordSet;
    }
}