/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author User
 */
public class UjiKalkulator {

    public static void main(String[] args) {
        Inti scan = new Inti(100, 5);

        System.out.println("Kalkulator Java");
        System.out.println("Penjumlahan, Pengurangan, Perkalian, Pembagian\n");
        System.out.println("Hasil Penjumlahan dari 100 + 5 adalah: " + scan.Penjumlahan());
        System.out.println("");
        System.out.println("Hasil Pengurangan dari 100 - 5 adalah: " + scan.Pengurangan());
        System.out.println("");
        System.out.println("Hasil Perkalian   dari 100 x 5 adalah: " + scan.Perkalian());
        System.out.println("");
        System.out.println("Hasil Pembagian   dari 100 : 5 adalah: " + scan.Pembagian());
    }
}
