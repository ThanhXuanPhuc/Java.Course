/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop03;

/**
 *
 * @author ADMIN
 */
public class SanPham {

  private String ten;
  private double gia;
    
  public SanPham(String ten, double gia){
      this.ten = ten;
      this.gia=gia;
  }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }
  
}
