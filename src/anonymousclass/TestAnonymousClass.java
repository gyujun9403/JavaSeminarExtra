package anonymousclass;

public class TestAnonymousClass {
    public static void main(String[] args) {
        Member anonymousMember = new Member() {
            public void printClass() {
                System.out.println("Member");
            }
            @Override
            public void printMember() {
                printClass();
                System.out.println(id + " : " + name);
            }
        };
        anonymousMember.setId(123);
        anonymousMember.setName("test");
        // Cannot resolve method 'printClass' in 'Member'
        // 익명클래스 내부에서 생성한 프로퍼티, 메소드는 익명객체 내부에서만 사용되고
        // 외부에서는 접근할 수 없다. -> Member형에는 printClass가 정의되어있지 않기 때문
        //anonymousMember.printClass();
        anonymousMember.printMember();
    }
}
