package com.filereading;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.FieldPosition;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        try {
            File objFile = new File("Files/HelloFile.txt");
            Scanner myReader = new Scanner(objFile);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An Error Occurred...");
            e.printStackTrace();
        }
    }
}
