/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author User
 */
public class InterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        InterfaceBujurSangkar obyek1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas bujur sangkar dengan sisi 10: "+obyek1.hitungLuas());
        System.out.println("Keliling: "+obyek1.hitungKeliling());
        System.out.println("\n");
        
        InterfaceBujurSangkar obyek2 = new InterfaceBujurSangkar(6.8){};
        System.out.println("Luas Segitiga dengan alas 6, dan tinggi 8: "+obyek2.hitungLuas());
        System.out.println("Kelilingnya: "+obyek2.hitungKeliling());
    }
    
}
