
import java.util.Scanner;

public class Home {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        // We are going to set a variable to track whether or not the user wants to play.
        int play = 0;

        // We will go into a while loops and keep playing as long as the user keeps saying yes.
        while(play == 0){


            // First we will as the user if they want to play!
            System.out.println("Do you want to play (Y/N)");
            // Then we will get the user's output
            String answer = keyboard.next();
            System.out.println("Answer is " + answer);
            if (answer.equals("N")){
                System.out.println("I'm sorry to hear that. Have a good day.");
                play = 1;
            } else if (answer.equals("Y")){
                play();
            } else {
                System.out.println("Sorry, that's not an option");
            }

        }

        keyboard.close();

    }

    /*
        This method contains all the instructions to the game.
        Every time we loop, we can simply call this method to play the game.
     */
    public static void play(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Insecure: Issa Hive vs. Lawrence Hive");

        int teamIssa = 0;
        int teamLawrence = 0;
        String myAnswer;

        System.out.println("Team Issa Score: " + teamIssa);
        System.out.println("Team Lawrence Score: " + teamLawrence);

        System.out.println("Lets play!");

        System.out.println("Was Issa wrong for cheating on Lawrence? (Y/N)");
        myAnswer = keyboard.nextLine();

        if (myAnswer == "Y") {
            teamLawrence = teamLawrence + 1;

        } else {
            teamIssa = teamIssa + 1;
        }

        System.out.println("He broke up with his girlfriend after learning she cheated on him. " +
                "moved all of his stuff out and had sex with a cute woman who’d been sweating him for months. Was he wrong(Y/N)?");
        myAnswer = keyboard.nextLine();

        if (myAnswer == "Y") {
            teamLawrence = teamLawrence + 1;

        } else {
            teamIssa = teamIssa + 1;
        }

        System.out.println("Did Issa deserve to be called a hoe ?");
        myAnswer = keyboard.nextLine();

        if (myAnswer == "N") {
            teamIssa = teamIssa + 1;

        } else {
            teamIssa = teamIssa + 1;
            teamLawrence = teamLawrence + 1;
        }

        System.out.println("Did his joblessness make him depressed, and sap his initiative and his " +
                "willingness to put any effort into being a good boyfriend?(Y/N)");

        myAnswer = keyboard.next();

        if (myAnswer == "Y") {
            teamIssa = teamIssa + 1;

        } else {
            teamLawrence = teamLawrence + 1;
        }


        if (teamLawrence > teamIssa) {
            System.out.println("Team Lawrence wins! Issa was wrong af!!");
        }else if (teamIssa == teamLawrence){
            System.out.println("They both full of shit ");
        }

        else {
            System.out.println("Team Issa Wins! Lawrence is a fboy!");
        }


    }

}
