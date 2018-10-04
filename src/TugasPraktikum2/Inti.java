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
public class Inti implements Kalkulator {

    private double a1;
    private double a2;

    public Inti(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double Penjumlahan() {
        return a1 + a2;
    }

    @Override
    public double Pengurangan() {
        return a1 - a2;
    }

    @Override
    public double Perkalian() {
        return a1 * a2;
    }

    @Override
    public double Pembagian() {
        return a1 / a2;
    }

}
