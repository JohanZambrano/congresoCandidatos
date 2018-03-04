/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congresocandidatos;
import java.util.Scanner;
/**
 * Selecciona la publicidad que mas lo influencio y retorna 
 * @version 1.8.0_161,  3 de Marzo del 2018
 * @author Johan Zambrano y Yeferson Patarroyo
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
        switch(pu){
            case 1:
                pu=200000; //le da el valor de television que son 200000
            break;    
            case 2:
                pu=150000;//le da el valor de radio que son 150000
            break;    
            case 3:
                pu=10000;//le da el valor de internet que es 10000
            break;    
        }
        return pu;//retorna el valor correspondiente
    }
}