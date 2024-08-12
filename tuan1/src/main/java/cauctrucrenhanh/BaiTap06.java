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
public class BaiTap06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập 2 số nguyên từ bàn phím
        System.out.print("Nhap so nguyen thu nhat: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int so2 = sc.nextInt();

        // Nhập phép toán
        System.out.print("Nhap phep toan (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Thực hiện phép toán
        switch (operator) {
            case '+':
                System.out.println("Ket qua: " + (so1 + so2));
                break;
            case '-':
                System.out.println("Ket qua: " + (so1 - so2));
                break;
            case '*':
                System.out.println("Ket qua: " + (so1 * so2));
                break;
            case '/':
                if (so2 != 0) {
                    System.out.println("Ket qua: " + ((double) so1 / so2));
                } else {
                    System.out.println("Khong the chia cho 0!!");
                }
                break;
            default:
                System.out.println("Phep toan khong hop le!");
        }
    }
    

    }

