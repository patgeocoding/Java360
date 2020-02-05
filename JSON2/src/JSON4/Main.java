package JSON4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import json.quickconnectfamily.json.JSONException;
import json.quickconnectfamily.json.JSONInputStream;
import json.quickconnectfamily.json.JSONOutputStream;
import json.quickconnectfamily.json.JSONUtilities;


public class Main {

    public static void main(String[] args) {

        System.out.println("This creates an object string:");
        Book hobbit = new Book("The Hobbit", "Tolkien", 15, 001);

        try {
            String jsonString = JSONUtilities.stringify(hobbit);
            System.out.println(jsonString);
        } catch (JSONException e) {
            System.out.println("Error Creating File");
        }

        System.out.println("\nThis writes the object string out to a file:");
        Book lotr = new Book("The Fellowship Of The Ring", "Tolkien", 16, 002);

        File guestFile = new File("bookFile.json");

        System.out.println(lotr.getTitle() + " has been written to a file.");

        try {
            FileOutputStream fileStream = new FileOutputStream(guestFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
            jsonOut.writeObject(lotr);
            jsonOut.close();
        } catch (Exception e) {
            System.out.println("Error Writing File Out");
        }

        // Read Object from file
        System.out.println("\nThis reads the object string in from a file:");

        try {
            FileInputStream guestIn = new FileInputStream(guestFile);
            JSONInputStream jsonIn = new JSONInputStream(guestIn);
            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();

            Book getInfo = new Book();
            long age = (long) jsonMap.get("price");
            long guestId = (long) jsonMap.get("bookId");
            getInfo.setPrice((int) age);
            getInfo.setBookId((int) guestId);
            getInfo.setTitle((String) jsonMap.get("title"));
            getInfo.setAuthor((String) jsonMap.get("author"));

            String outputString = JSONUtilities.stringify(getInfo);
            System.out.println(outputString);
        } catch (Exception e) {
            System.out.println("Error Reading File Input");

        }

        // Error formats - image files
        try {
            FileInputStream fileOut = new FileInputStream("img.jpg");
            JSONInputStream jsonIn = new JSONInputStream(fileOut);
            jsonIn.close();

        } catch (Exception e) {
            System.out.println("\nCannot Read File: IMG");

        }
        // Null Obects
        try {
            FileInputStream fileInput = new FileInputStream("test1.txt");
            JSONInputStream jsonIn = new JSONInputStream(fileInput);

            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();
        } catch (Exception e) {
            System.out.println("\nCannot Read an Empty File");

        }
    }
}
