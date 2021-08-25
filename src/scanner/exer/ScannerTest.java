package scanner.exer;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.nextLine();
        String c = scanner.next();
        System.out.println(">> a : " + a);
        System.out.println(">> b : " + b);
        System.out.println(">> c : " + c);
    }
}
