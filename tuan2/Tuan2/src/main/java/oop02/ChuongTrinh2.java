/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop02;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh2 {
    public static void main(String[] args) {
        Account ac1,ac2;
        
//        DecimalFormat fmt = new DecimalFormat("#.##0");
//        //tao doi tuong ac1: 
        ac1 = new Account("AC001","Xuan Phuc", 5000000);
        
        //tao doi tuong ac2: 
        ac2 = new Account("AC002","Minh Hoàng", 2500000);
        
        System.out.println("----------THONG TIN TAI KHOAN BAN DAU------------");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + ac1.getBalance());
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + ac2.getBalance());
        
        ac1.credit(500000);
        ac2.credit(10000000);
        
        System.out.println("----------THONG TIN TAI KHOAN SAU GIAO DICH RUT,GUI TIEN------------");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + ac1.getBalance());
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + ac2.getBalance());
        
        ac1.tranferTo(ac2, 5500000);
        
        System.out.println("----------THONG TIN TAI KHOAN GIAO DICH CHUYEN KHOAN------------");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + ac1.getBalance());
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + ac2.getBalance());
    }
}
