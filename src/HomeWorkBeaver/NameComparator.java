package HomeWorkBeaver;

import java.util.Comparator;

public class NameComparator implements Comparator <Bobr> {
    @Override
    public int compare(Bobr o1, Bobr o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
