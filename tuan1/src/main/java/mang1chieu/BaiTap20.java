package mang1chieu;

import java.util.Scanner;

public class BaiTap20 {

    public static void main(String[] args) {
        int[] a; // Khai báo mảng số nguyên
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        n = docSoPhanTu(sc);
        a = new int[n]; // Cấp phát mảng

        // Nhập các giá trị cho mảng
        nhapMang(a, sc);

        // Xuất mảng ra màn hình
        xuatMang(a);

        // Nhập số nguyên x sau khi mảng đã được nhập
        System.out.print("Nhap gia tri x: ");
        int x = sc.nextInt();
        
        // a. Tìm vị trí đầu tiên của x trong mảng
        int viTri = timViTriDauTien(a, x);

        if (viTri != -1) {
            System.out.println("Gia tri " + x + " xuat hien dau tien o vi tri: " + viTri);
        } else {
            System.out.println("Gia tri " + x + " khong xuat hien trong mang.");
        }

        // b. Kiểm tra mảng có tính chất tăng dần không
        if (kiemTraTangDan(a)) {
            System.out.println("Mang co tinh chat tang dan.");
        } else {
            System.out.println("Mang khong co tinh chat tang dan.");
        }
    }

    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap gia tri a[" + i + "]: ");
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
    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("Cho biet so phan tu cua mang (1 <= n <= 20): ");
            n = sc.nextInt();
        } while (n < 1 || n > 20);
        return n;
    }

    // Định nghĩa phương thức tìm vị trí đầu tiên của giá trị x trong mảng
    public static int timViTriDauTien(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i; // Trả về vị trí đầu tiên của x
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy x
    }

    // Định nghĩa phương thức kiểm tra tính chất tăng dần của mảng
    public static boolean kiemTraTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // Nếu có phần tử trước lớn hơn phần tử sau thì không tăng dần
            }
        }
        return true; // Mảng có tính chất tăng dần
    }
}
