package com.tavisca.workshop2.dataStreams;

import java.io.*;

public class PrimitiveDataHandler {
    public static void main(String[] a)
    {
        try {
            PrimitiveDataHandler.WriteToConsole("file.txt","hiiiiiiii");
            PrimitiveDataHandler.readFile("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String fileName) throws FileNotFoundException {
        StringBuilder contents= new StringBuilder();
        FileInputStream fileInputStream=new FileInputStream(fileName);
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);

        try(dataInputStream) {
            boolean b= dataInputStream.readBoolean();
            int i= dataInputStream.readInt();
            float f=dataInputStream.readFloat();
            //   String s=dataInputStream.readUTF();
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Boolean "+b);
            System.out.println("Int "+i);
            System.out.println("Float "+f);
            //    System.out.println("String "+s);
            System.out.println("+++++++++++++++++++++++++++++");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents.toString();
    }

    public static void WriteToConsole(String fileName,String data) throws FileNotFoundException {
        FileOutputStream writerStream= new FileOutputStream(fileName,true);
        DataOutputStream writer=new DataOutputStream(writerStream);
        try(writer){
            writer.writeBoolean(true);
            writer.writeInt(24);
            writer.writeFloat(24.56f);
            writer.write(data.getBytes());

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
