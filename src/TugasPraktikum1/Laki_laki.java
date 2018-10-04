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
public class Laki_laki extends Manusia {
    private double TB;
    private double HtBBI;
     
    public Laki_laki(double TB, double HtBBI){
        this.TB = TB;
        this.HtBBI = HtBBI;
    }

    @Override
    public double TinggiBadan() {
        return TB;
    }

    @Override
    public double HtgBBI() {
       return (TB - 100)-((TB - 100)*0.1);
    }
        
}
