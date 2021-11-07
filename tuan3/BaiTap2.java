package project1.tuan3;

import java.util.Scanner;

public class BaiTap2 {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Cac so nguyen to trong day la :");
        for(int i = 0; i < n; i++){
            if(isPrimeNumber(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
