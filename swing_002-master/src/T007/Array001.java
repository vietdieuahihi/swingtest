package T007;

import java.util.Arrays;

public class Array001 {

    private int[] a;
    private int[] b;

    public Array001(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        int maxLength = Math.max(a.length, b.length);
        int[] c = new int[maxLength];



        System.out.println(Arrays.toString(c));
    }
}
