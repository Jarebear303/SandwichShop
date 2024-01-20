public class Meat {
    //private variables to store the name and price of the meat
    private String meatName;
    private double meatPrice;
    //default constructor that initializes "meat" with an empty name and a price of 0
    public Meat(){
        this.meatName="";
        this.meatPrice = 0;
    }
    //initializes the object with a specified name and price
    public Meat(String a, double b) {
        this.meatName = a;
        this.meatPrice = b;
    }
    //set method to update the name of the meat
    public void setmeatName(String a) {
        this.meatName = a;
    }
    //set method to update the price of the meat
    public void setmeatPrice(double b) {
        this.meatPrice = b;
    }
    //get method to retrieve the name of the meat
    public String getmeatName(){
        return(this.meatName);
    }
    //get method to retrieve the price of the meat
    public double getPrice() {
        return(this.meatPrice);

    }
    // toString method to represent the meat object as a string
    public String toString() {
        return(this.meatName +"$"+ this.meatPrice);
    }

}
