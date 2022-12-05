/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

/**
 *
 * @author Administrator
 */
public class Pop {
    
    // VARIABEL
    public String penyanyi = "Raisa";
    public String lagu = "Kali Kedua";
    
    // KONSTRAKTOR TANPA PARAMETER
    Pop(){
    
    }
    
    // KONTRUCTOR DENGAN 2 PARAMETER (Overloading)
    Pop(String penyanyi, String lagu) {
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }
    
    
    // METHOD
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    protected void song (String lagu) {
        this.lagu = lagu;
    }
    
    public void cetakLabel(){
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }
    
}
