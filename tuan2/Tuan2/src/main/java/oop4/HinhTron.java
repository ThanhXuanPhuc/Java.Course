/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop4;

/**
 *
 * @author ADMIN
 */
public class HinhTron extends Object{
    //Khai bao du lieu
    private double bankinh;
    //Dinh nghia cac phuong thuc
    
    public HinhTron(){
        bankinh=1.0;
    }

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double tinhDienTich(){
        return Math.PI*bankinh*bankinh;
    }

   public double tinhChuVi(){
       return Math.PI*2*bankinh;
   }

    @Override
    public String toString() {
        return "HinhTron{" + "bankinh=" + bankinh + ", Dien tich:" + tinhDienTich() + 
                        ", Chu vi: " + tinhChuVi() + '}';
    }
    
   
}
