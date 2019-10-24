/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan62.livingthing;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human H = new Human();
        System.out.print("Masukan Nama Anda : ");
        Scanner a = new Scanner(System.in);
        String nm = a.nextLine();
        H.setNama(nm);
        System.out.println("");
        H.walk(H.getNama());
        H.breath(H.getNama());
        H.eat(H.getNama());
        
    }
    
}
