package Comparator.sorting;


import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static Comparator.io.FileReader.readtoFile;
import static Comparator.io.FileWriter.writetoFile;

public class SortFileLines {
    public static void sortBylength(File file) throws Exception {
        ArrayList<String> lines =  readtoFile(file);
        Collections.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });

        writetoFile(lines);
    }

}
