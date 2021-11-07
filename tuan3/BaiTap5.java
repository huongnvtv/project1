
package project1.tuan3;

import java.util.Scanner;

public class BaiTap5 {
     public static Scanner scanner = new Scanner(System.in);
     public static boolean checkHopSo(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0) count++;
            if(count > 2) return true;
        } 
        return false;
    }
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
        int countSNT = 0;
        int countHopSo = 0;
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(checkHopSo(arr[i])){
                countHopSo++;
            }else if(isPrimeNumber(arr[i])){
                countSNT++;
            }
        }
         System.out.println("So cac so nguyen to trong day la : " + countSNT);
         System.out.println("So cac so nguyen to trong day la : " + countHopSo);
         System.out.println("Nguyen Van Huong 20183550");
    }
}
