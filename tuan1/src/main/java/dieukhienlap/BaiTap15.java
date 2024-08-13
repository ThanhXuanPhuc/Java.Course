/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dieukhienlap;

/**
 *
 * @author ADMIN
 */

import java.util.Random;
import java.util.Scanner;

public class BaiTap15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int soLanDoan = 0;
        int soLanTrung = 0;
        String tiepTuc;

        do {
            // Tạo ra số ngẫu nhiên từ 0 đến 10
            int soMay = rand.nextInt(11);

            // Người chơi nhập số
            System.out.print("Nhap mot so tu 0 den 10: ");
            int soNguoi = sc.nextInt();
            soLanDoan++;

            // Kiểm tra đoán đúng hay không
            if (soNguoi == soMay) {
                System.out.println("Ban da doan dung! Co diem!");
                soLanTrung++;
            } else {
                System.out.println("Ban da doan sai. So dung la: " + soMay);
            }

            // Hỏi người chơi có muốn tiếp tục hay không
            System.out.print("Ban co muon choi tiep tuc khong? (Nhap 'k' de ket thuc, phim bat ky de tiep tuc): ");
            tiepTuc = sc.next();
        } while (!tiepTuc.equalsIgnoreCase("k"));

        // Tính toán và hiển thị kết quả cuối cùng
        if (soLanDoan > 0) {
            double tyLeTrungBinh = (double) soLanTrung / soLanDoan;
            System.out.println("Ket thuc tro choi!");
            System.out.println("Tong so lan doan: " + soLanDoan);
            System.out.println("So lan doan dung: " + soLanTrung);
            System.out.printf("Ti le doan trung trung binh: %.3f\n", tyLeTrungBinh);
        } else {
            System.out.println("Ban chua doan lan nao.");
        }
    }
}
