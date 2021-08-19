package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        iter = list.iterator();
        System.out.println("[Sorted]");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
