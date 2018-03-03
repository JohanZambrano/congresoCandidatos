/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congresocandidatos;
import java.util.Scanner;
/**
 *
 * @author Johan Zambrano
 */
public class metodoPublicidad {
    int metodoPublicidad(){
        Scanner l=new Scanner(System.in);
        int pu;
        do{
            System.out.println("Cual fue el metodo publicitario que mas lo influencio");
            System.out.println("1-Television");
            System.out.println("2-Radio");
            System.out.println("3-Internet");
            pu=l.nextInt();
        }while(pu>3 || pu<1);        
        return pu;
    }
}