package classClass.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class classClassTest {

    public static void main(String[] args) throws Exception {
        Class clazz1 = Member.class;
        Class clazz2 = Class.forName("classClass.example.Member");
        Member member = new Member();
        Class Clazz3 = member.getClass();
        System.out.println("clazz1.getClass()");
        System.out.println(">> " + clazz1.getClass());
        System.out.println("clazz1.getName()");
        System.out.println(">> " + clazz1.getName());
        System.out.println("\nclazz2.getClass()");
        System.out.println(">> " + clazz1.getClass());
        System.out.println("clazz2.getName()");
        System.out.println(">> " + clazz1.getName());
        System.out.println("\nclazz3.getClass()");
        System.out.println(">> " + clazz1.getClass());
        System.out.println("clazz3.getName()");
        System.out.println(">> " + clazz1.getName());
        System.out.println("--[field]--");
        Field[] fields = clazz1.getDeclaredFields();
        for (Field temp : fields)
            System.out.println(temp.getName());
        System.out.println("--[method]--");
        Method[] methods = clazz1.getDeclaredMethods();
        for (Method temp : methods)
            System.out.println(temp.getName());
    }
}
