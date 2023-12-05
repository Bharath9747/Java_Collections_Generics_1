package Collection;

import java.util.*;

public class Hmsort {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"zharath");
        map.put(2,"ram");
        map.put(1,"thasee");
        map.put(0,"nambi");
        List<Map.Entry<Integer, String> > list =
                new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1,
                               Map.Entry<Integer, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>();
        for (Map.Entry<Integer, String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println(temp);

    }
}
