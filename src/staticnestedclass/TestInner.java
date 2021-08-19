package staticnestedclass;

public class TestInner {
    public static void main(String[] args) {
        OutterMember.InnerMember inner = new OutterMember.InnerMember("test");
        OutterMember outter = new OutterMember();
    }
}
