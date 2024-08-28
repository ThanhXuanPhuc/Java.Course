package mang1chieu;

import java.util.Scanner;

public class BaiTap17 {

    public static void main(String[] args) {
        double[] a; // Khai báo mảng số thực
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = docSoPhanTu(sc); // Nhập số lượng phần tử của mảng
        a = new double[n]; // Cấp phát mảng
        
        nhapMang(a, sc); // Nhập các giá trị cho mảng
        xuatMang(a); // Xuất mảng ra màn hình
        
        double tb = tinhTB(a); // Tính giá trị trung bình
        System.out.println("\nGia tri trung binh cua mang: " + tb);
        
        double min = timMin(a); // Tìm phần tử nhỏ nhất
        System.out.println("Phan tu co gia tri nho nhat: " + min);
    }
    
    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }
    
    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(double[] a) {
        System.out.print("Mang so thuc: ");
        for (double x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    // Định nghĩa phương thức đọc số phần tử của mảng
    public static int docSoPhanTu(Scanner sc){
        int n;
        do {
            System.out.print("Cho biet so phan tu mang (1 <= n <= 20): ");
            n = sc.nextInt();
        } while(n < 1 || n > 20);
        return n;
    }
    
    // Định nghĩa phương thức tính giá trị trung bình
    public static double tinhTB(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum / a.length;
    }
    
    // Định nghĩa phương thức tìm phần tử nhỏ nhất
    public static double timMin(double[] a) {
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
