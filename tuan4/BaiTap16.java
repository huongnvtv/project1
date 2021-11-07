package project1.tuan4;

import java.util.Scanner;

public class BaiTap16 {

    static boolean isSubSequence(String str1, String str2, int m, int n) {
        int j = 0;

        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }

        return (j == m);
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao xau S1: ");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.next();
        System.out.println("Nhap vao xau S2: ");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.next();

        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        if(res){
            System.out.println("S1 la con cua xau S2 : ");
        }else {
            System.out.println("S1 khong la xau con cua S2");
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
