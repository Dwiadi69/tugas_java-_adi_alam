 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;

/**
 *
 * @author N
 */
public class If_Else {
    public static void main(String[] args) {
        // variabel
        int Pemenang;
        String nama;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("pemenang: ");
        Pemenang = scan.nextInt();
        
        if(Pemenang <=1) {
            System.out.println(nama+" SELAMAT, kamu pemenang sepeda motor CB250cc,"
                    + " dan di potong pajak !!");
        }else{
            System.out.println(nama+" silakan pembeli di Jayamotor kami");}
    }
}