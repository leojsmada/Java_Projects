package com.joel.company;
import java.awt.*;
import java.util.Scanner;

import static java.lang.String.valueOf;

class Hamburger
{
    private String bread;
    private String meat;
    private String condiment;
    private int cost;

    public Hamburger()
    {
        calculateCost();
    }

    public void getBread()
    {
        //CHOOSE THE BREAD
        String breadChoice1 = ("Italian Bread");
        String breadChoice2 = ("American Bread");
        String breadChoice3 = ("Cheese Bread");

        ("Italian Bread").valueOf(2.50);
        ("American Bread").valueOf( 2.25);
        ("Cheese Bread").valueOf(3.25);

        Scanner choose = new Scanner( System.in );  // Create a Scanner object
        String breadChoice;


        do {
            System.out.printf( "Please choose 1 for Italian Bread, 2 for American Bread, 3 for Cheese Bread %n" );

            breadChoice = choose.nextLine();

            switch (breadChoice) {
                case "1":
                    System.out.println( "You chose: " + breadChoice1 );  // Output user input
                    break;
                case "2":
                    System.out.println( "You chose: " + breadChoice2 );  // Output user input
                    break;
                case "3":
                    System.out.println( "You chose: " + breadChoice3 );  // Output user input
                    break;
                default:
                    System.out.print( "Please make a valid BREAD selection..." );
            }
                      bread = breadChoice(valueOf( breadChoice ));//---------STUCK HERE
        } while (breadChoice1.equals( "1" ) || breadChoice2.equals( "2" ) || breadChoice3.equals( "3" ));
    }


    //CHOOSE THE MEAT
    public void getMeat() {
        String meatChoice1 = ("Ham");
        String meatChoice2 = ("Hard Salami");
        String meatChoice3 = ("Turkey");

        Scanner choose = new Scanner( System.in );  // Create a Scanner object
        String meatChoice;
        do {
            System.out.printf( "Please choose 1 for Ham, 2 for Hard Salami, 3 for Turkey %n" );
            meatChoice = choose.nextLine();
            switch (meatChoice) {
                case "1":
                    System.out.println( "You chose: " + meatChoice1 );  // Output user input
                    break;
                case "2":
                    System.out.println( "You chose: " + meatChoice2 );  // Output user input
                    break;
                case "3":
                    System.out.println( "You chose: " + meatChoice3 );  // Output user input
                    break;
                default:
                    System.out.print( "Please make a valid MEAT selection..." );
            }
                  meatChoice=meat;
        } while (meatChoice1.equals( "1" ) || meatChoice2.equals( "2" ) || meatChoice3.equals( "3" ));

    }

    //CHOOSE THE CONDIMENTS
    public void chooseCondiments() {
        String condimentChoice1 = ("Mayo");
        String condimentChoice2 = ("Mustard");
        String condimentChoice3 = ("Oregano");
        Scanner choose = new Scanner( System.in );  // Create a Scanner object
        String condimentChoice;

        do {
            System.out.printf( "Please choose 1 for Mayo, 2 for Mustard, 3 for Oregano %n" );

            condimentChoice = choose.nextLine();

            switch (condimentChoice) {
                case "1":
                    System.out.println( "You chose: " + condimentChoice1 );  // Output user input
                    break;
                case "2":
                    System.out.println( "You chose: " + condimentChoice2 );  // Output user input
                    break;
                case "3":
                    System.out.println( "You chose: " + condimentChoice3 );  // Output user input
                    break;
                default:
                    System.out.print( "Please make a valid CONDIMENT selection..." );

            }
               condimentChoice=condiment;
        } while (condimentChoice1.equals( "1" ) || condimentChoice2.equals( "2" ) || condimentChoice3.equals( "3" ));

    }

    public Hamburger(String bread, String meat,String condiment, int cost)
    {
        this.bread = bread;
        this.meat = meat;
        this.condiment = condiment;
        this.cost = cost;
    }

    public int calculateCost()
    {
//        ("Italian Bread").valueOf(2.50);  // MOVED THIS TO THE METHOD
//        ("American Bread").valueOf( 2.25);//MOVED THIS TO THE METHOD
//        ("Cheese Bread").valueOf(3.25);//MOVED THIS TO THE METHOD
        ("Ham").valueOf(2.00);
        ("Hard Salami").valueOf(3.00);
        ("Turkey").valueOf(1.75);
        ("Mayo").valueOf(.75);
        ("Mustard").valueOf(.35);
        ("Oregano").valueOf(.65);

//        cost =this.bread.valueOf(getBread();
//
//        return((bread.valueOf()  + meat + condiment));
        return 0;
    }

    }




public class Main
{
    public static void main(String[] args)

    {
      Hamburger myHamburger = new Hamburger();
      myHamburger.getBread();
      myHamburger.getMeat();
      myHamburger.chooseCondiments();
    }
}
