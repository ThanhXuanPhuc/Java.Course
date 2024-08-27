/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt06;

/**
 *
 * @author ADMIN
 */
public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai(String id, String hangSX, String mau, int namSX, double giaBan, double trongTai) {
        super(id, hangSX, mau, namSX, giaBan);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", trongTai=" + trongTai + " }";
    }
}
