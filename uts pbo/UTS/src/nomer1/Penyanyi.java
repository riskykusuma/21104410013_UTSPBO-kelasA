/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

/**
 *
 * @author Administrator
 */

public class Penyanyi extends Pop {
    
    // MAIN CODE
    public static void main(String[] args) {
        
        // OBJECT
        Pop pop = new Pop("Black Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        // PANGGIL METHOD OBJECT
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        // VARIABEL
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        
        // PANGGIL METHOD DENGAN OBJECT
        dangdut.song( "Kopi Dangdut");
        dangdut.cetakLabel();
    }
}
