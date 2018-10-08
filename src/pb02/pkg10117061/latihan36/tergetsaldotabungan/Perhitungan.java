/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan36.tergetsaldotabungan;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan perhitungan terget 
 *                    saldo berdasarkan objek orientasi
 * 
 */
public class Perhitungan {
  
    public double saldoAwal = 3500000;
    public double j ;
    
    public double hitung(){
    
            j =  saldoAwal * 0.08;
            saldoAwal = saldoAwal + j;
            
        return saldoAwal;
    }
    
}
