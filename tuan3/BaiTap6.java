package project1.tuan3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BaiTap6 {
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
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[j] % arr[i] ==0 && arr[i] != arr[j]) {
                    s.add(arr[i]);
                } 
            }
        }
        System.out.println("Cac day so thoa man :");
        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.print((Integer) iterator.next() + " ");
        }
        System.out.println("");
        System.out.println("Nguyen Van Huong 20183550");
    }
}
