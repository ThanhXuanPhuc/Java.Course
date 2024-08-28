package cauctrucrenhanh;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap02 {
    public static void main(String[] args) {
        // TODO code application logic here
        double toan,van,anh;
        double dtb;
        //buoc 1. Nhap diem toan van anh
        Scanner sc = new Scanner(System.in);
        System.out.println("===Xet hoc luc====");
        System.out.print("cho biet diem toan:");
        toan = sc.nextDouble();
        System.out.print("cho biet diem van:");
        van = sc.nextDouble();
        System.out.print("cho biet diem anh:");
        anh = sc.nextDouble();
        //buoc 2. tinh trung binh
        dtb = (toan+van+anh)/3;
        //b3. Xet hoc luc
        String kq ="";
        if(dtb<=4){
            kq = "Yeu";
        } else if(dtb <= 6.5){
            kq = "Trung binh";
        } else if (dtb < 8 ){
            kq = "Kha";
        } else {
            kq = "Gioi";
        }
        //Buoc 4. Xuat ket qua
        
        System.out.println("Hoc luc:" + kq);
    }
}
