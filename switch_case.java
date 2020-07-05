/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        //variabel
        String hp;
        Scanner scan = new Scanner(System.in);
       
        //input
        System.out.println("konter surya menjual hp samsung mulai dari j1 sampai j5");
        System.out.print("inputkan nama hp : ");
        hp = scan.nextLine();
        
        switch(hp){
            case "samsung j1":
                System.out.println("1.000.000");
                break;
            case "samsung j2":
                System.out.println("1.200.000");
                break;
            case "samsung j3":
                System.out.println("1.500.000");
                break;
            case "samsung j4":
                System.out.println("1.800.000");
                break;
            case "samsung j5":
                System.out.println("2.000.000");
                break;
               
            default:
                System.out.println("input anda salah");           
        }
              
    }
    }        