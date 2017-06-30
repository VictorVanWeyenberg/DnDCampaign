/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package util;

public class ArrayUtils {

    public static Object[] concatenate(Object[] a, Object[] b) {
        int aLen = a.length;
        int bLen = b.length;
        Object[] c = new Object[aLen + bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }

}
