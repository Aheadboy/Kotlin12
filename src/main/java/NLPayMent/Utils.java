package NLPayMent;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static int[] colorChange = {0XFFff0000, 0XFF6600ff, 0xFFffff00, 0XFFFC00D1};
    private static int arrLength = colorChange.length;
    private static int bigI = 0;

    public static String bcd2Str(byte[] b) {
        char[] HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb = new StringBuilder(b.length * 2);

        for (int i = 0; i < b.length; ++i) {
            sb.append(HEX_DIGITS[(b[i] & 240) >>> 4]);
            sb.append(HEX_DIGITS[b[i] & 15]);
        }

        return sb.toString();
    }

    public static byte[] str2Bcd(String asc) {
        int len = asc.length();
        int mod = len % 2;
        if (mod != 0) {
            asc = "0" + asc;
            len = asc.length();
        }

        byte[] abt = new byte[len];
        if (len >= 2) {
            len /= 2;
        }

        byte[] bbt = new byte[len];
        abt = asc.getBytes();

        for (int p = 0; p < asc.length() / 2; ++p) {
            int j;
            if (abt[2 * p] >= 97 && abt[2 * p] <= 122) {
                j = abt[2 * p] - 97 + 10;
            } else if (abt[2 * p] >= 65 && abt[2 * p] <= 90) {
                j = abt[2 * p] - 65 + 10;
            } else {
                j = abt[2 * p] - 48;
            }

            int k;
            if (abt[2 * p + 1] >= 97 && abt[2 * p + 1] <= 122) {
                k = abt[2 * p + 1] - 97 + 10;
            } else if (abt[2 * p + 1] >= 65 && abt[2 * p + 1] <= 90) {
                k = abt[2 * p + 1] - 65 + 10;
            } else {
                k = abt[2 * p + 1] - 48;
            }

            int a = (j << 4) + k;
            byte b = (byte) a;
            bbt[p] = b;
        }
        return bbt;
    }

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * Convert hex string to byte[]
     *
     * @param hexString the hex string
     * @return byte[]
     */
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    /**
     * Convert char to byte
     *
     * @param c char
     * @return byte
     */
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }


    public static List<Element> xpathUse(List<Integer> field) {
        List<Element> ex = new ArrayList<Element>();
        SAXReader reader = new SAXReader();
        Document doc = null;
        try {
            doc = reader.read(new FileInputStream("D:\\ljjwork\\Kotlin1\\src\\main\\java\\NLPayMent\\ISO8583Fields"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Element root = doc.getRootElement();
        for (int i = 0, k = field.size(); i < k; i++) {
            ex.add(root.elementByID(field.get(i).toString()));
        }

        return ex;
    }

    public static int test(
    ) {
//        0xffDC143C
        String s = "ffffffff";
        return 1;
        //comittest
    }

}  