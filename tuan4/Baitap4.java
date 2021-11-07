
package project1.tuan4;

import java.util.Scanner;

public class Baitap4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao ho va ten: ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s");
        int n = words.length;
        System.out.print("Phan ho: ");
        for(int i = 0; i < n-1; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println("");
        System.out.println("Nguyen Van Huong 20183550" );
    }
}
