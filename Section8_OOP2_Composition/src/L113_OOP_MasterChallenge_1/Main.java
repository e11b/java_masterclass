package L113_OOP_MasterChallenge_1;

public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("DRINK", "Coke", 1.50);
//        coke.printItem();
//        coke.setSize("Large");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 5.0);

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up",
//                "chili");
//        secondMeal.addBurgerToppings("lettuce", "cheese", "mayo");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("small");
        deluxeMeal.printItemizedList();



    }
}
