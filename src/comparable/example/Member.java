package comparable.example;

public class Member implements Comparable<Member>{
    private int id;
    private int age;

    Member(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Member o) {
        // overflow, underflow 될 가능성이 있는 데이터라면, 조건문으로.
        return (this.id - o.id);
    }
}
