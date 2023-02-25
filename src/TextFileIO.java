import java.util.ArrayList;
import java.io.*;

public class TextFileIO {
    public static void writeFile(String fileName, ArrayList<String> data){
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < data.size(); i++) {
                pw.println(data.get(i));
            }
            pw.close();
        }
        catch(IOException exp) {
            System.out.println("Error - Cannot write to file" + fileName);
        }
    }

    // Reading from a file
    public static void readFile(String fileName, ArrayList<String> data){
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                data.add(line);
            }
            br.close();
        }
        catch (IOException exp){
            System.out.println("Error - Cannot read from file " + fileName);
        }
    }

    public static void main(String[] args) {
        // Create some data
        ArrayList<String> items = new ArrayList<>();

//        items.add("Bread");
//        items.add("Pasta");
//        items.add("Butter");
//        items.add("Milk");
//        items.add("Eggs");

        // Read data
        readFile("shopping.txt", items);

        // Output to screen
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        // Output to file
//        writeFile("shopping.txt", items);



    }
}
