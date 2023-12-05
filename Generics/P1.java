package Generics;

import java.util.ArrayList;

public class P1<T extends Shape> {
    T t;
    P1(T t)
    {
        this.t=t;
    }

    public static void main(String[] args) {
        P1<Shape> cir = new P1<>(new Circle());
        P1<Shape> rec = new P1<>(new Rectangle());
        P1<Shape> cir1 = new P1<>(new Circle());
        ArrayList<P1<Shape>> a1 = new ArrayList<>();
        a1.add(cir);
        a1.add(rec);
        a1.add(cir1);
        printlist(a1);
    }
    static void printlist(ArrayList<P1<Shape>> a1){
        for(P1<Shape> p:a1)
        {
            p.print();
        }
    }
    private void print() {
        this.t.draw();
    }

}
