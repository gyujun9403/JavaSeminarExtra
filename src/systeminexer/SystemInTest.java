package systeminexer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SystemInTest {
    public static void main(String[] args) {
        InputStream iS = System.in;
        Reader reader = new InputStreamReader(iS);
        BufferedReader br = new BufferedReader(reader);
        try {
            String lineStr = br.readLine();
            System.out.println(lineStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
