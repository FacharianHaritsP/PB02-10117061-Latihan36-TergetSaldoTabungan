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
 * Deskripsi program: Menampilkan perhitungan target saldo 
 *                     berdasarkan objek orientasi
 * 
 */
public class PB0210117061Latihan36TergetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Perhitungan jembatan = new Perhitungan();
        for (int i = 1; i <= 8; i++) {
            System.out.println("Saldo bulan ke-" + i + " Rp."
                    + jembatan.hitung());
        }
    }

}
