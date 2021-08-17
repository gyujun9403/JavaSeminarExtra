package trywithresource.example;

public class TestMain {
    public static void main(String[] args) {
        Member mb1 = new Member();
        Member mb2 = new Member();
        try (mb1; mb2) {
            mb1.work();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.err.println("ddd");
    }
}
