/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt06;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLPTGT {

    private static Scanner sc = new Scanner(System.in);
    private static List<PhuongTien> listPT = new ArrayList<>();

    public static void main(String[] args) {
        listPT.add(new Oto("ot001", "Ford", "Den nham", 2010, 900000000.0, 7, "4 xi lanh"));
        listPT.add(new XeMay("xm001", "Honda", "Xanh lam", 2012, 20000000.0, 14));
        listPT.add(new XeTai("xt001", "Hyundai", "Do", 2010, 2000000000.0, 2.14));

        menu();
    }

    public static void menu() {
        int chon = 0;
        while (chon != 5) {
            System.out.print("\n=====QUAN LY PHUONG TIEN====="
                    + "\n1. Them phuong tien"
                    + "\n2. Xoa phuong tien theo id"
                    + "\n3. Tim phuong tien theo hang san xuat hoac mau"
                    + "\n4. Xuat thong tin cac phuong tien da nhap"
                    + "\n5. Thoat"
                    + "\n\nChon hanh dong ban muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    themPT();
                    break;
                case 2:
                    xoaPT();
                    break;
                case 3:
                    timPT();
                    break;
                case 4:
                    xuatTT();
                    break;
                case 5:
                    System.out.println("\nGood bye. Thanks for using our program!");
                    break;
                default:
                    System.out.println("\nChon khong hop le!");
                    break;
            }
        }
    }

    public static void themPT() {
        String tiep = "y";
        while ("y".equalsIgnoreCase(tiep)) {
            System.out.print("\nChon loai phuong tien ban muon them: "
                    + "\n1. Oto "
                    + "\n2. Xe may"
                    + "\n3. Xe tai\n");
            int loaiPT = sc.nextInt();
            System.out.print("\nNhap id: ");
            String id = sc.next();
            System.out.print("\nNhap hang san xuat:");
            String hang = sc.next();
            System.out.print("\nNhap nam san xuat: ");
            int nam = sc.nextInt();
            sc.nextLine();
            System.out.print("\nNhap mau(color): ");
            String color = sc.nextLine();
            System.out.print("\nNhap gia ban: ");
            double gia = sc.nextDouble();

            switch (loaiPT) {
                case 1:
                    System.out.print("\nNhap so cho ngoi: ");
                    int choNgoi = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nNhap kieu dong co: ");
                    String dongCo = sc.nextLine();
                    listPT.add(new Oto(id, hang, color, nam, gia, choNgoi, dongCo));
                    break;
                case 2:
                    System.out.print("\nNhap cong suat: ");
                    double congSuat = sc.nextDouble();
                    listPT.add(new XeMay(id, hang, color, nam, gia, congSuat));
                    break;
                case 3:
                    System.out.print("Nhap trong tai: ");
                    double trongTai = sc.nextDouble();
                    listPT.add(new XeTai(id, hang, color, nam, gia, trongTai));
                    break;
                default:
                    System.out.print("\nChon khong hop le!");
                    break;
            }
            System.out.print("\nBan co muon them tiep?(y/n) ");
            tiep = sc.next();
        }
    }

    public static void xoaPT() {
        String tiep = "y";
        while ("y".equalsIgnoreCase(tiep)) {
            System.out.print("\nNhap id phuong tien can xoa: ");
            String idXoa = sc.next();
            boolean daXoa = false;
            for (int i = 0; i < listPT.size(); i++) {
                if (idXoa.equalsIgnoreCase(listPT.get(i).getId())) {
                    listPT.remove(i);
                    System.out.println("\nXoa thanh cong!");
                    daXoa = true;
                    break;
                }
            }
            if (!daXoa) {
                System.out.println("\nKhong tim thay phuong tien can xoa!");
            }
            System.out.print("\nBan co muon xoa tiep?(y/n)");
            tiep = sc.next();
        }
    }

    public static void timPT() {
        String tiep = "y";
        while ("y".equalsIgnoreCase(tiep)) {
            sc.nextLine();
            System.out.print("\nNhap hang san xuat de tim (bo trong neu muon tim theo mau): ");
            String timHang = sc.nextLine().trim();
            System.out.print("\nNhap mau de tim (bo trong neu muon tim theo hang): ");
            String timMau = sc.nextLine().trim();
            boolean daTimThay = false;

            for (PhuongTien pt : listPT) {
                if ((!timHang.isEmpty() && timHang.equalsIgnoreCase(pt.getHangSX())) ||
                    (!timMau.isEmpty() && timMau.equalsIgnoreCase(pt.getMau()))) {
                    System.out.println("\nDa tim thay: " + pt);
                    daTimThay = true;
                }
            }
            if (!daTimThay) {
                System.out.println("\nKhong tim thay phuong tien da nhap!");
            }
            System.out.print("\nBan co muon tim tiep?(y/n) ");
            tiep = sc.next();
        }
    }

    public static void xuatTT() {
        for (PhuongTien pt : listPT) {
            System.out.println(pt);
        }
    }
}

