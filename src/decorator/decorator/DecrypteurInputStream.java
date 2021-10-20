package decorator.decorator;

import javax.crypto.*;
import java.io.InputStream;

public class DecrypteurInputStream extends Decorator {
    public DecrypteurInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() {
        String result = "";
        int s = -1;
        int count = 0;
        int[] readPair = new int[2];
        try {
            while (true) {
                s = inputStream.read();
                if (count == 2) {
                    result += String.valueOf(readPair[0] - readPair[1]);
                    count = 0;
                    readPair[count++] = s;
                } else {
                    readPair[count++] = s;
                }
                if (s == -1) break;
            }
            s = Integer.valueOf(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
