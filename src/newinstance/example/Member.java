package newinstance.example;

public class Member {
    private int id;
    private int age;

    public Member() {
        this.id = 1;
        this.age = 2;
    }

    public Member(int id) {
        this.id = id;
        this.age = 2;
    }

    public Member(String str) {
        this.id = 3;
        this.age = 4;
    }

    public Member(int id, int age) {
        this.id = id;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
