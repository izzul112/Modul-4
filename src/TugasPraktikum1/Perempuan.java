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
public class Perempuan extends Manusia {
    private double TB1;
    private double HtBBI1;

    public Perempuan(double TB1, double HtBBI1) {
        this.TB1 = TB1;
        this.HtBBI1 = HtBBI1;
    }

    @Override
    public double TinggiBadan() {
       return TB1;
    }

    @Override
    public double HtgBBI() {
      return (TB1 - 100)-((TB1 - 100)*0.15);
    }
    
    
}
