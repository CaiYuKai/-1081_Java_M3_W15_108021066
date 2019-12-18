import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(a,n));
    }

    public static long power(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * power(x, y - 1);
        }
    }
}
