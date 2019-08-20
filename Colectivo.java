/**
 * Write a description of class Colectivo here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 18-ago-2019
 */
import java.util.Scanner;
import java.lang.Math;
public class Colectivo
{
    public static void main (String [] args)
    {
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        // declarar variables
        double n_personas;
        double n_viajes;
        double personas_bus;
        double dinero_total_personas, dinero_total_conductor;
        System.out.println("------------------------------------------------");
        System.out.println("Guia 2 Actividad 1 Programa 3 Colectivo");
        System.out.println("------------------------------------------------");        
        // Solicitar datos de entrada
        System.out.println("N° de Personas que puede llevar el Bus: ");
        personas_bus= teclado.nextDouble();
        // valido capacidad del bus ingresada
        if (personas_bus >= 0){
            System.out.println("la capacidad del bus es " + personas_bus);
        }else{
            System.out.println("ingrese capacidad valida ");
        }            
        System.out.println("Cantidad de Personas a Llevar         : ");
        n_personas= teclado.nextDouble();
        // valido Cantidad de personas ingresada
        if (n_personas >= 0){
            System.out.println("La Cantidad de personas a transportar es " + n_personas);
        }else{
            System.out.println("Ingrese una cantidad de personas valida ");
        }
        //numero de viajes a realizar
        if (n_personas >= personas_bus){
            n_viajes = n_personas / personas_bus;
        }else{ 
            n_viajes=1;
        }
        //numero de galones a usar
        dinero_total_personas  = (n_personas * 10000);
        dinero_total_conductor = (n_viajes * 2000);
        System.out.println("El total de viajes es............: " + n_viajes);
        System.out.println("El costo total de los pasajes es.: " + dinero_total_personas);
        System.out.println("El dinero total del conductor es.: " + dinero_total_conductor);
    }
}