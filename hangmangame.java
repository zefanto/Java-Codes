import java.util.Random;
import java.util.Scanner;
public class hangmangame {
    public static void main(String[] args) {

        int score = 100;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int pick = rand.nextInt(3);
        String theword = "";
        if (pick == 0) {
            theword = "harmony";
        } else if (pick == 1) {
            theword = "network";
        } else {
            theword = "monitor";
        }
        int maxattempts = 14;
        int attempts = 0;
        boolean won = false;
        String wrongGuesses = "";
        String l1 = "_";
        String l2 = "_";
        String l3 = "_";
        String l4 = "_";
        String l5 = "_";
        String l6 = "_";
        String l7 = "_";
        System.out.println("Welcome to the hangman game");
        System.out.printf("you have %d letters in this word, you have %d tries.\n", theword.length(), maxattempts);
        while (attempts < maxattempts && !won) {
            System.out.printf("Word: %s %s %s %s %s %s %s\n", l1, l2, l3, l4, l5, l6, l7);
            System.out.print("enter your guess: ");
            String userInput = input.nextLine().toLowerCase();
            char guess = userInput.charAt(0);
            boolean found = false;
            if (theword.charAt(0) == guess) {
                    l1 = userInput;
                    found = true;
            }
            if (theword.charAt(1) == guess) {
                l2 = userInput;
                found = true;
            }
            if (theword.charAt(2) == guess) {
                    l3 = userInput;
                    found = true;
            }
            if (theword.charAt(3) == guess) {
                    l4 = userInput;
                    found = true;
            }
            if (theword.charAt(4) == guess) {
                    l5 = userInput;
                    found = true;
            }
            if (theword.charAt(5) == guess) {
                    l6 = userInput;
                    found = true;
            }
            if (theword.charAt(6) == guess) {
                    l7 = userInput;
                    found = true;
            }

            if (found) {
                System.out.println("correct guess");
            } else {
                System.out.println("wrong guess");
                attempts++;
                wrongGuesses = wrongGuesses + userInput + " ";
            }


            String display = l1 + l2 + l3 + l4 + l5 + l6 + l7;
            if (display.equals(theword)) {
                    won = true;
            }

            System.out.printf("wrong guesses: %s\n", wrongGuesses);
            System.out.printf("tries left: %d\n\n", maxattempts - attempts);
            }
                  score = Math.max(0, score - attempts * 10);
        if (won) {
                System.out.println("congrats, you guessed the word: " + theword);
        } else {
                System.out.println("you ran out of tries. The word was " + theword);
        }
        System.out.printf("final score is %d\n", score);

                input.close();

        }
    }