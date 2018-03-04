/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congresocandidatos;
import java.util.Scanner;
/**
 * Programa que permite visualizar los candidatos al congreso de los diferentes partidos políticos, permite votar por ellos, y muestra al final el total de votos por cada candidato y por el partido y al final muestra el promedio de votantes y el promedio del costo de campaña por partido
 *@version 1.8.0_161,  3 de Marzo del 2018
 * @author Johan Zambrano y Yeferson Patarroyo
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables para asignarle el costo de las campañas
        long costPolo=3000000000L;
        long costLiberal=2000000000L;
        long costVerde=1000000000L;
        long costMira=500000000L;
        //variables utlizadas para los menus
        int votar; //menu para seleccionar al candidato
        int menu;
        //cantidad de votos por cada votante
        int vot1=0,vot2=0,vot3=0,vot4=0,vot5=0,vot6=0,vot7=0,vot8=0,vot9=0;
        //cantidad total de votos por partido
        int votPolo=0,votLiberal=0, votVerde=0, votMira=0;
        //variables para sacar el promedio
        long promPolo,promLiberal,promVerde,promMira;
        int aum=0;//aumento de precio de campaña
        Scanner op=new Scanner(System.in);
        int vot; //guarda el partido por el cual se va a votar
        do{ //este do while va a seguir ejecutando el proyecto hasta que la opcion que seleccione sea 3 que es "salir"
            System.out.println("\tBIENVENIDO");
            do{ 
                System.out.println("1-Votar");
                System.out.println("2-Administrador");
                System.out.println("3-Salir");
                menu=op.nextInt();
            }while(menu>3 || menu<1);
            //creacion de los 9 objetos (9 candidatos) y se le asigna los valores correspondientes que son:
            //Nombre, apellido, numero de identificaion, edad, telefono, direccion, ciudad de nacimiento y el partido al que pertenece
            Candidato obj1=new Candidato("Armando","Ruiz",1023122332,45,768583,"Cll 12","Bogota","Partido Polo");
            Candidato obj2=new Candidato("Felipe","Lopez",102312332,51,239810,"Cra 21","Santa Marta","Partido Polo");
            Candidato obj3=new Candidato("Juan","Páez",145262353,44,982394,"Cll 7","Bucaramanga","Partido Polo");
            Candidato obj4=new Candidato("Luis","Gómez",1438203948,61,281942,"Cra 2","Medellin","Partido Liberal");
            Candidato obj5=new Candidato("Carlos","Bernal",1938491824,39,452415,"Cll 21","Nariño","Partido Liberal");
            Candidato obj6=new Candidato("Ernesto","Vasquez",1648102830,29,957429,"Cra 45","Bogota","Partido Verde");
            Candidato obj7=new Candidato("Diego","Torres",1839401820,45,657302,"Cll 22","Pasto","Partido Verde");
            Candidato obj8=new Candidato("Alex","Bustos",462846391,33,375839,"Cra 32","Medellin","Partido Mira");
            Candidato obj9=new Candidato("Fernando","Camacho",285739712,40,646329,"Cll 5","Bogota","Partido Mira");
            switch(menu){
                case 1: //el usuario selecciono la opcion 1 que es votar
                    do{//revisa que la opcion que ingreso el usuario este dentro del rango establecido
                        System.out.println("Seleccione el partido por el cual desea votar");
                        System.out.println("1-Partido Polo");
                        System.out.println("2-Partido Liberal");
                        System.out.println("3-Partido Verde");
                        System.out.println("4-Partido Mira");
                        vot=op.nextInt();
                    }while(vot>4 || vot<1);
                    metodoPublicidad obj10=new metodoPublicidad();// crea el objeto para llamar la funcion metodoPublicidad de la clase metodoPublicidad
                    switch(vot){ 
                        case 1: //el usuario selecciono el partido polo
                            do{//revisa que la opcion que ingreso el usuario este dentro del rango establecido
                            System.out.println("PARTIDO POLO\n");
                            System.out.println("Candidato #1"+obj1.datosCandidato()); //imprime el candidato 1 del partido con el objeto que se creo anteriormente 
                            System.out.println("\nCandidato #2"+obj2.datosCandidato());//imprime el candidato 2 del partido con el objeto que se creo anteriormente 
                            System.out.println("\nCandidato #3"+obj3.datosCandidato());//imprime el candidato 3 del partido con el objeto que se creo anteriormente 
                            System.out.println("\nEscoja el candidato por el cual va a votar");
                            votar=op.nextInt();
                            }while(votar<1 || votar>3);
                            //esta funcion if va a ir contando los votos de los candidatos del partido polo
                            if(votar==1){ //si ingreso 1 es porque selecciono el candidato 1 
                                vot1=vot1+1; //es un contador,cuenta cuantas veces se voto el candidato 1
                            }else{
                                if(votar==2){//si ingreso 2 es porque selecciono el candidato 2
                                    vot2=vot2+1;//es un contador,cuenta cuantas veces se voto el candidato 2
                                }else{//como el usuario no selecciono ni el candidato 1 ni el 2 significa que voto por el candidato restante que es el 3
                                    vot3=vot3+1;//es un contador,cuenta cuantas veces se voto el candidato 3
                                }
                            }
                            aum=obj10.metodoPublicidad(); //llama la funcion metodoPublicidad() y lo que retorna la guarda en la variable aum
                            costPolo=costPolo+aum; //al costo de la campaña de Polo le suma la cantidad que corresponde respecto al tipo de publicidad que selecciono el usuario
                            votPolo=votPolo+1; //es un contador, cuenta cuantas veces se voto el partido Polo
                        break;    
                        case 2:
                            System.out.println("PARTIDO LIBERAL");
                            do{
                                System.out.println("Candidato #1"+obj4.datosCandidato());
                                System.out.println("\nCandidato #2"+obj5.datosCandidato());
                                System.out.println("\nEscoja el candidato por el cual va a votar");
                                votar=op.nextInt();
                            }while(votar<1 || votar>2);
                            //esta funcion if va a ir contando los votos de los candidatos del partido Liberal
                            if(votar==1){//si ingreso 1 es porque selecciono el candidato 1 
                                vot4=vot4+1;//es un contador,cuenta cuantas veces se voto el candidato 1, en este caso corresponde al candidato 4 en general
                            }else{//como el usuario no selecciono el candidato 1 significa que voto por el candidato restante que es el 2
                                vot5=vot5+1;//es un contador,cuenta cuantas veces se voto el candidato 2, en este caso corresponde al candidato 5 en general
                            }
                            aum=obj10.metodoPublicidad();//llama la funcion metodoPublicidad() y lo que retorna la guarda en la variable aum
                            costLiberal=costLiberal+aum;//al costo de la campaña de Liberal le suma la cantidad que corresponde respecto al tipo de publicidad que selecciono el usuario
                            votLiberal=votLiberal+1;//es un contador, cuenta cuantas veces se voto el partido Polo
                        break;    
                        case 3:
                            System.out.println("PARTIDO VERDE");
                            do{
                                System.out.println("Candidato #1"+obj6.datosCandidato());
                                System.out.println("\nCandidato #2"+obj7.datosCandidato());
                                System.out.println("\nEscoja el candidato por el cual va a votar");
                                votar=op.nextInt();
                            }while(votar<1 || votar>2);
                            //esta funcion if va a ir contando los votos de los candidatos del partido Liberal
                            if(votar==1){//si ingreso 1 es porque selecciono el candidato 1 
                                vot6=vot6+1;//es un contador,cuenta cuantas veces se voto el candidato 1, en este caso corresponde al candidato 6 en general
                            }else{//como el usuario no selecciono el candidato 1 significa que voto por el candidato restante que es el 2
                                vot7=vot7+1;//es un contador,cuenta cuantas veces se voto el candidato 2, en este caso corresponde al candidato 7 en general
                            }
                            aum=obj10.metodoPublicidad();//llama la funcion metodoPublicidad() y lo que retorna la guarda en la variable aum
                            costVerde=costVerde+aum;//al costo de la campaña de Liberal le suma la cantidad que corresponde respecto al tipo de publicidad que selecciono el usuario
                            votVerde=votVerde+1;//cuenta los votos por el partido verde
                        break;    
                        case 4:
                            System.out.println("PARTIDO MIRA");
                            do{
                                System.out.println("Candidato #1"+obj8.datosCandidato());
                                System.out.println("\nCandidato #2"+obj9.datosCandidato());
                                System.out.println("\nEscoja el candidato por el cual va a votar");
                                votar=op.nextInt();
                            }while(votar<1 || votar>2);
                            //esta funcion if va a ir contando los votos de los candidatos del partido Liberal
                            if(votar==1){//si ingreso 1 es porque selecciono el candidato 1 
                                vot8=vot8+1;//es un contador,cuenta cuantas veces se voto el candidato 1, en este caso corresponde al candidato 8 en general
                            }else{//como el usuario no selecciono el candidato 1 significa que voto por el candidato restante que es el 2
                                vot9=vot9+1;//es un contador,cuenta cuantas veces se voto el candidato 2, en este caso corresponde al candidato 9 en general
                            }
                            aum=obj10.metodoPublicidad();//llama la funcion metodoPublicidad() y lo que retorna la guarda en la variable aum
                            costMira=costMira+aum;//al costo de la campaña de Liberal le suma la cantidad que corresponde respecto al tipo de publicidad que selecciono el usuario
                            votMira=votMira+1; //cuenta los votos por partido Mira
                        break;
                    }
                break; //case 1 del switch principal        
                case 2: //el usuario selecciono la opcion del administrador
                    int meA; //variable utlizada para leer el menu del administrador
                    do{
                        System.out.println("Menu Administrador");
                        System.out.println("1-Calculo total de votos por candidato");
                        System.out.println("2-Calculo total de votos por partido");
                        System.out.println("3-Costo promedio por partido político");
                        meA=op.nextInt();
                    }while(meA>3 || meA<1);
                    switch(meA){
                        case 1:
                            //lo que hace es imprimira la informacion de todos los candidatos utilizando los 9 objetos e imprime el total de votos
                            System.out.println("\tCalculo total de votos por candidato"); 
                            System.out.println("Candidato #1\n"+obj1.datosCandidato()); System.out.println("Total votos: "+vot1); 
                            System.out.println("Candidato #2\n"+obj2.datosCandidato()); System.out.println("Total votos: "+vot2);
                            System.out.println("Candidato #3\n"+obj3.datosCandidato()); System.out.println("Total votos: "+vot3);
                            System.out.println("Candidato #4\n"+obj4.datosCandidato()); System.out.println("Total votos: "+vot4);
                            System.out.println("Candidato #5\n"+obj5.datosCandidato()); System.out.println("Total votos: "+vot5);
                            System.out.println("Candidato #6\n"+obj6.datosCandidato()); System.out.println("Total votos: "+vot6);
                            System.out.println("Candidato #7\n"+obj7.datosCandidato()); System.out.println("Total votos: "+vot7);
                            System.out.println("Candidato #8\n"+obj8.datosCandidato()); System.out.println("Total votos: "+vot8);
                            System.out.println("Candidato #9\n"+obj9.datosCandidato()); System.out.println("Total votos: "+vot9);
                        break;
                        case 2:
                            //Imprime el total de votos por partido
                            System.out.println("\tCalculo total de votos por partido");
                            System.out.println("POLO: "+votPolo);
                            System.out.println("LIBERAL: "+votLiberal);
                            System.out.println("VERDE: "+votVerde);
                            System.out.println("MIRA: "+votMira);
                        break;
                        case 3:
                            //imprime el promedio por partido 
                            System.out.println("Costo promedio por partido político");
                            //si la cantidad de votos de los partidos es diferente a 0 es porque se han realizado uno o mas votos
                            //lo que significa que se puede sacar el promedio
                            if(votMira!=0){
                                promMira=costMira/votMira;
                                System.out.println("Mira: "+promMira);
                            }else{
                                System.out.println("El Partido Mira no ha tenido ningun voto");
                            }
                            if(votPolo!=0){
                                promPolo=costPolo/votPolo;
                                System.out.println("Polo: "+promPolo);
                            }else{
                                System.out.println("El Partido Polo no ha tenido ningun voto");
                            }
                            if(votLiberal!=0){
                                promLiberal=costLiberal/votLiberal;
                                System.out.println("Liberal: "+promLiberal);
                            }else{
                                System.out.println("El Partido Liberal no ha tenido ningun voto");
                            }
                            if(votVerde!=0){
                                promVerde=costVerde/votVerde;
                                System.out.println("Verde: "+promVerde);
                            }else{
                                System.out.println("El Partido Verde no ha tenido ningun voto");
                            }
                        break;
                    }// switch del menu del administrador
                break;    
                }//switch del menu principal
        }while(menu!=3);
    }//void
}//class principal