package comparator.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<Member>();
        Iterator<Member> iterator;
        memberList.add(new Member(103, 28));
        memberList.add(new Member(101, 29));
        memberList.add(new Member(105, 30));
        memberList.add(new Member(102, 31));
        memberList.add(new Member(104, 32));
        iterator = memberList.iterator();
        System.out.println("--[Before Sorting]--");
        while (iterator.hasNext())
        {
            Member temp = iterator.next();
            System.out.println(temp.getId() + " : " + temp.getAge());
        }
        MyComparator myComparator = new MyComparator();
        Collections.sort(memberList, myComparator);
        iterator = memberList.iterator();
        System.out.println("--[After Sorting]--");
        while (iterator.hasNext())
        {
            Member temp = iterator.next();
            System.out.println(temp.getId() + " : " + temp.getAge());
        }
    }
}
