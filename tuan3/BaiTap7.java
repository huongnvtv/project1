
package project1.tuan3;

import java.util.Scanner;

public class BaiTap7 {
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
        int sMin = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < sMin) sMin = arr[i];
        }
        System.out.println("So tu nhien nho nhat trong day la :" + sMin);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
