package cauctrucrenhanh;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 3 số nguyên từ bàn phím
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int so2 = sc.nextInt();
        System.out.print("Nhap so nguyen thu ba: ");
        int so3 = sc.nextInt();

        // Tìm số nhỏ nhất
        int min = so1;

        if (so2 < min) {
            min = so2;
        }
        if (so3 < min) {
            min = so3;
        }

        // In ra số nhỏ nhất
        System.out.println("So nho nhat la: " + min);
}
}
