
package project1.tuan2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaiTap10 {
    public static boolean isSNT(int n) {
        if (n < 2) {
            return false;
        }
        int canN = (int) Math.sqrt(n);
        for (int i = 2; i <= canN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 2;
        System.out.println("Cac uoc so nguyen to khac nhau cua " + n +" la: ");
        while(i <= n/2) {
            if(isSNT(i) && n%i ==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
