package staticnestedclass;

public class OutterMember {
    private Integer id;
    private String name;

    static public class InnerMember {
        String form;

        public InnerMember (String form) {
            // Non-static field 'id' / 'name' cannot be referenced from a static context
            //form = id.toString() + name;
            this.form = form;
        }
    }
}
