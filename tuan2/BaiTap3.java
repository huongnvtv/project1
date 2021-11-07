package project1.tuan2;
public class BaiTap3 {
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
        for(int i = 1000; i <= 2000; i++) {
            if(isSNT(i)) {
                System.out.print(i+ "  ");
            }
        }
        System.out.println("Nguyen Van Huong 20183550");
    }
}
