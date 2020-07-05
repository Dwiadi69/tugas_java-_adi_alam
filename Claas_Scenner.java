/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 *
 * @author LENOVO 330
 */
public class Claas_Scenner {
    
 public static void main(String[] args) throws IOException {
        
        String nama = "";
        String dusun, desa, kec, kab = "";
        int rt;
        int rw;
        double rumah;
        
         InputStreamReader isr = new InputStreamReader(System.in);
        
         BufferedReader br = new BufferedReader(isr);
     
        // Pertanyaan 
        System.out.println("dengan atas nama siapa ?");
        nama = br.readLine();
        
        System.out.println("dimana dusun anda ?");
        dusun = br.readLine();
        
        System.out.println("dimana desa anda ?");
        desa = br.readLine();
        
        System.out.println("dimana kecamatan anda ?");
        kec = br.readLine();
        
        System.out.println("dimana kabupaten anda ?");
        kab = br.readLine();
        
        System.out.println("dimana RT anda ?");
        Scanner inputUser = new Scanner(System.in);
        rt = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("dimana RW anda ?");
         inputUser = new Scanner(System.in);
        rw = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa nomer rumah anda ?");
         inputUser = new Scanner(System.in);
        rumah = Integer.parseInt(inputUser.nextLine());
        
        // tampilan
        System.out.println("nama :" + nama);   
        System.out.println("dusun :" + dusun); 
        System.out.println("desa :" + desa); 
        System.out.println("kecamatan :" + kec); 
        System.out.println("kabupaten :" + kab); 
        System.out.println("rt :" + rt); 
        System.out.println("rw :" + rw); 
        System.out.println("Nomer rumah :" + rumah); 
        
    }
}

