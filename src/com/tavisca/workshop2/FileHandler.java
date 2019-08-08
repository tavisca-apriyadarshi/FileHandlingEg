package com.tavisca.workshop2;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeFileContents();
        readFileContents();
    }
    private static void readFileContents(){
        FileReader fileReader = new FileReader();
        try {
            String contents = fileReader.readFromFile("DataFile.txt");
            System.out.println(contents);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void writeFileContents(){
        FileWriter fileWriter = new FileWriter();
        String data = "\nHello! This is Akshay..... \nand I'm Doing great";

        try {
            fileWriter.writeOnFile("DataFile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.printf("Use a valid Name");
            e.printStackTrace();
        }
        System.out.println();
    }
}
