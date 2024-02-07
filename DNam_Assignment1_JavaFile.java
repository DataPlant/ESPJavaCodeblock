/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: Assignment1 of the CMSC203 Class on Tues/Thurs
 * Due: 02/06/2024
 * Platform/compiler: Microsoft Visual Studio
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: DK NAM
*/

//Imports
import java.util.Random;
import java.util.Scanner;

//Starting Codeblock
public class DNam_Assignment1_JavaFile {
    public static void main(String[] args) {
        //Starting Introductory Questions for User
        Scanner input = new Scanner (System.in);
        System.out.println("Hello, I am an ESP codeblock! What is your name?");
        String playerName = input.nextLine();
        System.out.println("\nNow, what is your M number for Montgomery College?");
        String playerMnumber = input.nextLine();
        System.out.println("\nPlease describe yourself in a sentence.");
        String playerDesc = input.nextLine();
        System.out.println("What is the due date for your assignment? Please use DD/MM/YY format.");
        String dueDate = input.nextLine();

        //Setting up counter variable
        int correctCount = 0;
        //Starting Loop
        for (int i = 0; i < 11; i++) {
            // Starting Color Coding
            System.out.println("\nRound " + (i+1));
            System.out.println("Please enter a color you want to guess from (Red, Green, Orange, Yellow, Grey)");
            String playerChoice = input.nextLine();
            //Create Random Object
            Random createRandObj = new Random();
            int houseColorNum = createRandObj.nextInt(5);

            String houseColor = new String("invalid");
            switch (houseColorNum) {
                case 0:
                    houseColor = "red";
                    break;
                case 1:
                    houseColor = "green";
                    break;
                case 2:
                    houseColor = "orange";
                    break;
                case 3:
                    houseColor = "yellow";
                    break;
                case 4:
                    houseColor = "grey";
                    break;
            }
            //I realized after completing the assignment that this if...elseif...else statement could be condensed into 3 or 4 lines,
            //instead of repeating every correct instance for each color.
            if (playerChoice.toLowerCase().equals(houseColor)) {
                System.out.println("Your guess was " + playerChoice);
                System.out.println("The house guessed the color " + houseColor);
                System.out.println("Correct Answer! Good job, have a virtual cookie");
                correctCount++;
            } else if (playerChoice.toLowerCase().equals(houseColor)) {
                System.out.println("Your guess was " + playerChoice);
                System.out.println("The house guessed the color " + houseColor);
                System.out.println("Correct Answer! Good job, have a virtual cookie");
                correctCount++;
            } else if (playerChoice.toLowerCase().equals(houseColor)) {
                System.out.println("Your guess was " + playerChoice);
                System.out.println("The house guessed the color " + houseColor);
                System.out.println("Correct Answer! Good job, have a virtual cookie");
                correctCount++;
            } else if (playerChoice.toLowerCase().equals(houseColor)) {
                System.out.println("Your guess was " + playerChoice);
                System.out.println("The house guessed the color " + houseColor);
                System.out.println("Correct Answer! Good job, have a virtual cookie");
                correctCount++;
            } else if (playerChoice.toLowerCase().equals(houseColor)) {
                System.out.println("Your guess was " + playerChoice);
                System.out.println("The house guessed the color " + houseColor);
                System.out.println("Correct Answer! Good job, have a virtual cookie");
                correctCount++;
            } else {
                System.out.println("Your guess was " + playerChoice);
                System.out.println("The house guessed the color " + houseColor);
                System.out.println("Wrong Answer! Bad job, why are you so bad at guessing?");
            }
        }
        //Final Score and Print
        System.out.println("Game Over!\n\nYou guessed " + correctCount + " correctly from the 11 colors guessed by me.");
        System.out.println("Student Name: " + playerName + "\nM#: " + playerMnumber);
        System.out.println("\nStudent Description: " + playerDesc + "\nDue Date: " + dueDate);
    }
}
