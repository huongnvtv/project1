package project1.tuan3;

import java.util.Scanner;

public class BaiTap9 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhap vao so nguyen C :");
        int c = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == c) count++; 
        }
        System.out.println("So cac so trong day bang " + c + " la: " + count);
    }
}
