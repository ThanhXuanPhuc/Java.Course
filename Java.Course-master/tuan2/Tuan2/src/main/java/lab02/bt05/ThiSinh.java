/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt05;

/**
 *
 * @author ADMIN
 */
public class ThiSinh {
    int sbd;
    String hoTen, diaChi, khoi, monThi;

    public ThiSinh(int sbd, String hoTen, String diaChi, String khoi, String monThi) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.khoi = khoi;
        this.monThi = monThi;
    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    @Override
    public String toString() {
        return "ThiSinh{ " + "sbd: " + sbd + ", hoTen: " + hoTen + ", diaChi: " + diaChi + ", khoi: " + khoi + ", monThi: " + monThi + " }";
    }
}