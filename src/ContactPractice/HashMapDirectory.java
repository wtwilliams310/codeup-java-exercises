package ContactPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapDirectory {

//    private String name = "";
//    private String number = "";
//    // <key, value>
//    private HashMap<String, String> directory = new HashMap<String, String>();
//
//    public Directory(String fileName) throws FileNotFoundException {
//        // reading file
//        Scanner read = new Scanner(new File(fileName));
//        // write file names and numbers into maps (names = number)
//        while (read.hasNextLine()) {
//            // stores each line in variable
//            String test = read.nextLine();
//            // separates name and number into two tokens using ":" as the delimiter and stores into st variable
//            StringTokenizer st = new StringTokenizer(test, "|");
//            // .put method stores name and number(tokens) as key value pairs; trim() gets rid of any trailing/leading
//            // white spaces.
//            directory.put(st.nextToken().trim(), st.nextToken().trim());
//        }
//    }
//
//    /**
//     * method adds new contact
//     * @param addName name to be added
//     * @param addNumber number to be added
//     */
//    public void addContacts(String addName, String addNumber){
//        // pass parameter and store into private variables
//        this.name = addName;
//        this.number = addNumber;
//        directory.put(name, number);
//        System.out.println("Adding " + name + " " + number);
//    }
//
//    /**
//     * method changes contact phone number
//     * @param name name of contact's number to be changed
//     * @param number updated number
//     */
//    public void changeContactNumber(String name, String number) {
//        this.name = name;
//        this.number = number;
//        directory.replace(name, directory.get(name), number);
//    }
//
//    /**
//     * method delete contact
//     * @param deleteName name of contact to delete
//     */
//    public void deleteContact(String deleteName) {
//        this.name = deleteName;
//        directory.remove(name);
//        System.out.println(name + "Removed");
//    }
//
//    /**
//     * method deletes file
//     * @param fileName
//     */
//    public void deleteFile(String fileName){
//        File file = new File(fileName);
//        if(file.delete()){
//            System.out.println("Deleted the file: " + file.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//        }
//    }
//
////    public static void deleteFromFile()
//
//    /**
//     * method to check if contact is in directory
//     * @param name contact we want to get
//     * @return if in hashmap
//     */
//    public String getPhoneNumber(String name) {
//        this.name = name;
//        if(directory.containsKey(name)) {
//            return " " + directory.get(name);
//        } else {
//            return "";
//        }
//    }
}
