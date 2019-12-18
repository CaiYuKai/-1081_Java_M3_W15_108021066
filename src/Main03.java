import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int x){
        if (x==1){
            return  1;
        }
        else if (x==2){
            return  1;
        }
        else {
            return fun(x-1)+fun(x-2);
        }
    }
}