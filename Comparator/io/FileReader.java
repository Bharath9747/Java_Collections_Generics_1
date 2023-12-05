package Comparator.io;


import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class FileReader {
    public static ArrayList<String> readtoFile(File file) throws Exception {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
        String s="";
        while ((s=br.readLine())!=null)
            lines.add(s);
        return lines;
    }
}
