
package project1.tuan4;

import java.util.Scanner;

public class BaiTap6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau ku tu:");
        String str = scanner.nextLine();
        String result = "";
        for(int i = str.length() - 1; i >=0; i--){
            result += str.charAt(i);
        }
        System.out.println("Xau nghich dao la:" + result);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
