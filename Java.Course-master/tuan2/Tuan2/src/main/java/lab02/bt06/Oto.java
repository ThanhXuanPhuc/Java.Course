/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt06;

/**
 *
 * @author ADMIN
 */
public class Oto extends PhuongTien {
    private int soChoNgoi;
    private String dongCo;

    public Oto(String id, String hangSX, String mau, int namSX, double giaBan, int soChoNgoi, String dongCo) {
        super(id, hangSX, mau, namSX, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.dongCo = dongCo;
    }

    @Override
    public String toString() {
        return super.toString() + ", soChoNgoi=" + soChoNgoi + ", dongCo=" + dongCo + " }";
    }
}
