package dieukhienlap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số nguyên dương n
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        
        // Kiểm tra xem n có phải là số nguyên tố không
        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }
    
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        // Số nhỏ hơn 2 không phải là số nguyên tố
        if (n < 2) {
            return false;
        }
        // Kiểm tra các ước số từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu tìm được ước số thì n không phải là số nguyên tố
            }
        }
        return true; // Nếu không tìm được ước số nào thì n là số nguyên tố
    }
}
