
package project1.tuan2b;

import java.util.Scanner;

public class BaiTap4 {
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien N :");
        int n = input.nextInt();
        System.out.println("So fibonacci thu "+ n + " la: ");
        System.out.println(fibonacci(n));
        System.out.println("Nguyen Van Huong 20183550");
    }
}
