
package project1.tuan2;

public class BaiTap6 {
    public static boolean checkSoHoaHao(int n) {
        int sum =0;
        for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
                sum+= i;
            }
        }
        if(sum == n) return true;
        return false;
    }
    public static void main(String[] args) {
        int i = 2;
        int count = 0;
        while(count < 5) {
            if(checkSoHoaHao(i)) {
                count++;
                System.out.println(i+" ");
            }
            i++;
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
