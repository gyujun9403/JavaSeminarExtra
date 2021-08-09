package setexample;

import java.util.Objects;

public class Member implements Comparable<Member>{
    private String name;
    private int age;

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 인텔리제이가 자동완성해준 equals, hashCode오버라이딩...ㄷㄷㄷㄷ
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    // 비교대상인 o를 넣었을 때,
    // this가 더 크면 오름차순 정렬, 작으면 내림차순 정렬
    public int compareTo(Member o) {
        return (this.getAge() - o.getAge());
    }
}
