/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.bt02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("===========CHUONG TRINH QUAN LY SINH VIEN============");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.println("===================================");
            System.out.print("Chon chuc nang (0-5): ");
            chon = sc.nextInt();
            sc.nextLine();  // Đọc bỏ dòng trống

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatHocLucGioi();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai !!! ");
            }
        } while (chon != 5);
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        String chon;
        do {
            System.out.println("Nhap thong tin sinh vien:");
            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nganh (IT/Biz): ");
            String nganh = sc.nextLine();

            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Diem Java: ");
                double java = sc.nextDouble();
                System.out.print("Diem HTML: ");
                double html = sc.nextDouble();
                System.out.print("Diem CSS: ");
                double css = sc.nextDouble();
                sc.nextLine();  // Đọc bỏ dòng trống
                ds.add(new SinhVienIT(java, css, html, hoTen, nganh));
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Diem Marketing: ");
                double marketing = sc.nextDouble();
                System.out.print("Diem Sales: ");
                double sales = sc.nextDouble();
                sc.nextLine();  // Đọc bỏ dòng trống
                ds.add(new SinhVienBiz(marketing, sales, hoTen, nganh));
            } else {
                System.out.println("Nganh khong hop le!");
            }

            System.out.print("Tiep tuc nhap sinh vien khac khong? (Y/N): ");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("Y"));

    }

    private static void xuat() {
        System.out.println("Danh sach sinh vien:");
        for (SinhVien sv : ds) {
            System.out.println("Ho ten: " + sv.hoten + " " + " Nganh: "  + sv.nganh + " " + "Diem: "  + sv.getDiem() + " " + "Hoc luc: "  + sv.getHocLuc());
        }
    }

    private static void xuatHocLucGioi() {
        System.out.println("Danh sach sinh vien co hoc luc gioi:");
        for (SinhVien sv : ds) {
            if (sv.getHocLuc().equals("Gioi") || sv.getHocLuc().equals("Xuất sắc")) {
            System.out.println("Ho ten: " + sv.hoten + " " + " Nganh: "  + sv.nganh + " " + "Diem: "  + sv.getDiem() + " " + "Hoc luc: "  + sv.getHocLuc());
            }
        }

    }

    private static void sapXep() {
        ds.sort((sv1, sv2) -> Double.compare(sv2.getDiem(), sv1.getDiem()));
        System.out.println("Danh sach sinh vien sau khi xep theo diem:");
        xuat();
    }

}
