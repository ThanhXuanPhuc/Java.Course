package dieukhienlap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap08 {
    public static void main(String[] args) {
       //TODO code application login here
       int n;
       int sum=0;
       
       Scanner sc = new Scanner (System.in);
       //b1. Nhap he so a,b
       System.out.println("====Tinh tong day so: n=1+2+3+ ... + n =====");
       System.out.print("Cho biet so n: ");
       n = sc.nextInt();
       for(int i = 1; i<=n;i++){
           sum +=1;
       }
       System.out.println("Tong day so: " + sum);
    }
}
