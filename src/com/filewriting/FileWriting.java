package com.filewriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class FileWriting {
    public static void main(String[] args) {
        ArrayList<String> Letters = new ArrayList<String>();
//        Cars.add("Tesla");
//        Cars.add("Audi");
//        Cars.add("Benz");

        // ***** File Reading *****

//        StringBuilder strConcat = new StringBuilder();
//        Cars.forEach((temp) -> strConcat.append(temp + " " + "\n"));
//        System.out.println(strConcat);
//        StringBuilder data = new StringBuilder();
        String data = "";

        try {
            File myObj = new File("Files/HelloFile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                Letters.add(data);
                System.out.println(Letters);
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("An Error Occurred...");
            e.printStackTrace();
        }

        // *****



         //***** File Writing *****



        try {

            StringBuilder strMakeLine = new StringBuilder();
            Letters.add("iii");
            Letters.add("jjj");
            Letters.add("kkk");

           // Cars.forEach((temp) -> strConcat.append(temp + " " + "\n"));
            Letters.forEach((temp) -> strMakeLine.append(temp + "\n"));

            FileWriter myWriter = new FileWriter("Files/HelloFile.txt");
            myWriter.write(String.valueOf(strMakeLine));
            myWriter.close();
            System.out.println("File successfully written...");
            System.out.println(strMakeLine);
        }
        catch (IOException e) {
            System.out.println("An error Occurred.");
            e.printStackTrace();
        }
    }
}
