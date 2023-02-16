/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import sun.applet.Main;

/**
 *
 * @author LURY
 */
public class motor {
    
     String namePabrikan;
     String model;
     String bahanBakar;
     String color;
     int tahun;
    
    public motor(String namaPabrik,String modelPabrikan,String jenisBahanBakar,String warna,int tahunPembuatan){
       this.namePabrikan = namaPabrik;
        this.model = modelPabrikan;
        this.bahanBakar = jenisBahanBakar;
        this.color = warna;  
        this.tahun = tahunPembuatan;
    }
    
    public static void main(String[] args){
       motor motor = new motor("Honda", "Vario 125", "Bensin", "Hitam", 2022);
       
        System.out.println(motor.namePabrikan);
        System.out.println(motor.namePabrikan + motor.bahanBakar);
         System.out.println(motor.namePabrikan + motor.bahanBakar + motor.color);
    }
}
