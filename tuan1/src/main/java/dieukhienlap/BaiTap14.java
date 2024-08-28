/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dieukhienlap;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */


public class BaiTap14 {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double n;

        // Nhập các số khác 0
        do {
            System.out.print("Nhap mot so (nhap 0 de dung): ");
            n = sc.nextDouble();
            if (n != 0) {
                a.add(n);
            }
        } while (n != 0);

        // Tính trung bình các số vừa nhập
        if (!a.isEmpty()) {
            double sum = 0;
            for (double number : a) {
                sum += number;
            }
            double tb= sum / a.size();

            // Định dạng lấy 3 số lẻ
            System.out.printf("Trung binh cua cac so vua nhap la: %.3f\n", tb);
        } else {
            System.out.println("Khong co so nao duoc nhap vao.");
        }
    }
}
