package trywithresource.example;

public class Member implements AutoCloseable{
    public void work() {
        System.out.println(this + " is working");
    }
    @Override
    public void close() throws Exception {
        System.out.println(this + "'s close() is called");
    }
}
