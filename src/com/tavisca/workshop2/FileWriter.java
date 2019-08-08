package com.tavisca.workshop2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void writeOnFile(String fileName, String data) throws FileNotFoundException {
        FileOutputStream writer = new FileOutputStream(fileName,true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(writer);

        try (bufferedOutputStream){
            bufferedOutputStream.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception Occured: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
