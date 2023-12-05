package Comparator.io;


import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;

public class FileWriter {
    public static void writetoFile(ArrayList<String> lines) throws Exception {
        File f1= new File("C:\\Users\\bharath.m\\IdeaProjects\\Java_Collections\\src\\main\\java\\Comparator\\target.txt");
        BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(f1));
      for ( String s:lines) {
           bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

}
