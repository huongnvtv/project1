
package project1.tuan3;

import java.util.Scanner;

public class BaiTap10 {
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
        int count = 1;
        int index = 0;
        int maxCount = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                count++;
                if(maxCount < count) {
                    maxCount = count;
                    index = i - 1;
                }
            }else {
                count = 1;
            }
        }
        System.out.println("So phan tu day con bang nhau dai nhat la: " + maxCount);
        System.out.println("Chi so phan tu dau tien la : " + (index - maxCount + 2));
        System.out.println("Nguyen Van Huong 20183550");
    }
}
