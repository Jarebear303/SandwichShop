public class Vegetables {
    //private variables to store the name and price of the meat
    private String vegeName;
    private double vegePrice;

    //default constructor that initializes "vegetables" with an empty name and a price of 0
    public Vegetables() {
        this.vegeName = "";
        this.vegePrice = 0;
    }

    //initializes the object with a specified name and price
    public Vegetables(String a, double b){
        this.vegeName = a;
        this.vegePrice = b;
    }

    //set method to update the name of the vegetables
    public void setVegeName(String a) {
        this.vegeName = a;
    }

    //set method to update the price of the vegetables
    public void setVegePrice(double b) {
        this.vegePrice = b;
    }

    //get method to retrieve the name of the vegetable
    public String getVegeName() {
        return(this.vegeName);
    }

    //get method to retrieve the price of the vegetable
    public double getPrice() {
        return(this.vegePrice);
    }

    // toString method to represent the vegetables object as a string
    public String toString() {
        return(this.vegeName + "$" + this.vegePrice);
    }

}

