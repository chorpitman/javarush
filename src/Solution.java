public class Solution {

    public static int min(int a, int b, int c, int d) {
        int min=0;
        if (a <= b && a <= c && a <= d) {
            min = a;
        } else if (b < a && b < c && b < d) {
            min = b;
        } else if (c < a && c < b && c < d) {
            min = c;
        } else if (d < a && d < b && d < c) {
            min = d;
        }
        return min;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}