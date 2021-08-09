package newinstance.example;

import java.lang.reflect.*;
import java.security.cert.Extension;

public class NewInstanceTest {
    public static void main(String[] args) throws Exception {
        Class[] parameterTypes = new Class[]{int.class, int.class};
        // = Class[] parameterTypes = new Class[]{Integer.TYPE, Integer.TYPE};
        Class memberClass = Class.forName("newinstance.example.Member");
        Constructor memberConstructor = memberClass.getConstructor(parameterTypes);
        Member member = (Member) memberConstructor.newInstance(1010, 24);
        System.out.println(member.getId() + " : " + member.getAge());
    }
}
