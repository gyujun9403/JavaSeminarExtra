package lambda;

import java.util.*;

public class LambdaTest {
    public static void main(String[] args) {
        LambdaInterface rec;
        rec = n -> {
            System.out.println(n * n);
            return n * n;
        };
        rec.PrintRectangleArea(3);
        Iterator<String> iter;
        List<String> list = Arrays.asList("bacd", "acbd", "a", "cde", "ab");
        iter = list.iterator();
        System.out.println("[Not sorted]");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //comparator을 람다식으로 정의. s1, s2의 형은 String. list의 인자가 String이기때문에...?
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        iter = list.iterator();
        System.out.println("[Sorted]");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
