/**
 * Write a description of class Restaurante here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 18-ago-2019
 */
import java.util.Scanner;
public class Restaurante
 {   
  public static void main(String [] args) 
   {
     Scanner teclado = new Scanner(System.in);
// Definicion de variables
    int menu;   
    int a;
    int terminar=1;
    int opcion=2;
    int contador=0;
    int incremento=0;
    int total=0;
    int [] precio=new int [100];
    String [] plato=new String [100];
//    
    System.out.println("------------------------------------------------");
    System.out.println("Guia 2 Actividad 1 Programa 5 Restaurante       ");
    System.out.println("------------------------------------------------");    
    System.out.println("Tipos de Comidas                                ");
    System.out.println("1=vegetarianas, 2=no vegetarianas, 3=rápidas");
 //
    final int []precio1 = {10000,25000,5000};
    final String []opcion1 = {" 1. sopas de vegetales "," 2. ensaladas  "," 3. jugos"};
    
    final int []precio2 = {30000,28000};
    final String []opcion2 = {" 1. bandeja de carne   "," 2. bandeja de pollo"};
    
    final int []precio3 = {5000,7000};
    final String []opcion3 = {" 1. perros calientes   "," 2. hamburguesas"};
    //menu
    while (opcion==2){ 
     System.out.print ("\ndigite una opcion:\n1. vegetarianas\n2. no vegetarianas\n3. rapidas ");
     System.out.print("\ndigite opcion: ");
     menu=teclado.nextInt();
     if (menu==1 ||
         menu==2 ||
         menu==3){
         System.out.println("usted selecciono la opcion ");
     }else{
         System.out.println("opcion errada ");
     }
     opcion=1;
     while (opcion==1){
      if (menu==1){
         System.out.printf ("\nseleccione tipo de plato :\n1. sopa de vegetales $%d\n2. ensalada $%d \n3. jugo $%d " ,precio1[0],precio1[1],precio1[2]);
                                
         System.out.print("\ndigite opcion: ");
         incremento=teclado.nextInt();
         plato[contador]=opcion1[incremento-1];
         precio[contador]=precio1[incremento-1];
         contador=contador+1;
         System.out.print("\ndesea: \n1. otro plato\n2. otro plato de otro menu\n3. terminar ");
         System.out.print("\ndigite opcion: ");
         opcion=teclado.nextInt();
      }else{
           if (menu==2){
            System.out.printf ("\nseleccione tipo de plato :\n1. bandeja de carne $%d\n2. bandeja de pollo $%d\n  ",precio2[0],precio2[1]);
            System.out.print("\ndigite opcion: ");
            incremento=teclado.nextInt();
            plato[contador]=opcion2[incremento-1];
            precio[contador]=precio2[incremento-1];                        
            contador=contador+1;
            System.out.print("\ndesea: \n1. otro plato\n 2. otro plato de otro menu\n3. terminar ");
            System.out.print("\ndigite opcion: ");
            opcion=teclado.nextInt();
           }else{
            if (menu==3){
             System.out.printf ("\nseleccione tipo de plato :\n1. perro caliente $%d\n2. hamburguesa $%d\n  ",precio3[0],precio3[1]);
             System.out.print("\ndigite opcion: ");
             incremento=teclado.nextInt();
             plato[contador]=opcion3[incremento-1];
             precio[contador]=precio3[incremento-1];
             contador=contador+1;
             System.out.print("\ndesea: \n1. otro plato\n2. otro plato de otro menu\n3. terminar ");
             System.out.print("\ndigite opcion: ");
             opcion=teclado.nextInt();
             }
           }
          }
        }
        }
        //Salida Final
        System.out.print ("\nSu Factura será : \n" );
        for (a =0 ; a<(contador);a++){
            System.out.print (plato[a]+" $"+precio[a]+"\n");
        }
        for (a =0 ; a<(contador);a++){
            total=total+precio[a];
        }
        System.out.print("\n TOTAL: "+total+ "\n");
      }    
}    