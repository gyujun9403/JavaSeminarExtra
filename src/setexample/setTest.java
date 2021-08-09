package setexample;

import java.util.*;

public class setTest {
    public static void main (String[] args) {
        Set<Member> setMember = new TreeSet<Member>();
        Iterator<Member> iterator;

        setMember.add(new Member("홍길동", 38));
        setMember.add(new Member("김선달", 41));
        setMember.add(new Member("홍길동", 38));
        setMember.add(new Member("김선달", 42));

        iterator = setMember.iterator();
        while (iterator.hasNext()) {
            Member temp;
            temp = iterator.next();
            System.out.println(temp.getAge() + "살 " + temp.getName());
        }
    }
}
