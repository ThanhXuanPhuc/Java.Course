/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {

    static List<ThiSinh> listTS = new ArrayList<>();
    static ThiSinh ts = null;
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        int chon = 0;
        while (chon != 4) {
            System.out.print("\n=====QUAN LY THI SINH=====");
            System.out.print("\n1. Them thi sinh moi"
                    + "\n2. Hien thi thong tin thi sinh"
                    + "\n3. Tim kiem theo so bao danh"
                    + "\n4. Thoat"
                    + "\nChon hanh dong ban muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    themThiSinh();
                    break;
                case 2:
                    xuatTT();
                    break;
                case 3:
                    timKiemTS();
                    break;
                case 4:
                    System.out.print("\nGoodbye. See you again!");
                    break;
            }
        }
    }

    public static void themThiSinh() {
        String tiep = "y";
        int khoi = 0;
        while ("y".equals(tiep)) {
            
            System.out.print("\nChon khoi thi cua thi sinh(1:A, 2:B, 3:C): ");
            khoi = sc.nextInt();
            System.out.print("\nNhap so bao danh thi sinh: ");
            int sbd = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.print("\nNhap ho ten thi sinh: ");
            String hoTen = sc.nextLine();
            System.out.print("\nNhap dia chi thi sinh: ");
            String diaChi = sc.nextLine();
            
            switch (khoi) {
                case 1:
                    ts = new KhoiA(sbd, hoTen, diaChi);
                    listTS.add(ts);
                    break;
                case 2:
                    ts = new KhoiB(sbd, hoTen, diaChi);
                    listTS.add(ts);
                    break;
                case 3:
                    ts = new KhoiC(sbd, hoTen, diaChi);
                    listTS.add(ts);
                    break;
                default:
                    System.out.println("\nChon khoi ko hop le!");
                    break;
            }
            
            System.out.print("\nBan co muon nhap tiep?(y/n) ");
            tiep = sc.next();
        }
    }

    public static void xuatTT() {
        for (ThiSinh ts : listTS) {
            System.out.println("\nThi sinh: " + ts.getHoTen()
                    + "\nSo bao danh: " + ts.getSbd()
                    + "\nDia chi: " + ts.getDiaChi()
                    + "\nKhoi thi: " + ts.getKhoi()
                    + "\nMon thi: " + ts.getMonThi());
        }
    }
    
    public static void timKiemTS(){
        String tiep = "y";
        while("y".equals(tiep)){
            ThiSinh timThay = null;
            System.out.print("\nNhap so bao danh cua thi sinh muon tim: ");
            int sbdTim = sc.nextInt();
            for (ThiSinh ts : listTS){
                if(ts.getSbd() == sbdTim){
                    timThay = ts;
                }
            }
            if(timThay != null){
                System.out.println("\nDa tim thay: " + timThay.toString());
            }
            else{
                System.out.println("\nKhong tim thay thi sinh nay!");
            }
            System.out.print("\nBan co muon tim tiep?(y/n) ");
            tiep = sc.next();
        }
    }
}