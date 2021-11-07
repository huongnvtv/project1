package project1.tuan2;

import static java.lang.Math.abs;
import java.util.Scanner;

public class BaiTap12 {
    public static void main(String[] args) {
        int h = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap vao chieu cao:");
            h = input.nextInt();
        }while(h <2 || h >10);
        for(int i = 1; i <= h; i++){
           for(int k =1 ; k <= i; k++){
               System.out.print(" * ");
           }
            System.out.println("");
        }
        int i, j;
	for(i = 1; i <= h; i++) {
	  for(j = 1; j < 2 * h; j++) {
	    if(abs(h - j) <= (i - 1)) {
		System.out.print(" * ");
	    }else{
		System.out.print("   ");		}
	    }
	    System.out.println("");
	}
    }
}
