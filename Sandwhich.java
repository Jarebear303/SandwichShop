import java.util.ArrayList;
public class Sandwhich {
    private Bread breadChoice;
    private ArrayList<Vegetables> vegetableChoice;
    private Meat meatChoice;
    //private variables to store the bread, vegetables, and meat choices for the sandwich
    public Sandwhich() {
        this.breadChoice = null;
        this.vegetableChoice = new ArrayList<Vegetables>();
        this.meatChoice = null;
    //default constructor that initializes the object with null bread, an empty list of vegetables, and null meat
    }

    public void chooseBread(Bread b) {
        this.breadChoice = b;
    //method to set the choice of bread for the sandwich
    }

    public void chooseVegetable(Vegetables v) {
        this.vegetableChoice.add(v);
    //method to add a choice of vegetable to the sandwich
    }

    public void chooseMeat(Meat m) {
        this.meatChoice = m;
    //method to add a choice of meat to the sandwich
    }

    public String toString() {
        String ret = this.breadChoice.getName() + " ";
        int i;
        for (i = 0; i < this.vegetableChoice.size(); i++) ;
        if (i < this.vegetableChoice.size() - 1) {
            ret += ",";
        }

        ret += " " + this.meatChoice.getPrice();
        return (ret);
    //toString method to represent the Sandwich object as a formatted string
    }

    public double getTotal() {
        double ret = 0;
        ret += this.breadChoice.getPrice();
        for (int i = 0; i < this.vegetableChoice.size(); i++) {
            ret += this.vegetableChoice.get(i).getPrice();
        }
        ret += this.meatChoice.getPrice();
        return (ret);
    //method to calculate and return the total cost of the sandwich
    }
}

