/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : Program ini berisi tentang mengganti kata dalam sebuah
 *                     kalimat
 */
public class IF110118030Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String a = sc.nextLine();
        System.out.print("Ganti Kata : ");
        String awal = sc.next();
        System.out.print("Menjadi Kata : ");
        String baru = sc.next();
        String b = a.replace(awal, baru);
        System.out.println("");
        System.out.println("========Hasil Formatting=======");
        System.out.println("Kalimat awal : "+a);
        System.out.println("Kalimat baru : "+b);
    }
    
}
