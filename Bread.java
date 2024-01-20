public class Bread {
    //private variables to store the name and price of the bread
    private String breadName;
    private double breadPrice;

    //default constructor that initializes "bread" with an empty name and a price of 0
    public Bread() {
        this.breadName = "";
        this.breadPrice=0;

    }

    //initializes the object with a specified name and price
    public Bread(String a, double b){
        this.breadName = a;
        this.breadPrice = b;

    }

    //set method to update the name of the bread
    public void setmeatName(String a) {
        this.breadName = a;
    }

    //set method to update the price of the bread
    public void setPrice(double b){
        this.breadPrice = b;

    }

    //get method to retrieve the name of the bread
    public String getName(){
        return(this.breadName);

    }

    //get method to retrieve the prive of the bread
    public double getPrice(){
        return(this.breadPrice);


    }

    // toString method to represent the Bread object as a string
    public String toString() {
        return (this.breadName + "$" + this.breadPrice);

    }
    }

