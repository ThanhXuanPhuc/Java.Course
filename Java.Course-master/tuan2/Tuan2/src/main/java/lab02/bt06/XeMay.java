/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt06;

/**
 *
 * @author ADMIN
 */
public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(String id, String hangSX, String mau, int namSX, double giaBan, double congSuat) {
        super(id, hangSX, mau, namSX, giaBan);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", congSuat=" + congSuat + " }";
    }
}

