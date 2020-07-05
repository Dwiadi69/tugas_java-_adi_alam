/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO 330
 */
public class Class_BufferedReader {
    

 public static void main(String[] args) throws IOException {
        
    

        
        String nama ;
        int nomer ;
        String merek ;
        double tinggi;
        String kendaraan = "";
        

        // Object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
            
        // object BufferedReader
        BufferedReader br = new BufferedReader (isr);
        
        // pertayaan
        System.out.println("siapa nama anda ?");
        nama = br.readLine();
        
        System.out.println("berapa nomer telipon ?");
        nomer  = Integer.parseInt(br.readLine());
        
        System.out.println("apa gaged anda ?");
        merek = br.readLine();
        
        System.out.println("berapa tinggi badan anda ?");
        double Tinggi = Double.parseDouble(br.readLine());
        
        System.out.println("apa kendaraan anda ?");
        String Kendaraan = br.readLine();
        
        // tampilan
        System.out.println("nama anda adalah " + nama);
        System.out.println("nomer telipon anda adalah " + nomer);
        System.out.println("gaged anda adalah " + merek);
        System.out.println("tinggi badan anda adalah " + Tinggi);
        System.out.println("kendaraan anda adalah " + kendaraan);
    }
}
