package Grad_student;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Grad> list = new ArrayList<>();
        Set<Integer> sal = new HashSet<>();
        for (int i = 10; i <= 30; i++) {
            int yop = i / 10 == 1 ? 2021 : i / 10 == 2 ? 2022 : 2023;
            Grad e = new Grad("Acco"+i,i, yop, (i % 10+1) * 10000);
            sal.add((i % 10+1) * 10000);
            list.add(e);
        }
        Map<Integer,List<Grad>> map = new HashMap<>();
        for (Integer i:sal){
            List l = Arrays.asList(list.stream().filter(x->x.getSalary()==i).toArray());
            map.put(i,l);
        }
        for (Map.Entry<Integer,List<Grad>> e:map.entrySet())
        {
            System.out.println("Salary : "+e.getKey());
            for(Grad l :e.getValue())
                System.out.println("Employee Name : "+l.getName()+" Employee Id: "+l.getEID()+" Yeor of Passing : "+l.getYOP()+" Salary : "+l.getSalary());
            System.out.println();
        }
    }
}
