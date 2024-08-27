/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt06;

/**
 *
 * @author ADMIN
 */
public class PhuongTien {
    private String id, hangSX, mau;
    private int namSX;
    private double giaBan;

    public PhuongTien(String id, String hangSX, String mau, int namSX, double giaBan) {
        this.id = id;
        this.hangSX = hangSX;
        this.mau = mau;
        this.namSX = namSX;
        this.giaBan = giaBan;
    }

    // Getter, Setter và phương thức toString()
    
    @Override
    public String toString() {
        return "PhuongTien{" + "id=" + id + ", hangSX=" + hangSX + ", mau=" + mau + ", namSX=" + namSX + ", giaBan=" + giaBan + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
}

