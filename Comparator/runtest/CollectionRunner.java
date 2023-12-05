package Comparator.runtest;


import java.io.File;

import static Comparator.sorting.SortFileLines.sortBylength;

public class CollectionRunner {
    public static void main(String[] args) throws Exception {
        sortBylength(new File("C:\\Users\\bharath.m\\IdeaProjects\\Java_Collections\\src\\main\\java\\Comparator\\source.txt"));
        System.out.println("done");
    }
}
