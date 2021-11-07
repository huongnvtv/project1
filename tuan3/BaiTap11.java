
package project1.tuan3;

import java.util.Scanner;

public class BaiTap11 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static int timMax(int x[], int n){
	int max = x[0];
	for(int i=0; i<n; i++){
		if(x[i]>max)
			max = x[i];
	}
	return max;
    }
    public static void inMangConKhongGiam(int arr[], int n){
        int b[] = new int[n];
	for(int i=0; i<n; i++){
		b[i]=1;
	}
	
	for(int i=n-1; i>0; i--){
		if(arr[i]>=arr[i-1]){
			b[i-1]=b[i]+1;
		}
	}
	int soLuong = timMax(b, n);
	for(int i=0; i<n; i++){
		if(b[i]==soLuong){
		System.out.println("Day con tang dai nhat :");	
		for(int j=i; j<soLuong+i; j++)
		    System.out.print(arr[j] + " ");
		}
	}

    }
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        inMangConKhongGiam(arr, n);
        System.out.println("Nguyen Van Huong 20183550");
    }
}
