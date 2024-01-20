import java.text.DateFormat;
import java.util.Date;
public class Orders {
    private Sandwhich sandwhich;
    private String customer;
    public Orders(){
        this.sandwhich = null;
        this.customer = "";
    }
    public void setSandwhich(Sandwhich s){
        this.sandwhich = s;
    }
    public void setCustomer(String c) {
        this.customer = c;
    }

    // toString method to represent the Order object as a formatted string
    public String toString(){

        //get the current date and time
        Date now = new Date();
        DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM); String time = defaultDate.format(now);
        time = defaultDate.format(now);

        //build the order string with date, customer name, sandwich details, and the total cost
        String ret = time + " ";
        ret += this.customer + " ";
        ret+= this.sandwhich;
        //calculate and append the total cost of the sandwich to the order string
        double sTotal = 0;
        sTotal = this.sandwhich.getTotal();
        ret+= " $" + sTotal;
        // Return the formatted order string
        return(ret);
    }
}
