package FileSystem;

import java.io.*;

public class FileSystem {
    public void fileReader() {
        try {
            //Reader - "Character-reading abstraction."
            //FileReader - "Character reader specifically for files.one of the impl of Reader
            Reader reader = new FileReader("FileSystem/input.txt"); //fileName gets checked in the current working directory not on the class package
            int data = reader.read(); //reads one character
            System.out.println(data);
            System.out.println((char) data);

            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void bufferReader() {
        try (Reader reader = new FileReader("FileSystem/input.txt");
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //try block finishes, Java automatically closes file with try with resources

    }

    public void fileWriter() {
        try {

            Writer writer = new FileWriter("FileSystem/output.txt"); //fileName gets checked in the current working directory not on the class package
            writer.write(65); //which is 'A'
            writer.write("Java");


            for (int i = 1; i <= 1_000_000; i++) {
                writer.write("This is line number " + i);
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        write("Hello")
//          ↓
//        File I/O
//
//        write("\n")
//          ↓
//        File I/O
    }

    public void bufferWriter() {
        try (Writer writer = new FileWriter("FileSystem/output.txt");
             BufferedWriter br = new BufferedWriter(writer)) {
            for (int i = 1; i < 1000; i++) {
                br.write("This is line number " + i);
                br.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        bw.write("Hello")
//        ↓
//        BUFFER (memory)
//        bw.write("\n")
//        ↓
//        BUFFER (memory)
//       ...
//       ↓
//        buffer gets sufficiently full
//       ↓
//        ONE larger write
//       ↓
//        FileWriter
//       ↓
//        File

        //2 Java write method calls
        //but not 2 file I/O operations.
        //That's the entire point of buffering.

    }

    public void outputStreamer(){
        try {
            OutputStream outputStream = new FileOutputStream("FileSystem/output.txt");
            outputStream.write(65);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void inputStreamer(){
        try {
            InputStream inputStream = new FileInputStream("FileSystem/input.txt");
            int data;
            while((data = inputStream.read() )!=-1){
                System.out.println((char) data);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    //For actual text:\Hello , नमस्त , తెలుగు
    //use Reader
    //Streams (InputStream/OutputStream) handle raw binary data byte-by-byte (8-bit), while Readers and Writers handle textual data character-by-character (16-bit Unicode)
}


