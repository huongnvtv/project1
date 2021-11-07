
package project1.tuan2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        LinkedList<Integer> s = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang:");
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            s.add(x);
        }
        Collections.shuffle(s);
        System.out.println("Danh sach xao tron:");
        for(int i = 0; i < n; i++){
            System.out.print(s.get(i)+ " ");
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
