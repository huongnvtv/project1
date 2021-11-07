
package project1.tuan2;

public class BaiTap2 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while(count < 20) {
            if(isPrimeNumber(n)){
                count++;
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
