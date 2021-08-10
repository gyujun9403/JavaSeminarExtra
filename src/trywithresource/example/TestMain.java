package trywithresource.example;

public class TestMain {
    public static void main(String[] args) {
        try (Member mb = new Member()) {
            mb.work();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
