package localclass;

public class Member {
    private Integer id;
    private String name;

    public void MemberMethod() {
        int num;
        // Cannot resolve symbol 'LocalClass'
        //LocalClass localClass = new LocalClass();

        // public 등 접근지정자 안됨
        class LocalClass {
                private int number;
                private String form;

                // 외부 클래스의 프로퍼티에 접근 가능
                LocalClass() {
                    form = id.toString() + name;
                    // Variable 'num' might not have been initialized
                    //number = num;
                }
        }

        // 메소드 내부에서만 인스턴스화 가능
        LocalClass localClass = new LocalClass();
    }
}
