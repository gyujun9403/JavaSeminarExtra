package streamexer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        //스트림 생성하고 출력
        Stream<Book> collection = bookList.stream();
        System.out.println("[Not sorted]");
        collection.forEach(book -> System.out.println(book.getName() + "의 가격은 " + book.getPrice() + "원 입니다."));

        collection = bookList.stream();
        System.out.println("[Sorted]");
        collection.sorted(Comparator
                .comparing(Book::getName))
                .forEach(book -> System.out.println(book.getName() + "의 가격은 " + book.getPrice() + "원 입니다."));
    }
}
