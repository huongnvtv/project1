
package project1.tuan4;

import java.util.Scanner;

public class BaiTap14 {
    static String leftrotate(String str, int d){
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
    
    static String rightrotate(String str, int d){
            return leftrotate(str, str.length() - d);
    }

    public static void main(String[] args) {
        String str1 = "1111100000";
        System.out.println("Tim kiem xau: ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = n;
        while((k--) != 0){
            str1 = leftrotate(str1, 1);
        }
        System.out.println("Xau S"+n+" la:");
        System.out.println(str1);
        System.out.println("\nNguyen Van Huong 20183550");
    }
}
