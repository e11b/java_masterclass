package L113_OOP_MasterChallenge_donotuse;

import java.util.Scanner;

public class Meal {

    public Item burger;
    public Item drink;
    public Item sides;

    //instantiating a new meal


    public Meal() {
        orderFood();
    }


    private void showMenu() {
        //this method will print out the menu options on screen
        //order will be stored by the customer
        System.out.println("Menu: ");
        System.out.println("---------");
        System.out.println("1 : Double Double, Fries, Medium Drink");
        System.out.println("2 : Number Two - Cheeseburger, Fries, Medium Drink");
        System.out.println("3 : Make Your Own - a Burger, a Side, a Drink");
    };

        public String orderFood() {

            System.out.println("Welcome to In-N-Out!");
            showMenu();
            int order1 = 0;


            Scanner scanner = new Scanner(System.in);

//            System.out.println("What can I get started for you today?");
//            try {
//                order1 = scanner.nextInt();
//                System.out.println("Okay, so you want " + order1 + ".");
////            } catch (order1 > 0 || order1 <= 3){
//                System.out.println("try again!");
//            }
            return "Thanks for your order!";

        }


    //getters

    public Item getBurger() {
        return burger;
    }

    public Item getDrink() {
        return drink;
    }

    public Item getSides() {
        return sides;
    }
}
