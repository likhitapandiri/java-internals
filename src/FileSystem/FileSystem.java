package FileSystem;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileSystem {
    public void fileReader(){
        try {
            //Reader - "Character-reading abstraction."
            //FileReader - "Character reader specifically for files.one of the impl of Reader
            Reader f = new FileReader("FileSystem/input.txt"); //fileName gets checked in the current working directory not on the class package
            int data =f.read(); //reads one character
            System.out.println(data);
            System.out.println((char) data);

            while((data = f.read()) != -1){
                System.out.println((char) data);
            }
            f.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
