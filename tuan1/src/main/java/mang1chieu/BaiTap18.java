package mang1chieu;

import java.util.Scanner;

public class BaiTap18 {

    public static void main(String[] args) {
        int[] a; // Khai báo mảng số nguyên
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = docSoPhanTu(sc); // Nhập số lượng phần tử của mảng
        a = new int[n]; // Cấp phát mảng
        
        nhapMang(a, sc); // Nhập các giá trị cho mảng
        xuatMang(a); // Xuất mảng ra màn hình
        
        System.out.println("Cac phan tu khong phai la so nguyen to:");
        lietKeKhongPhaiSoNguyenTo(a); // Liệt kê các phần tử không phải số nguyên tố
        
        double tb = tinhTBSoNguyenTo(a); // Tính giá trị trung bình của các số nguyên tố
        System.out.println("Gia tri trung binh cua cac so nguyen to: " + tb);
    }
    
    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    
    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        System.out.print("Mang so nguyen: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    // Định nghĩa phương thức đọc số phần tử của mảng
    public static int docSoPhanTu(Scanner sc){
        int n;
        do {
            System.out.print("Cho biet so phan tu mang (1 <= n <= 50): ");
            n = sc.nextInt();
        } while(n < 1 || n > 50);
        return n;
    }
    
    // Định nghĩa phương thức kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    
    // Định nghĩa phương thức liệt kê các phần tử không phải số nguyên tố
    public static void lietKeKhongPhaiSoNguyenTo(int[] a) {
        for (int x : a) {
            if (!laSoNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
    
    // Định nghĩa phương thức tính giá trị trung bình của các số nguyên tố
    public static double tinhTBSoNguyenTo(int[] a) {
        double sum = 0;
        int count = 0;
        for (int x : a) {
            if (laSoNguyenTo(x)) {
                sum += x;
                count++;
            }
        }
        return (count == 0) ? 0 : sum / count;
    }
}
