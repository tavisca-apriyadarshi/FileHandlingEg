package com.tavisca.workshop2.dataStreams;

//import com.tavisca.workshop2.FileWriter;

import java.io.*;

public class ConsoleReader {
    public static void main(String[] args) {
        String str = readFromConsole();
        writeToConsole(str);
    }

    private static void writeToConsole(String data){
        //FileOutputStream writer = new FileOutputStream(fileName,true);
        //BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(writer);
        OutputStream writer = new BufferedOutputStream(System.out);

        try (writer){
            writer.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception Occured: "+e.getMessage());
            e.printStackTrace();
        }
    }

    private static String readFromConsole(){
        InputStream reader = new BufferedInputStream(System.in);
        byte[] data=new byte[8];

        try (reader){
            reader.read(data);
        } catch (IOException e) {
            System.out.println("Exception Occured: "+e.getMessage());
            e.printStackTrace();
        }
        return new String(data);
    }
}
