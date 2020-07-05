/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author N
 */
public class If {
    public static void main(String[] args) {
        int Nilai = 80;
        if (Nilai>=70){
         System.out.println("Selamat anda lulus..!!");
        
           if(Nilai>=90){
               System.out.println("Nilai kamu A");
           }else if(Nilai>=80){
               System.out.println("Nilai kamu B");
           } else {
               System.out.println("Nilai kamu C");
           } 
        }else {
            System.out.println("Anda tidak Lulus");
        } 
        }
    }
