/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static ArrayList<SanPham> ds = new ArrayList<>();

    public static void main(String[] args) {

        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===========CHUONG TRINH QUAN LY SAN PHAM============");
            System.out.println("1.Nhap danh sach san pham");
            System.out.println("2.Xuat danh sach san pham");
            System.out.println("3.Sap xep danh sach san pham");
            System.out.println("4.Xoa san pham theo ten");
            System.out.println("5.Tinh gia trung binh cua cac san pham");
            System.out.println("0.Thoat");
            System.out.println("===================================");
            System.out.println("Chon chuc nang (0>5): ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    xuatGiaTB();
                    break;
                default:
                    System.out.println("Goodbye");
            }
        } while (chon != 0);
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        String chon = "";
        do {
            System.out.println("Nhap thong tin san pham:");
            System.out.println("Ten:");
            String ten = sc.nextLine();
            System.out.print("Gia:");
            double gia = Double.parseDouble(sc.nextLine());

            ds.add(new SanPham(ten, gia));

            System.out.println("Tiep tuc(Y/N)");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));
    }

    private static void xuat() {
        System.out.println("Danh sach san pham:");
        for (SanPham sp : ds) {
            System.out.println("Ten: " + sp.getTen() + "- Gia: " + sp.getGia());
        }

    }

    private static void sapXep() {
        ds.sort((sp1, sp2) -> Double.compare(sp2.getGia(), sp1.getGia()));
        System.out.println("Danh sach san pham sau khi sap xep giam dan theo gia:");
        xuat();
    }

    private static void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham can xoa:");
        String ten = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getTen().equalsIgnoreCase(ten)) {
                ds.remove(i);
                found = true;
                System.out.println("San pham da duoc xoa.");
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay san pham voi ten: " + ten);
        }
    }

    private static void xuatGiaTB() {
        double tongGia = 0;
        for (SanPham sp : ds) {
            tongGia += sp.getGia();
        }
        double giaTB = !ds.isEmpty() ? tongGia / ds.size() : 0;
        System.out.println("Gia trung binh cua cac san pham la: " + giaTB);
    }

}
