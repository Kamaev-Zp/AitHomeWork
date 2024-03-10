package HomeWorkBeaver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Bobr> bobrs = new LinkedList<>();

        Bobr bobr1 =new Bobr("Luo", 4,74);
        Bobr bobr2 =new Bobr("Sup", 12,23);
        Bobr bobr3 =new Bobr("Kir", 7,54);
        Bobr bobr4 =new Bobr("Tuo", 2,78);
        Bobr bobr5 =new Bobr("Huo", 8,34);

        bobrs.add(bobr1);
        bobrs.add(bobr2);
        bobrs.add(bobr3);
        bobrs.add(bobr4);
        bobrs.add(bobr5);

        Collections.sort(bobrs); // сортировка обычная по возрасту
        System.out.println("Бобры отсортированны по возрасту" + bobrs);

        Collections.sort(bobrs,new NameComparator());
        System.out.println("Бобры отсортированны по имени" + bobrs);

        Collections.sort(bobrs, new RelativesCountComparator());
        System.out.println("Бобры отсортированны по количеству родствеников" + bobrs);

        Collections.sort(bobrs, (((o1, o2) -> o1.getName().compareTo(o2.getName()))));
        System.out.println("Бобры отсортированны по имени с помощью лямбда выражения" + bobrs);

        Map<String, Integer> map = new HashMap<>();


        for (Bobr b: bobrs)
        {
            map.put(b.getName(), b.getRelativesCount());
            System.out.println(b);
        }

    }
}
