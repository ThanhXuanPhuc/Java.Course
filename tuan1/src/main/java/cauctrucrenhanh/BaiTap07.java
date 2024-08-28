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
public class BaiTap07 {
    public static void main(String[] args) {
        //TODO code application login here
        int Thang,nam;
        int songay;
        
        Scanner sc = new Scanner (System.in);
            //b1. Đọc tháng, năm từ người dùng
            System.out.println("===CHUONG TRINH TINH SO NGAY CUA THANG===");
            System.out.print("Cho biet thang: ");
            Thang = sc.nextInt();
            System.out.print("Cho biet nam: ");
            nam = sc.nextInt();
            
            //b2. Xét tháng của năm để tính số ngày
            if (Thang ==1 || Thang==3 || Thang==5 || Thang==7 || Thang==8 || Thang==10 || Thang==12 ){
            songay=31;
            
        } else if (Thang==4 || Thang==6 || Thang==9 || Thang==11){
            songay=30;
        }else {
            if(nam% 4==0){
                songay = 29;
            } else {
                songay = 28;
            }
        }
        //b3. Xuất kết quả
        System.out.println("Thang" + Thang + "co" + songay + "ngay");
        }
    }

