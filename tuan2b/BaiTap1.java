package project1.tuan2b;

import java.util.Scanner;

public class BaiTap1 {
    public static float subSum(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien N: ");
        int n = input.nextInt();
        float s = 0;
        for(int i = 1; i <= n; i++){
           s += 1/ subSum(i);
        }
        System.out.println("Tong: " + s);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
