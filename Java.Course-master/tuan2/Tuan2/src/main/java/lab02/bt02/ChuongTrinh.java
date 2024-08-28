/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.bt02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class ChuongTrinh {

    public static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
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
        System.out.println("thuc hien nhap:");

        Scanner sc = new Scanner(System.in);
        String tieptuc;

        do {
            System.out.println("Cho biet loai sinh vien (IT:1,Biz:2): ");
            int chon = Integer.parseInt(sc.nextLine());
            SinhVien sv = null;
            if (chon == 1) {

                //1. Nhap thong tin
                System.out.println("Cho biet ho ten:");
                String hoTen = sc.nextLine();
                System.out.print("Diem Java: ");
                double java = Double.parseDouble(sc.nextLine());
                System.out.print("Diem HTML: ");
                double html = Double.parseDouble(sc.nextLine());
                System.out.print("Diem CSS: ");
                double css = Double.parseDouble(sc.nextLine());

                sv = new SinhVienIT(hoTen, java, css, html);
            } else if (chon == 2) {
                System.out.println("Cho biet ho ten:");
                String hoTen = sc.nextLine();
                System.out.print("Diem Marketing: ");
                double marketing = Double.parseDouble(sc.nextLine());
                System.out.print("Diem Sales: ");
                double sales = Double.parseDouble(sc.nextLine());

                sv = new SinhVienBiz(hoTen, marketing, sales);
            }
            //3. Them SV
            if (sv != null) {
                ds.add(sv);
            }

            System.out.println("Tiep tuc (Y/N?");
            tieptuc = sc.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    private static void xuat() {
        System.out.println("Thuc hien xuat danh sach sinh vien:");
        for (SinhVien sv : ds) {
            sv.Xuat();
        }
    }

    private static void xuatHocLucGioi() {
        System.out.println("Thuc hien xuat danh sach sinh vien hoc luc gioi:");
        for (SinhVien sv : ds) {
            if (sv.getHocLuc().equals("Gioi") || sv.getHocLuc().equals("Xuất sắc")) {
                sv.Xuat();
            }
        }

    }

    private static void sapXep() {
        System.out.println("thuc hien sap xep:");
        //dinh nghia tieu chi sap xep tren sinhvien
        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv1.getDiem(), sv2.getDiem());
            }
        };
        Collections.sort(ds, cmp);
        xuat();
    }
}
