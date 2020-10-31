/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan20.targetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENGHITUNG TARGET SALDO TABUNGAN
 */

public class PBOIF210119047Latihan20TargetSaldoTabungan {
        public static void targetTabungan(double saldoAwal, double bunga){
            double saldoAkhir = 0; 
            double bungaPerbulan;
            int i = 1;
            
            //Format number
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
            formatRp.setCurrencySymbol("Rp. ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
        
            kursIndonesia.setDecimalFormatSymbols(formatRp);
        
            bungaPerbulan = bunga/100;
            while(saldoAkhir <= 6000000){
                saldoAkhir = (saldoAwal * bungaPerbulan) + saldoAwal;
                System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
                saldoAwal = saldoAkhir;
                i++;
        }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal,bunga;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal : ");
        saldoAwal = input.nextDouble();
        
        System.out.print("Bunga perbulan (%) :");
        bunga = input.nextDouble();
        
        System.out.println("");
        targetTabungan(saldoAwal,bunga);
    }
    
}
