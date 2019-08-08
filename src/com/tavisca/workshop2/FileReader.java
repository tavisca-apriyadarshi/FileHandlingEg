package com.tavisca.workshop2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String readFromFile(String fileName) throws FileNotFoundException {
        FileInputStream reader = new FileInputStream(fileName);
        StringBuilder contents = new StringBuilder();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(reader);

        try (bufferedInputStream){
            /*byte[] buffer = new byte[reader.available()];
            //byte[] buffer = new byte[8];//How much to read...
            reader.read(buffer);
            contents = new String(buffer);*/
            byte[] buffer = new byte[8];
            while (bufferedInputStream.read(buffer)>0) {
                contents.append(new String(buffer));
                buffer = new byte[8];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents.toString();
    }
}
