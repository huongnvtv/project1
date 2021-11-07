
package project1.tuan2;
public class BaiTap1 {
    public static boolean checkHopSo(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0) count++;
            if(count > 2) return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        int countN = 0;
        for(int i = 2; i < 100; i++) {
            if(checkHopSo(i)) {
                System.out.print(i +" ");
                countN ++;
                if(countN == 40) {
                System.out.println("");
            }
            }
            
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
