
package project1.tuan2;

public class BaiTap7 {
    public static void main(String[] args) {
        int count = 0;
        int count1Div = 0;
        int count2Div = 0;
        int count3Div = 0;
        for(int i = 1; i <= 100; i++){
            if(i%5 == 0) count++;
            else if((i-1)%5 ==0) count1Div++;
            else if((i-2)%5 ==0) count2Div++;
            else if((i-3)%5 ==0) count3Div++;
        }
        System.out.println("So cac so chia het cho 5 là:" + count);
        System.out.println("So cac so chia 5 du 1 là:" + count1Div);
        System.out.println("So cac so chia 5 du 2 là:" + count2Div);
        System.out.println("So cac so chia 5 du 3 là:" + count3Div);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
