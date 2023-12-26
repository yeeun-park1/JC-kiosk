import java.util.Scanner;
public class JCKiosk {
    public static void main(String[] args) {
        int menuChoice;
        int vendorChoice;
        int paymentChoice;

        System.out.printf("Hello! Welcome to JC Kiosk. How can we serve you today?\n");

        do {
            vendorChoice = vendors();

            switch (vendorChoice) {
                case 1: System.out.println("Burger House's selected\n");
                        menuChoice = burgerHouseMenu();
                        break;
                        
                case 2: System.out.println("Taco Place's selected\n");
                        menuChoice = tacoPlaceMenu();
                        break;
                
                case 3: System.out.println("Sandwich House's selected\n");
                        menuChoice = SandwichHouseMenu();
                        break;

                case 4: System.out.println("Thank you for using my program.");
                        break;
    
                default: System.out.println("Error. Pick an option that we have please!!!");
            }
        } while (vendorChoice != 4);

    }

    /**
     * Creating a list of vendors then prompt user to pick one.
     * @return user's vendor's choice.
     */
    public static int vendors() {
        Scanner input = new Scanner(System.in);
        String[] vendorNames = {"Burger House", "Taco Place", "Sandwitch House"};
        int option;
        
        do {
            System.out.println("Press 1 to select " + vendorNames[0]);
            System.out.println("Press 2 to select " + vendorNames[1]);
            System.out.println("Press 3 to select " + vendorNames[2]);
            System.out.println("Press 4 to end the program");
            option = input.nextInt();
            input.nextLine();

            if(option != 1 && option != 2 && option != 3 && option != 4) {
                System.out.println("Invalid vendor number. Please try agian.!!!\n");
            }
        } while(option != 1 && option != 2 && option != 3 && option != 4);

        return option;
    }

    /**
     * Creating an array of MenuItems then prompt user to pick one.
     * Prompt user for payment method.
     * @return user's item's choice.
     */
    public static int burgerHouseMenu() {
        Scanner input = new Scanner(System.in);

        MenuItem burgerOption1 = new MenuItem("Cheeseburger", 4.99);
        MenuItem burgerOption2 = new MenuItem("Bulgogi Burger", 8.99);
        MenuItem burgerOption3 = new MenuItem("Smoky Memphis-Style Burger", 9.99);
        MenuItem[] burgerMenu = {burgerOption1, burgerOption2, burgerOption3};

        String repString;
        int selectedItem = 0;

        do {
            selectedItem = getMenuSection(burgerMenu);

            if(selectedItem == 4) break;
            else {
                //Asking for payment method here. 
                //(Hint: Create a function to do so and call it to avoid repetition)

                System.out.println("Good choice. Your " + burgerMenu[selectedItem-1].getName() + " will be ready shortly.\n");
            }
        
            System.out.println("Would you like to continue to order from Burger House? (Yes/No)");
            repString = input.nextLine();

        } while(repString.toLowerCase().equals("yes"));

        return selectedItem;

    }

    /**
     * Creating an array of MenuItems then prompt user to pick one.
     * Prompt user for payment method.
     * @return user's item's choice.
     */
    public static int tacoPlaceMenu() {
        Scanner input = new Scanner(System.in);

        MenuItem tacoOption1 = new MenuItem("Birria Taco", 11.99);
        MenuItem tacoOption2 = new MenuItem("Carne Asada Taco", 8.99);
        MenuItem tacoOption3 = new MenuItem("Al Pastor", 7.99);
        MenuItem[] tacoMenu = {tacoOption1, tacoOption2, tacoOption3};

        String repString;
        int selectedItem = 0;

        do {
            selectedItem = getMenuSection(tacoMenu);

            if(selectedItem == 4) break;
            else {
                //Asking for payment method here. 
                //(Hint: Create a function to do so and call it to avoid repetition)

                System.out.println("Good choice. Your " + tacoMenu[selectedItem-1].getName() + " will be ready shortly.\n");
            }
        
            System.out.println("Would you like to continue to order from Taco Place? (Yes/No)");
            repString = input.nextLine();

        } while(repString.toLowerCase().equals("yes"));

        return selectedItem;

    }

    /**
     * Creating an array of MenuItems then prompt user to pick one.
     * Prompt user for payment method.
     * @return user's item's choice.
     */
    public static int SandwichHouseMenu() {
        Scanner input = new Scanner(System.in);

        MenuItem sandwichOption1 = new MenuItem("Cheese & Egg Sandwich", 9.99);
        MenuItem sandwichOption2 = new MenuItem("Tuna Sandwich", 7.99);
        MenuItem sandwichOption3 = new MenuItem("Ham, Egg & Cheese Sandwich", 11.99);
        MenuItem[] sandwichMenu = {sandwichOption1, sandwichOption2, sandwichOption3};

        String repString;
        int selectedItem = 0;

        do {
            selectedItem = getMenuSection(sandwichMenu);

            if(selectedItem == 4) break;
            else {
                //Asking for payment method here. 
                //(Hint: Create a function to do so and call it to avoid repetition)

                System.out.println("Good choice. Your " + sandwichMenu[selectedItem-1].getName() + " will be ready shortly.\n");
            }
        
            System.out.println("Would you like to continue to order from Sandwich House? (Yes/No)");
            repString = input.nextLine();

        } while(repString.toLowerCase().equals("yes"));

        return selectedItem;

    }

    /**
     * Creating an array of MenuItems then prompt user to pick one.
     * Prompt user for payment method.
     * @return user's item's choice.
     */
    public static int getMenuSection(MenuItem[] menuItems) {
        Scanner input = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("Press 1 to buy " + menuItems[0].getName() + ": " + menuItems[0].getPrice());
            System.out.println("Press 2 to buy " + menuItems[1].getName() + ": " + menuItems[0].getPrice());
            System.out.println("Press 3 to buy " + menuItems[2].getName() + ": " + menuItems[0].getPrice());
            System.out.println("Press 4 to go back to Restaurant Selection");
            option = input.nextInt();
            input.nextLine();

            if(option != 1 && option != 2 && option != 3 && option != 4) {
                System.out.println("Invalid menu choice. Please try again!!!");
            }
        } while(option != 1 && option != 2 && option != 3 && option != 4);

        return option;
    }
     public static int paymentChoice() {
        Scanner input = new Scanner(System.in);
        String[] paymentMethod = {"Credit/Debit Card", "GMU Meal Plan"};
        int payment;
        
        do {
            System.out.println("Press 1 to select " + paymentMethod [0]);
            System.out.println("Press 2 to select " + paymentMethod [1]);
            System.out.println("Press 3 to end the program");
            payment = input.nextInt();
            input.nextLine();

            if(payment != 1 && payment != 2 && payment != 3) {
                System.out.println("Invalid payment number. Please try agian.!!!\n");
            }
        } while(payment != 1 && payment != 2 && payment != 3);

        return payment;

     }

}
