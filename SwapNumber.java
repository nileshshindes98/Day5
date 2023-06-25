import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        System.out.println("Enter two number :");
        Scanner input = new Scanner(System.in);
        System.out.println("Number a : ");
        int a = input.nextInt();
        System.out.println("Number b : ");
        int b = input.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("Number after swapping :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}
