package com.joel.company;

import java.util.Scanner;


public class Hamburger {

    String breadChoice1 = ("Italian Bread");
    String breadChoice2 = ("American Bread");
    String breadChoice3 = ("Cheese Bread");

    String meatChoice1 = ("Ham");
    String meatChoice2 = ("Hard Salami");
    String meatChoice3 = ("Turkey");

    String condimentChoice1 = ("Mayo");
    String condimentChoice2 = ("Mustard");
    String condimentChoice3 = ("Oregano");

      //CHOOSE THE BREAD
    public void chooseBread() {
        Scanner choose = new Scanner(System.in);  // Create a Scanner object
        String breadChoice;
        do {
            System.out.printf("Please choose 1 for Italian Bread, 2 for American Bread, 3 for Cheese Bread %n");

            breadChoice = choose.nextLine();

            switch (breadChoice) {
                case "1":
                    System.out.println("You chose: " + breadChoice1);  // Output user input
                    break;
                case "2":
                    System.out.println("You chose: " + breadChoice2);  // Output user input
                    break;
                case "3":
                    System.out.println("You chose: " + breadChoice3);  // Output user input
                    break;
                default:
                    System.out.print("Please make a valid BREAD selection...");

            }

        } while (!breadChoice1.equals("1") || !breadChoice2.equals("2") || !breadChoice3.equals("3"));

    }
    //CHOOSE THE MEAT
    public void chooseMeat() {
        Scanner choose = new Scanner(System.in);  // Create a Scanner object
        String meatChoice;
        do {
            System.out.printf("Please choose 1 for Ham, 2 for Hard Salami, 3 for Turkey %n");

            meatChoice = choose.nextLine();

            switch (meatChoice) {
                case "1":
                    System.out.println("You chose: " + meatChoice1);  // Output user input
                    break;
                case "2":
                    System.out.println("You chose: " + meatChoice2);  // Output user input
                    break;
                case "3":
                    System.out.println("You chose: " + meatChoice3);  // Output user input
                    break;
                default:
                    System.out.print("Please make a valid MEAT selection...");

            }

        } while (!meatChoice1.equals("1") || !meatChoice2.equals("2") || !meatChoice3.equals("3"));

    }

    //CHOOSE THE CONDIMENTS
    public void chooseCondiments() {
        Scanner choose = new Scanner(System.in);  // Create a Scanner object
        String condimentChoice;
        do {
            System.out.printf("Please choose 1 for Mayo, 2 for Mustard, 3 for Oregano %n");

            condimentChoice = choose.nextLine();

            switch (condimentChoice) {
                case "1":
                    System.out.println("You chose: " + condimentChoice1);  // Output user input
                    break;
                case "2":
                    System.out.println("You chose: " + condimentChoice2);  // Output user input
                    break;
                case "3":
                    System.out.println("You chose: " + condimentChoice3);  // Output user input
                    break;
                default:
                    System.out.print("Please make a valid CONDIMENT selection...");

            }

        } while (!condimentChoice1.equals("1") || !condimentChoice2.equals("2") || !condimentChoice3.equals("3"));

    }
}