import java.io.*;
import java.util.ArrayList;
public class SandwhichIO {

    //method to write an order to a file
    public static void writeOrderToFile(Orders o) throws IOException {

        //create a file object representing the orderline.txt file
        File file = new File("../orderline.txt");
        //if the file doesn't exist, create a new file
        if (file.exists() == false) {
            file.createNewFile();
        }

        //create an ArrayList to store the existing content of the file
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader objReader = null;
        String strCurrentLine;

        //read the existing content of the file and store it in the ArrayList
        try {
            objReader = new BufferedReader(new FileReader(file));
            while ((strCurrentLine = objReader.readLine()) != null) {
                list.add(strCurrentLine);
            }
            objReader.close();
        } catch (FileNotFoundException ex) {
            System.out.print("File not found");
        } catch (IOException ex) {
            System.out.print("File read error");
        }

        //add the new order to the ArrayList
        list.add(o.toString());

        //write the updated content back to the file
        PrintWriter printWriter = new PrintWriter(new FileWriter(file));
        for (int i = 0; i < list.size(); i++) {
            printWriter.print(list.get(i));

            //add a new line after each entry except for the last one
            if (i <= list.size() - 1) {
                printWriter.println();
            }
        }
        printWriter.close();
    }
}


