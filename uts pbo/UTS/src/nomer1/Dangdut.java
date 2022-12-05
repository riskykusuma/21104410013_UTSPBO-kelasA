/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

/**
 *
 * @author Administrator
 */
public class Dangdut {
    
    // VARIABEL
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    // KONSTRAKTOR
    Dangdut(){
        
    }
    
    // METHOD
    void singer (String penyanyi) {
        this.penyanyi = penyanyi;
    }
    
    public void song (String lagu){
        this.lagu = lagu;
    }
    
    void cetakLabel() {
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }
}
