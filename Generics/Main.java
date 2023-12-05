package Generics;


public class Main<T> {
    T t;
    Main(T t)
    {
        this.t=t;
    }
    void printobj(){
        System.out.println(this.t.toString());
    }


    public static void main(String[] args) {
        Student ts = new Student();
        ts.setName("Bharath");
        Main<Student> s = new Main<>(ts);

        System.out.println(s.toString());
    }

}
