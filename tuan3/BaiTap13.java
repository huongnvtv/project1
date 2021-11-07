package project1.tuan3;

import java.util.Scanner;

public class BaiTap13 {

    public static Scanner scanner = new Scanner(System.in);

    public static void inMaTran(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " \t ");
            }
            System.out.println("");
        }
    }

    public static void taoMaTranXoanOc(int n,int a[][]) {
        int d = 0, i, gt = 1;
        int hang = n - 1, cot = n - 1;
        while (gt <= n * n) {
            for (i = d; i <= cot; i++) {
                a[d][i] = gt++; 
            }
            for (i = d + 1; i <= hang; i++) {
                a[i][cot] = gt++; 
            }
            for (i = cot - 1; i >= d && gt <= n * n; i--) {
                a[hang][i] = gt++; 
            }
            for (i = hang - 1; i > d && gt <= n * n; i--) {
                a[i][d] = gt++;  
            }
            d++;
            hang--;
            cot--;           
        }
        inMaTran(a, n);
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhap vao kich thuoc cua mang: ");
            n = scanner.nextInt();
        } while (n < 3 || n > 8);
        int a[][] = new int[n][n];
        taoMaTranXoanOc(n, a);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
