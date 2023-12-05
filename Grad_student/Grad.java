package Grad_student;

public class Grad {
    private String name;
    private int EID;private int YOP;private int salary;



    public String getName() {
        return name;
    }

    public int getEID() {
        return EID;
    }

    public int getYOP() {
        return YOP;
    }

    public int getSalary() {
        return salary;
    }


    public Grad(String name, int EID, int YOP, int salary) {
        this.name = name;
        this.EID = EID;
        this.YOP = YOP;
        this.salary = salary;
    }


    public Grad(int EID, int YOP, int salary) {
        this.EID = EID;
        this.YOP = YOP;
        this.salary = salary;
    }
}
