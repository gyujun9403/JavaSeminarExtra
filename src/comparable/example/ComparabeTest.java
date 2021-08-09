package comparable.example;

import java.util.*;

public class ComparabeTest {
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
        Collections.sort(memberList);
        iterator = memberList.iterator();
        System.out.println("--[After Sorting]--");
        while (iterator.hasNext())
        {
            Member temp = iterator.next();
            System.out.println(temp.getId() + " : " + temp.getAge());
        }
    }
}
