/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt02;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien{
    
    public double java;
    public  double css;
    public double html;

    public SinhVienIT(String hoTen, double java, double css, double html) {
        super(hoTen, "IT");
        this.java = java;
        this.css = css;
        this.html = html;
    }
    
    @Override
    public double getDiem(){
        return (java*2 + html+css)/4;
    }
}
