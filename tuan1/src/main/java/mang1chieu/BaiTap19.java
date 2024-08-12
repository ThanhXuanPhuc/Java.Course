/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang1chieu;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class BaiTap19 {

    public static void main(String[] args) {
        int[] a; // Khai báo mảng 1 chiều 
        int n; //Khai biến n (số phần tử sử dụng)

        Scanner sc = new Scanner(System.in);

        n = docSoPhanTu(sc); // Nhập số lượng phần tử của mảng
        a = new int[n]; // Cấp phát mảng

        phatSinhMang(a); // Nhập các giá trị cho mảng

        System.out.print("Mang duoc phat sinh:");
        xuatMang(a); // Xuất mảng ra màn hình

        sapXepTang(a);
        System.out.print("\nMang sau khi sap xep tang:");
        xuatMang(a);

        //Câu b.
        System.out.print("Cho biet gia tri x:");
        int x = sc.nextInt();
        System.out.print("Cac phan tu la uoc so cua x: ");
        lietKeUocSo(a, x);
    }

    // Định nghĩa phương thức nhập mảng
    public static void phatSinhMang(int[] a) {
        //Nhập giá trị các phần tử mảng từ bàn phím
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
    }

    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        System.out.print(Arrays.toString(a));
    }

    // Định nghĩa phương thức đọc số phần tử của mảng
    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("Cho biet so phan tu mang (1 <= n <= 50): ");
            n = sc.nextInt();
        } while (n < 1 || n > 50);
        return n;
    }

    public static void lietKeUocSo(int[] a, int x) {
        for (int item : a) {
            if (x % item == 0) {
                System.out.print(item + ", ");
            }
        }
    }
}
