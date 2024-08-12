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
public class BaiTap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen duong n: ");
        int n = sc.nextInt();
        
        // Chuyển đổi số n thành chuỗi
        String s = String.valueOf(n);
        
        // Khởi tạo giá trị ban đầu cho chữ số lớn nhất và nhỏ nhất
        int max = Character.getNumericValue(s.charAt(0));
        int min = Character.getNumericValue(s.charAt(0));
        
        // Duyệt qua từng chữ số trong chuỗi
        for (int i = 1; i < s.length(); i++) {
            int cr = Character.getNumericValue(s.charAt(i));
            if (cr > max) {
                max = cr;
            }
            if (cr < min) {
                min = cr;
            }
        }
        
        System.out.println("Chu so lon nhat: " + max);
        System.out.println("Chu so nho nhat: " + min);
        
    }
}
