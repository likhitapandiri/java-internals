package FileSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileSystem {
    public void fileReader(){
        try {
            //Reader - "Character-reading abstraction."
            //FileReader - "Character reader specifically for files.one of the impl of Reader
            Reader reader = new FileReader("FileSystem/input.txt"); //fileName gets checked in the current working directory not on the class package
            int data =reader.read(); //reads one character
            System.out.println(data);
            System.out.println((char) data);

            while((data = reader.read()) != -1){
                System.out.println((char) data);
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void bufferReader(){
        try {
            Reader reader = new FileReader("FileSystem/input.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
