package project1.tuan2b;

import java.util.Scanner;

public class BaiTap2 {
    public static int tinhGiaiThua(int n){
        int s = 1;
        for(int i = 1; i <= n; i++) {
            s *=i;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float s = 0;
        for(int i = 1; i <= n; i++){
              s += 1 * 1.0/tinhGiaiThua(i);
        }
        System.out.println("Tong: "+s);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
