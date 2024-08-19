/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop02;

/**
 *
 * @author ADMIN
 */
public class Account {
    //khai báo thành phần dữ liệu
    private String id;
    private String name;
    private int balance;
    
    public Account(String id,String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void credit (int amount){
        balance += amount;
    }
    
    public void dedit(int amount){
        if (balance >= amount){
            balance -= amount;

        } else{
            System.out.print("Giao dich rut tien that bai");
        }
    }
    public void tranferTo(Account other, int amount){
        if (balance >= amount){
            balance -= amount;
            other.balance  += amount;
        } else{
            System.out.print("Giao dich chuyen khoan that bai");
        }
    }
}
