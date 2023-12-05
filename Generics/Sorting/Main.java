package Generics.Sorting;

public class Main {
    public static <T> void sort(T[] a){
        for (int i=0;i< a.length-1;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {

            }
        }
        for(T t:a)
        {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Integer[] n1 = {10,20,30,10,20,100};
        sort(n1);
    }
}
