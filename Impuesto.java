/**
 * Write a description of class Impuesto here. 
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 18-ago-2019
 */
import java.util.Scanner;
import java.lang.String;
import java.util.Objects;
public class Impuesto
{
    public static void main(String [] args)
    {
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        // declarar variables
        String tipo_de_vehiculo;
        double precio_bruto;
        double impuesto;
        System.out.println("------------------------------------------------"); 
        System.out.println("Guia 2 Actividad 1 Programa 4 Calculo Impuesto  ") ;
        System.out.println("------------------------------------------------");        
        // Solicitar datos de entrada
        System.out.println("Ingrese tipo de vehículo  c=Camioneta - a = Automóvil");
        tipo_de_vehiculo = teclado.next();
        // valido el tipo de vehiculo ingresado
        if (tipo_de_vehiculo == "a" ||
            tipo_de_vehiculo == "c" ){
            System.out.println("Tipo de vehiculo a procesar " + tipo_de_vehiculo );
        }else{
            System.out.println("Tipo de vehiculo no valido ");
        }
        System.out.println("Ingrese precio bruto: ");
        precio_bruto = teclado.nextDouble();
        // valido el precio bruto del vehiculo
        if (precio_bruto >=0){
            System.out.println("el precio bruto ingresado en " + precio_bruto);
        }else{
            System.out.println("el precio bruto ingresado esta errado ");
        }
        //operaciones 
        String c="c";
        String a="a";
        if (Objects.equals(tipo_de_vehiculo, c) && (precio_bruto < 80))
        {   impuesto = 0;
            System.out.println("El impuesto será " + impuesto);
        }else if(Objects.equals(tipo_de_vehiculo, c) && (precio_bruto >= 80))
        {   impuesto = precio_bruto / 2;
            System.out.println("El impuesto será " + impuesto);
        }else if(Objects.equals(tipo_de_vehiculo, a) && (precio_bruto <= 20))
        {   impuesto = 5;
            System.out.println("El impuesto será " + impuesto);
        }else if(Objects.equals(tipo_de_vehiculo, a) && (20 < precio_bruto)&&( precio_bruto < 40))
        {   impuesto = precio_bruto / 5;
            System.out.println("El impuesto será " + impuesto);
        }else if(Objects.equals(tipo_de_vehiculo, a) &&( precio_bruto <= 40))
        {   impuesto = 9;
            System.out.println("El impuesto será " + impuesto);
        }else{
            System.out.println("Ingreso mal el dato por favor confirmar");
        }
    }
}

