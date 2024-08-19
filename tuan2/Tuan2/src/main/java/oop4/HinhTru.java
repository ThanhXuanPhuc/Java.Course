/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop4;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron{
    //Khai bao du lieu
    private double chieucao;
    
    //Dinh nghia phuong thuc

    public HinhTru() {
        super();//gọi constructor của lớp trên
        chieucao=1.0;
    }

    public HinhTru(double bankinh, double chieucao) {
        super(bankinh);
        this.chieucao=chieucao;
    }    
    
    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    
    @Override
    public double tinhDienTich(){
        //dien tich = ?
        return 2*super.tinhDienTich() + super.tinhChuVi()*chieucao;
    }
    
    public double tinhTheTich(){
        //the tich = ?
        return super.tinhDienTich()*chieucao;
    }
    
    
    
    
    
    
    
    
}
