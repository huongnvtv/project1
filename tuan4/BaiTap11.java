
package project1.tuan4;

import java.util.Scanner;

public class BaiTap11 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao tong so hoc sinh trong lop: ");
        int n = scanner.nextInt();
        String list[] = new String[n];
        System.out.println("Nhap vao ho va ten tung ban hoc sinh :");
        for(int i = 0; i < n; i++){
            list[i] = scanner.nextLine();
        }
        int count = 0; 
        for(int i = 0; i < n; i++){
            String name = list[i].substring(list[i].lastIndexOf(" ") + 1);
            if(name.equalsIgnoreCase("An")) {
                count ++;
            }
        }
        System.out.println("So ban hoc sinh ten An trong lop la: " + count);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
