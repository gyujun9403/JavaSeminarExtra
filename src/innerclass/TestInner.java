package innerclass;

public class TestInner {
    public static void main() {
        OuterMember Om = new OuterMember();
        OuterMember.InnerMember Im = Om.new InnerMember();
    }
}
