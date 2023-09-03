public class Solution {
    public static int Past(int h, int m, int s)
    {
        return (h * 60 * 60 + m * 60 + s) * 1000;
    }

    public static void main(String[] args) {
        System.out.println(Past(1,1,2));
    }
}
