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
public class BaiTap04 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("===NHAP VAO MOT SO NGUYEN===");
        System.out.println("Nhap so nguyen:");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("So ban nhap la so chan:");
        } else {
            System.out.println("So ban nhap la so le: ");
        }
    }
}
