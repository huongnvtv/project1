
package project1.tuan2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaiTap9 {
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
        int N;
        Queue<Integer>s = new LinkedList<>();
        do {       
           N = input.nextInt();
        } while (N <= 1);
        int i = 2;
        int result = N;
        while(N > 1){
            if(isSNT(i) && N%i ==0){
                s.add(i);
                N = N/i;
            }else {
                i++;
            }
        }
        System.out.print(result + " = ");
        while(!s.isEmpty()){
            int x = s.remove();
            if(s.isEmpty()){
                System.out.print(x); 
            }else{
                System.out.print(x + " * ");
            }
        }
        System.out.println(" Nguyen Van Huong 20183550");
    }
}
