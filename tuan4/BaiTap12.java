package project1.tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTap12 {
    public static boolean checkName(String n){
        String firstName;
        String middleName;
        String lastName;
        int firstSpace = n.indexOf(" ");
        
        if(firstSpace <0)return false;
        
        firstName = n.substring(0, firstSpace);
        int secondSpace = n.indexOf(" ", firstSpace + 1);
        if (secondSpace < 0) { 
            lastName = n.substring(firstSpace + 1);
            return false;
        }else {
            middleName = n.substring(firstSpace, secondSpace);
            lastName = n.substring(secondSpace + 1);
            if(" Thi".equalsIgnoreCase(middleName)){
                return true;
            }else return false;
        }
    }
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        System.out.println("Nhap so hoc sinh ");

        int t = scanner.nextInt();
        String answer = scanner.nextLine();
        
        for(int i =1; i < 1+t;i++){
            System.out.println("Nhap ho ten hoc sinh thu "+ i + " : ");
            answer = scanner.nextLine();
            name.add(answer);
        }

        for (int i = 0; i < name.size(); i++) {
            String n = name.get(i);
            boolean c = checkName(n);
            if(checkName(n))cnt ++;
        }
        System.out.println("So hoc sinh co ten dem la \"Thi\" là: " + cnt);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
