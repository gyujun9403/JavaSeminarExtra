package secondarystream;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) {
        String inputString;
        InputStream is = System.in;
        OutputStream os = System.out;
        // public InputStreamReader(InputStream in) {...}
        InputStreamReader reader = new InputStreamReader(is);
        // public BufferedReader(Reader in) {...}
        BufferedReader br = new BufferedReader(reader);
        // public OutputStreamWriter(OutputStream out) {...}
        OutputStreamWriter writer = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(writer);

        try {
            // public String readLine() throws IOException{...}
            inputString = br.readLine();
            bw.write(inputString);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                reader.close();
                bw.close();
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
