package pizza;

import java.util.Scanner;
import pizza.crust.*;
import pizza.sauce.*;
import pizza.topping.*;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose Crust
        System.out.println("Crust Choices");
        System.out.println("1. Thin, 2. Thick");
        System.out.println("Choose a crust: ");
        int crustChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        PizzaCrust crust = switch (crustChoice) {
            case 1 -> new ThinCrust();
            case 2 -> new ThickCrust();
            default -> {
                System.out.println("Invalid crust choice, defaulting to our house favorite thick crust.");
                yield new ThinCrust();
            }
        };


        if (crust.toString().equals("Thick Crust")) {
            System.out.println("Would you like it to be deep dish?");
            System.out.println("1. Yes, 2. No");
            System.out.println("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1 -> crust.setIsDeepDish(true);
                case 2 -> crust.setIsDeepDish(false);
                default -> {
                    System.out.println("Invalid  choice, defaulting to our house favorite thick crust.");
                    crust.setIsDeepDish(false);
                }
            }

        }



        // Choose Ingredient
        System.out.println("Crust Ingredient Choices");
        System.out.println("1. Flour, 2. Cauliflower");
        System.out.println("Choose a crust: ");
        int ingredChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (ingredChoice) {
            case 1 -> crust.setIngredient("flour");
            case 2 -> crust.setIngredient("cauliflower");
            default -> {
                System.out.println("Invalid crust choice, defaulting to our house favorite flour crust.");
                crust.setIngredient("flour");
            }
        };

        // Choose Sauce
        System.out.println("Sauce Choices");
        System.out.println("1. Tomato, 2. Alfredo");
        System.out.println("Choose a sauce: ");
        int sauceChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        PizzaSauce sauce = switch (sauceChoice) {
            case 1 -> new TomatoSauce();
            case 2 -> new AlfredoSauce();
            default -> {
                System.out.println("Invalid sauce choice, defaulting to our house favorite tomato sauce.");
                yield new TomatoSauce();
            }
        };

        // Create Pizza
        Pizza pizza = new Pizza();
        pizza.setCrust(crust);
        pizza.setSauce(sauce);


        // Add Toppings
        while (pizza.getTopping().size() < 4) {
            System.out.println("Topping Choices");
            System.out.println("1. Beef  2. Pepperoni  3. Sausage  4. Chicken");
            System.out.println("5. Onion  6. Mushroom  7. Pepper  8. Olive");
            System.out.println("9. Mozzarella  10. Asiago  11. Parmesan  12. Provolone");
            System.out.println("0. Finish");
            int toppingChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            PizzaTopping topping = switch (toppingChoice) {
                case 1 -> new BeefTopping();
                case 2 -> new PepperoniTopping();
                case 3 -> new SausageTopping();
                case 4 -> new ChickenTopping();
                case 5 -> new OnionTopping();
                case 6 -> new MushroomTopping();
                case 7 -> new PepperTopping();
                case 8 -> new OliveTopping();
                case 9 -> new MozzarellaTopping();
                case 10 -> new AsiagoTopping();
                case 11 -> new ParmesanTopping();
                case 12 -> new ProvoloneTopping();
                default -> null;
            };

            if (topping == null) {
                System.out.println("Pizza complete!");
                break;
            }
            pizza.addTopping(topping);
        }

        // Print Final Pizza
        System.out.println("\nFinal Order:");
        pizza.display();
        System.out.println(crust.checkIntegrity());
        
        scanner.close();


    }
}