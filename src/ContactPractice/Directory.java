package ContactPractice;

import java.io.*;
import java.util.*;

public class Directory {


    private String name = "";
    private String number = "";
    private HashMap<String, String> directory = new HashMap<String, String>();

    public Directory(String names) throws FileNotFoundException {
        // reading file
            Scanner read = new Scanner(new File("names.txt"));
    }


    public static void createFiles(File data){
        boolean result;

        try
        {
            result = data.createNewFile();
            if(result) {
                System.out.println("file created: " + data.getCanonicalPath());
            } else {
                System.out.println("file already exists at location: " + data.getCanonicalPath());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }



    public static void writeFile(String fileName, ArrayList<String> data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < data.size(); i++){
                pw.println(data.get(i));
            }
            pw.close();
        }
        catch (IOException ex){
            System.out.println("Error - cannot write to file: " + fileName);
        }
    }

    public static void main(String[] args) {
        // writing contact information
        ArrayList<String> contacts = new ArrayList<>();

        contacts.add("John Adams: 916-334-7767");
        contacts.add("Abigail Smith: 886-345-7625");
        contacts.add("Rita Hayworth: 887-898-8833");
        contacts.add("Jerry Seinfeld: 298-646-1515");
        contacts.add("Larry David: 310-567-5555");
        contacts.add("George Costanza: 818-545-0978");

        // New file path
//        File data = new File("/Users/tituswilliams/IdeaProjects/codeup-java-exercises/contacts.txt");
//
//        createFiles(data);

        // Write to contacts.txt file
        writeFile("contacts.txt", contacts);
    }




}
