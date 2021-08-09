package comparator.example;

import java.util.Comparator;

public class MyComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        return o1.getId() - o2.getId();
    }
}
