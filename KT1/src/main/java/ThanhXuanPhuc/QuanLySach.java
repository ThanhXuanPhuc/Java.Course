/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThanhXuanPhuc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class QuanLySach {

    private static Scanner sc = new Scanner(System.in);
    private static List<Sach> QLSach = new ArrayList<>();

    public QuanLySach(){
        khoiTaoDuLieu();
    }

      private void khoiTaoDuLieu() {
        QLSach.add(new Sach("K011", "Lap trinh java", 95000, 2017));
        QLSach.add(new Sach("K012", "Co so du lieu", 85000, 2001));
        QLSach.add(new Sach("K013", "Nhap mon Lap trinh", 72000, 2013));
        QLSach.add(new Sach("K014", "Lap trinh Python", 39000, 2018));
        QLSach.add(new Sach("K015", "Lap trinh C#", 82000, 2015));
    }


    public static void menu() {
        int chon = 0;
        while (chon != 8) {
            System.out.print("\n=====QUAN LY SACH====="
                    + "\n1. Xuat toan bo sach va tong tri gia cac sach trong thu vien"
                    + "\n2. Cac sach xuat ban truoc nam 2015."
                    + "\n3. Sach co ky tu dau tien cua ten sach la (Lap trinh)"
                    + "\n4. Sap xep theo gia tang dan"
                    + "\n5. Xoa sach theo ma sach"
                    + "\n6. Sua gia bia cua sach theo ma sach"
                    + "\n7. Tinh tong tri gia cua cac sach trong nha sach"
                    + "\n8. Thoat."
                    + "\n\nChon hanh dong ban muon thuc hien: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    xuatTT();
                    break;
                case 2:
                    sach2015();
                    break;
                case 3:
                    sachLT();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoaSach();
                    break;
                case 6:
                    suaGia();
                    break;
                case 7:
                    tongTG();
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("\nChon khong hop le!");
                    break;
            }
        }
    }

    private static void xuatTT() {
        double tongTriGia = 0;
        for (Sach s : QLSach) {
            System.out.println("\nMa sach: " + s.getMasach()
                    + "\nTen sach: " + s.getTensach()
                    + "\nGia bia: " + s.getGiabia()
                    + "\nNam Xuat ban: " + s.getNamxuatban());
            tongTriGia += s.getGiabia();
        }
        System.out.println("\nTong tri gia cac sach trong thu vien: " + tongTriGia + " VND");
    }

    private static void sach2015() {
        System.out.println("\nCac sach xuat ban truoc nam 2015:");
        for (Sach s : QLSach) {
            if (s.getNamxuatban() < 2015) {
                System.out.println(s);
            }
        }      
    }

    private static void sachLT() {
         System.out.println("\nCac sach co ten bat dau bang 'Lap trinh':");
        for (Sach s : QLSach) {
            if (s.getTensach().startsWith("Lap trinh")) {
                System.out.println(s);
            }
        }        
    }

    private static void sapXep() {
        QLSach.sort((sp1, sp2) -> Double.compare(sp1.getGiabia(), sp2.getGiabia()));
        System.out.println("Danh sach san pham sau khi sap xep tang  dan theo gia:");
        xuatTT();
    }

    private static void xoaSach() {
        String tiep = "y";
        while ("y".equalsIgnoreCase(tiep)) {
            System.out.print("\nNhap ma sach can xoa: ");
            String msXoa = sc.next();
            boolean xoa = false;
            for (int i = 0; i < QLSach.size(); i++) {
                if (msXoa.equalsIgnoreCase(QLSach.get(i).getMasach())) {
                    QLSach.remove(i);
                    System.out.println("\nXoa thanh cong!");
                    xoa = true;
                    break;
                }
            }
            if (!xoa) {
                System.out.println("\nKhong tim sach can xoa!");
            }
            System.out.print("\nBan co muon xoa tiep?(y/n)");
            tiep = sc.next();
        }

    }

    private static void suaGia() {
        System.out.print("\nNhap ma sach can sua gia: ");
        String maSach = sc.next();
        boolean sua = false;
        for (Sach s : QLSach) {
            if (s.getMasach().equalsIgnoreCase(maSach)) {
                System.out.print("Nhap gia bia moi: ");
                double giaMoi = sc.nextDouble();
                s.setGiabia(giaMoi);
                System.out.println("\nSua gia thanh cong!");
                sua = true;
                break;
            }
        }
        if (!sua) {
            System.out.println("\nKhong tim thay sach co ma nay!");
        }
    }

    private static void tongTG() {
        double tongTriGia = QLSach.stream().mapToDouble(Sach::getGiabia).sum();
        System.out.println("\nTong tri gia cua cac sach trong nha sach: " + tongTriGia + " VND");
    }
}