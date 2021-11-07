package project1.tuan4;

import java.util.Scanner;

public class BaiTap9 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap vao xau :");
        String str = scanner.nextLine();
        System.out.println("Nhap vao chi so i :");
        int i = scanner.nextInt();
        System.out.println("Nhap vao chi so j :");
        int j = scanner.nextInt();
        String result = "";
        if (i <= j) {
            for (int k = 0; k < str.length(); k++) {
               if(k == i){
                   result += Character.toString(str.charAt(j));
               }else if (k == j){
                   result += Character.toString(str.charAt(i));
               }else {
                   result += Character.toString(str.charAt(k));
               }
            }
        }
        System.out.println("Xau sau khi hoan doi la : " + result);
        System.out.println("Nguyen Van Huong 20183550");

    }
}
