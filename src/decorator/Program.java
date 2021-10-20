package decorator;

import decorator.decorator.DecrypteurInputStream;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream("src/decorator/original.txt");

        is = new DecrypteurInputStream(is);
        int d = is.read();
        System.out.println("encryption result: " + d);
    }
}
