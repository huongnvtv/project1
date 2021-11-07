
package project1.tuan3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaiTap4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();
        int sMax = -100000;
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(sMax < arr[i]) sMax = arr[i];
        }
        for(int i = 0; i < n; i++){
            if(arr[i] == sMax) s.add(i);
        }
        System.out.println("Gia tri lon nhat cua day so la : " + sMax);
        System.out.println("Chi so tuong ung voi gia tri nho nhat :" );
        while(!s.isEmpty()){
            System.out.println(s.remove() + 1);
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
