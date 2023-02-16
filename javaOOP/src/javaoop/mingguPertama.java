/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author LURY
 */
public class mingguPertama {

    public mingguPertama(String pabrik,int modelMotor,String bahanBakarMotor,String colorMotor){
        namePabrikan = pabrik;
         model = modelMotor;
         bahanBakar = bahanBakarMotor;
         color = colorMotor;
    }
    
    static String namePabrikan;
    static int model;
    static String bahanBakar;
    static String color;
    
    
    public static void main(String[] args) {
        mingguPertama.bahanBakar = "Bensin";
        
        
    }
   
}

