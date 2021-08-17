package innerclass;

public class OuterMember {
    private Integer id;
    private String name;

    protected class InnerMember {
        String form;

        InnerMember() {
            form = id.toString() + name;
        }

        public void printInfo() {
            System.out.println(form);
        }
    }
}
