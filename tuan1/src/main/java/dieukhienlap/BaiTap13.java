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
public class BaiTap13 {
    public static void main(String[] args) {
        // Duyệt qua tất cả các số từ 10 đến 99
        for (int i = 10; i <= 99; i++) {
            // Tách số thành hai chữ số
            int a = i / 10;  // Lấy chữ số hàng chục
            int b = i % 10; // Lấy chữ số hàng đơn vị
            
            // Kiểm tra điều kiện: tích của hai chữ số bằng 2 lần tổng của hai chữ số đó
            if (a * b == 2 * (a+ b)) {
                // Nếu điều kiện đúng, in số đó ra
                System.out.println(i);
            }
        }
    }
}
