package Comparable.sorting;


import java.io.File;
import java.util.ArrayList;
import java.util.stream.Collectors;

import Comparable.LineItem;
import static Comparable.io.FileReader.readtoFile;


public class SortFileLines {
    public static void sortBylength(File file) throws Exception {
        ArrayList<LineItem> lines =  readtoFile(file);
        lines.stream().sorted().
                collect(Collectors.toList()).forEach(x-> System.out.println(x.line));

    }

}
