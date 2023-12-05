package Comparable.io;

import java.io.File;
import java.util.ArrayList;
import Comparable.LineItem;
import java.io.*;

public class FileReader {
    public static ArrayList<LineItem> readtoFile(File file) throws Exception {
        ArrayList<LineItem> lines = new ArrayList<>();
          BufferedReader br = new BufferedReader(new java.io.FileReader(file));
          String s="";
            while ((s=br.readLine())!=null)
            lines.add(new LineItem(s));
      return lines;

    }
}
