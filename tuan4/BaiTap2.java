package project1.tuan4;

import java.util.Scanner;

public class BaiTap2 {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count++;
                index += str.length();
            } else {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Nhap vao xau ki tu: ");
        String str = scanner.nextLine();
        int count = countMatches(str, "abc");
        System.out.println("So lan xuat hien xau con abc la : " + count);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
