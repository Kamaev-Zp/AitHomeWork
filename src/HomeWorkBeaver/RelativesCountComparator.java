package HomeWorkBeaver;

import java.util.Comparator;

public class RelativesCountComparator implements Comparator <Bobr> {


    @Override
    public int compare(Bobr o1, Bobr o2) {
        return Integer.compare(o1.getRelativesCount(),o2.getRelativesCount());
    }
}
