/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert1.pkg10118046.latihan6.kambingstatic.konstanta;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menampilkan akses langsung variabel static yang ada pada class yang berbeda
 */



public class PBO2PERT110118046Latihan6KambingStaticKonstanta {
    
    public static final String NAMA_KAMBING = "Midun";
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
        // TODO code application logic here
    }
}
