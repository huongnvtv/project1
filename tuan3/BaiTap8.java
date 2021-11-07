
package project1.tuan3;

import java.util.LinkedList;
import java.util.Scanner;

public class BaiTap8 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        LinkedList<Integer> s = new LinkedList<Integer>();
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            s.add(x);
        }
        for(int i = 0; i < s.size(); i++){
            if(s.get(i) == 0) {
                s.remove(s.get(i));
            }
        }
        System.out.println("Day so moi la :");
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
