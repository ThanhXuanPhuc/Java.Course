/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt01;

/**
 *
 * @author ADMIN
 */
public class Vuong extends  ChuNhat{
    
    public Vuong (double canh){
        super(canh, canh);
    }
    
    @Override
    public void Xuat(){
        System.out.println("Vuong [canh=" + super.dai +", dien tich:" + super.getDienTich() + ", chu vi:" + super.getChuVi());
    }
}
