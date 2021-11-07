
package project1.tuan2;

import java.util.Scanner;

public class BaiTap8 {
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
   public static void findUsntMin(int n) {
       for(int i = 2; i < n; i++){
           if(isSNT(i) && n%i ==0){
               System.out.println(i);
               break;
           }
       }
   }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("So nguyen to nho nhat la uoc cua " + n + " la:" );
        findUsntMin(n);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
