import java.io.IOException;
import java.util.Scanner;
public class SandwhichApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //initialize different types of bread
        Bread b1 = new Bread("White Bread", 1.5);
        Bread b2 = new Bread("Wheat Bread", 1.6);
        Bread b3 = new Bread("French Bread", 1.8);
        Bread b4 = new Bread("Organic Bread", 2.0);

        //initializes different types of vegetables
        Vegetables v1 = new Vegetables("red onions", .05);
        Vegetables v2 = new Vegetables("olives", .1);
        Vegetables v3 = new Vegetables("pickles", .1);
        Vegetables v4 = new Vegetables("lettuce", .2);
        Vegetables v5 = new Vegetables("green peppers", .25);
        Vegetables v6 = new Vegetables("tomatoes", .3);
        Vegetables v7 = new Vegetables("cheese", .5);

        //initializes different types of meat
        Meat m1 = new Meat("Ham", 1.0);
        Meat m2 = new Meat("Roasted Chicken", 1.1);
        Meat m3 = new Meat("Turkey Breast", 1.2);
        Meat m4 = new Meat("Roast Beef", 1.5);


        char ch = 'y';
        int a, b, c;
        Sandwhich s = null;
        Orders o = null;

        //begin the main ordering loop
        while (ch == 'y' || ch == 'Y') {
            s = new Sandwhich();
            o = new Orders();

            //assign selected bread to the sandwich
            System.out.println("=== Select Sandwhich Bread: ===");
            System.out.println("1 " + b1);
            System.out.println("2 " + b2);
            System.out.println("3 " + b3);
            System.out.println("4 " + b4);

            //prompts user to select bread
            do {
                System.out.print("Select your choice of bread [1-4]: ");
                a = scnr.nextInt();
                if (a < 0 || a > 4) {
                    if (a < 0) {
                        System.out.println("Number must be between 1-4");
                    } else {
                        System.out.println("Number must be between 1-4");
                    }

                    //assign selected bread to the sandwich
                }
            }
            while (a < 0 || a > 4);
            if (a == 1) {
                s.chooseBread(b1);
            }
            if (a == 2) {
                s.chooseBread(b2);
            }
            if (a == 3) {
                s.chooseBread(b3);
            }
            if (a == 4) {
                s.chooseBread(b4);
            }

            //assign selected vegetables to the sandwich
            while (true) {
                System.out.println("=== Select Sandwich Vegetables: ===");
                System.out.println("1 " + v1);
                System.out.println("2 " + v2);
                System.out.println("3 " + v3);
                System.out.println("4 " + v4);
                System.out.println("5 " + v5);
                System.out.println("6 " + v6);
                System.out.println("7 " + v7);
                System.out.println("8 Quit vegetable selection");
                System.out.print("Select vegetables[1, 8]: ");
                b = scnr.nextInt();


                //assign selected vegetables to the sandwich
                if (b < 0 || b > 8) {
                    if (b < 0) {
                        System.out.println("Number must be between 1-9");
                    } else {
                        System.out.println("Number must be between 1-9");
                    }
                } else {
                    if (b == 1) {
                        s.chooseVegetable(v1);
                    }
                    if (b == 2) {
                        s.chooseVegetable(v2);
                    }
                    if (b == 3) {
                        s.chooseVegetable(v3);
                    }
                    if (b == 4) {
                        s.chooseVegetable(v4);
                    }
                    if (b == 5) {
                        s.chooseVegetable(v5);
                    }
                    if (b == 6) {
                        s.chooseVegetable(v6);
                    }
                    if (b == 7) {
                        s.chooseVegetable(v7);
                    }
                    if (b == 8) {
                        break;

                    }
                }
            }
            //assign selected vegetables to the sandwich
            boolean isValidSelection = false;
            while (!isValidSelection) {
                System.out.println("=== Select Sandwhich Meat: ===");
                System.out.println("1 " + m1);
                System.out.println("2 " + m2);
                System.out.println("3 " + m3);
                System.out.println("4 " + m4);
                System.out.println("5 Quit meat selection");
                System.out.print("Select meat[1, 5]: ");
                c = scnr.nextInt();
                //prompts user to select meat
                if (c >= 1 || c <= 4) {
                    isValidSelection = true;
                    if (c == 1) {
                        s.chooseMeat(m1);
                    } else if (c == 2) {
                        s.chooseMeat(m2);
                    } else if (c == 3) {
                        s.chooseMeat(m3);
                    } else if (c == 4) {
                        s.chooseMeat(m4);
                    }
                } else if (c == 5) {
                    isValidSelection = true;
                } else {
                    System.out.println("Number must be between 1-5");
                }
            }

            //prompts user to enter name
            System.out.print("Enter Customer's Name: ");
            scnr.nextLine();
            String name = scnr.nextLine();
            o.setCustomer(name);
            o.setSandwhich(s);
            //display order information
            System.out.println("/n" + o);
            //write order to file
            try {
                SandwhichIO.writeOrderToFile(o);
            } catch (IOException ex) {
                System.out.println("File Error");
            }
            //prompts user to select yes or no for ordering more sandwhiches
            System.out.print("\nContinue to order more sandwhiches? (yes/no): ");
            String yn = scnr.next();
            ch = yn.charAt(0);
        }
        System.out.println("Thank you for ordering!");
        scnr.close();
    }
}







