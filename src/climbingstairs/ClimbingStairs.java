package climbingstairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
    }

    static public int climbStairs(int n) {
        if (n <= 2 && n >= 0) {
            return n;
        }
        int beforePrev = 1;
        int prev = 2;
        int counter = 0;
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
                counter = beforePrev + prev;
                beforePrev = prev;
                prev = counter;
            }
        }
        return counter;
    }
}
