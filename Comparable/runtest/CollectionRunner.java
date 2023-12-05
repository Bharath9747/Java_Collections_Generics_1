package Comparable.runtest;


import Comparable.sorting.SortFileLines;

import java.io.File;

public class CollectionRunner {
    public static void main(String[] args) throws Exception {
        SortFileLines.sortBylength(new File("C:\\Users\\bharath.m\\IdeaProjects\\Java_Collections\\src\\main\\java\\Comparable\\source.txt"));
        System.out.println("done");
    }
}
