
package project1.tuan4;

import java.util.Scanner;

public class BaiTap5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau nhi phan :");
        String str = scanner.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                result += "1";
            }else {
                result += "0";
            }
        }
        System.out.println("Xau hoan doi la :" + result);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
