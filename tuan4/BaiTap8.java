
package project1.tuan4;

import java.util.Scanner;

public class BaiTap8 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhap vao xau 2: ");
        String str2 = scanner.nextLine();
        int count = 0;
        for(int i = 0; i <= str2.length() - str1.length(); i++){
            if(str2.substring(i, i + str1.length()).equals(str1)){
                count++;
            }
        }
        System.out.println("Xau " + str1 + " xuat hien tren xau " + str2 + " " + count + " lan");
        System.out.println("Nguyen Van Huong 20183550");
    }
}
