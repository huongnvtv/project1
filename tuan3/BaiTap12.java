package project1.tuan3;

import java.util.Scanner;

public class BaiTap12 {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean is_a_contain_b(int A[], int n, int B[], int m) {
        int i, j, k;
        boolean res = false;
        if (n < m) {
            return false;
        }
        for (i = 0; i < n; i++) {
            if (B[0] == A[i] && n - i >= m) {
                k = i + 1;
                res = true;
                for (j = 1; j < m; j++, k++) {
                    if (B[j] != A[k]) {
                        res = false;
                        break;
                    }
                }
                if (res) {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua mang 1: ");
        int n = scanner.nextInt();
        int[] x = new int[n];
        System.out.print("Nhap cac phan tu cua mang 1: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = ", i);
            x[i] = scanner.nextInt();
        }
        System.out.println("Nhap vao so phan tu cua mang 2: ");
        int m = scanner.nextInt();
        int[] y = new int[m];
        System.out.print("Nhap cac phan tu cua mang 2: \n");
        for (int i = 0; i < m; i++) {
            System.out.printf("y[%d] = ", i);
            y[i] = scanner.nextInt();
        }
        if(is_a_contain_b(y, m, x, n)){
            System.out.println("a[] la day con cua b[]");
        }else {
            System.out.println("a[] khong phai la day con cua b[]");
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
