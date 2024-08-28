/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang1chieu;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap16 {

    public static void main(String[] args) {
        //khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        //Đọc số phần tử từ bàn phím
        n = docSoPhanTu(sc);
        //cap phat so phan tu cho mang
        a = new int[n];
        nhapMang(a, sc);
        //a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);
        
        //b.Tinh tong mang
        int sum = tinhTongMang(a);
        System.out.print("\nTong gia tri mang:" + sum);
        //c.Dem duong le trong mang
        int dem_duong_le = demDuongLe(a);
        System.out.print("\nCo " + dem_duong_le + "phan tu duong le trong mang");
        //d.
        int max = TimMax(a);
        System.out.print("\nGia tri lon nhat cua mang:" + max);
    }
    //dinh nghia phuong thuc nhap mang

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    //dinh nghia phuong thuc xuat mang

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static int docSoPhanTu(Scanner sc){
        int n = 0;
        do {
            System.out.print("Cho biet so phan tu mang (1<=n<=20): ");
            n = sc.nextInt();
        } while(n <= 0 || n > 20);
        return n;
    }
    //dinh nghia phuong thuc dem phan duong le
    public static int tinhTongMang(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x; //s=s+x;
        }
        return sum;
    }
    //dinh nghia phuong thuc dem phan duong le

    public static int demDuongLe(int[] a) {
        int dem_duong_le = 0;
        for (int x : a) {
            if (x > 0 && x % 2 != 0) {
                dem_duong_le++;
            }
        }
        return dem_duong_le;
    }
    //phuong thuc tim phan tu lon nhat mang

    public static int TimMax(int[] a) {
    //d.Tim phan tu lon nhat cua mang
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
