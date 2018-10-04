/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;



/**
 *
 * @author User
 */
public class UjiManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia laki = new Laki_laki (170, 60);
        System.out.println("Hitung Berat Badan Ideal Untuk Laki-Laki dan Perempuan \n");
        System.out.println("Tinggi Lski-laki: " + laki.TinggiBadan()+"cm");
        System.out.println("Berat Badan Idealnya: "+laki.HtgBBI()+"kg");
        System.out.println();
        
        Manusia pr = new Perempuan (160, 55);
        System.out.println("Tinggi Perempan: "+ pr.TinggiBadan()+"cm");
        System.out.println("Berat Badan Idealnya: "+pr.HtgBBI()+"kg");
    }
    
}
