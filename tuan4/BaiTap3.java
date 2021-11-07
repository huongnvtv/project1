package project1.tuan4;

import java.util.Scanner;

public class BaiTap3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap vao ho va ten: ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s");
        int n = words.length;
        System.out.println("Phan ten: "+ words[n-1]);
        System.out.println("Nguyen Van Huong 20183550" );
    }
}
