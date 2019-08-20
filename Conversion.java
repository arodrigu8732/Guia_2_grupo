/**
 * Write a description of class Conversion here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 18-ago-2019
 */
/* convertir de unidades a pulgadas
1 pulgada equivale a 0.0833 pies, 
1 pulgada equivale a 2.54 centímetros, 
1 legua equivale a 190080.02 pulgadas 
1 yarda son 36 pulgadas. */
import java.util.Scanner;
import java.lang.String;
import java.util.Objects;
public class Conversion
{  public static void main(String [] args)
   {
       //asociar teclado al programa
       Scanner teclado = new Scanner(System.in);
       //declarar variables
       String unidad_de_medida;
       double numero_a_convertir;
       double numero_convertido;    
       //*
       // pantalla inicial
       System.out.println("------------------------------------------------");
       System.out.println("Guia 2 Actividad 1 Programa 1 Conversion Medidas");
       System.out.println("------------------------------------------------");
       // captura deato de medida a procesar
       System.out.println("Ingrese Unidad de Medida Solo Letras c=Centímetro - p=Pies - y=Yardas - l=Leguas");
       unidad_de_medida = teclado.next(); 
       // valida dato de medida
       if ((unidad_de_medida == "p") ||
           (unidad_de_medida == "c") ||
           (unidad_de_medida == "l") ||
           (unidad_de_medida == "y")){
            System.out.println("Unidad a convertir " + unidad_de_medida);
        }else{
            System.out.println("Unidad ingresada errada");
        }
       // captura medida a convertir
       System.out.println("Ingrese Valor a Convertir: ");
       numero_a_convertir = teclado.nextDouble();
       if (numero_a_convertir >= 0){
           System.out.println("Valor a convertir " + numero_a_convertir);
        }else{
           System.out.println("Valor ingresado errado");
        }
       //operaciones
       String p="p";
       String c="c";
       String l="l";
       String y="y";
       if (Objects.equals(unidad_de_medida, p)){
           numero_convertido = 0.0833 / numero_a_convertir ;
           System.out.println(numero_a_convertir + "pies son " + numero_convertido + " pulgadas" ); 
        }else
         if(Objects.equals(unidad_de_medida, c)){
            numero_convertido = 2.54 / numero_a_convertir;
            System.out.println(numero_a_convertir + "centimetros son " + numero_convertido + " pulgadas" ); 
        }else 
          if(Objects.equals(unidad_de_medida, l)){
             numero_convertido = 190080.02 / numero_a_convertir; 
             System.out.println(numero_a_convertir + "leguas son " + numero_convertido + " pulgadas" );
          }else 
           if(Objects.equals(unidad_de_medida, y)){
              numero_convertido = 36 / numero_a_convertir;
              System.out.println(numero_a_convertir + "yardas son " + numero_convertido + " pulgadas" ); 
            }
       }
    }