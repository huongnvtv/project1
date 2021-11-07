
package project1.tuan4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaiTap10 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int countLenghtMax = 0;
        Queue<Integer> index = new LinkedList<>();
        System.out.println("Nhap vao so phan tu cua mang:");
        int n = scanner.nextInt();
        System.out.println("Nhap vao mang xau ki tu: ");
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap vao phan tu thu " + (i + 1) + " :");
            arr[i] = scanner.next();
        }
        for(int i = 0; i < n; i++){
            int countLengthCurrent = arr[i].length();
            if(countLenghtMax <= countLengthCurrent) {
                countLenghtMax = countLengthCurrent;
                index.add(i);
            }
        }
        System.out.println("Xau co do dai lon nhat la :");
        while (!index.isEmpty()) {            
            System.out.println(arr[index.remove()]);
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
