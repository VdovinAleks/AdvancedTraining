public class Solution {
    public static String rgb(int r, int g, int b) {
        String rgb = "";


        return rgb;
    }

    public static String rgb1(int r) {
        String rgb = "ABCDEF";
        String s = "";
        if (r < 10) {
            s += r;
        }
        else {
           s = s +rgb.charAt(r % 10);
        }


        return null;
    }

    public static void main(String[] args) {
        System.out.println(rgb(0, 0, 0));
        String rgb = "ABCDEF";
        System.out.println(rgb1(1));
        int w = 1;
        String s = "";
    }
}
