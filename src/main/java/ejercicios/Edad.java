
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // TODO: Coloca aquí el código del ejercicio 6: Edad
        LocalDate currentDate = LocalDate.now();
        int dia_actual = currentDate.getDayOfMonth();
        int mes_actual = currentDate.getMonthValue();
        int anno_actual = currentDate.getYear();
        int edad = anno_actual - anno;
        
        if (mes == mes_actual){
            if(dia == dia_actual){
                String respuesta = "Usted tiene "+ edad + " años";
                return respuesta;
            }else if (dia < dia_actual){
                 String respuesta = "Usted acaba de cumplir "+ edad + " años";
                 return respuesta;
            }else if(dia > dia_actual){
                String respuesta = "Usted acaba de cumplir "+ edad + " años";
                return respuesta;
            }
        }else if(mes < mes_actual){
            if(dia == dia_actual){
                String respuesta = "Cumpliste "+ edad + " años";
                return respuesta;
            }else if (dia < dia_actual){
                 String respuesta = "Cumpliste "+ edad + " años";
                 return respuesta;
            }else if(dia > dia_actual){
                String respuesta = "Cumpliste "+ edad + " años";
                return respuesta;
            }
        }else if(mes > mes_actual)
            if(dia == dia_actual){
                String respuesta = "Vas a cumplir "+ edad + " años";
                return respuesta;
            }else if (dia < dia_actual){
                 String respuesta = "Vas a cumplir "+ edad + " años";
                 return respuesta;
            }else if(dia > dia_actual){
                String respuesta = "Vas a cumplir "+ edad + " años";
                return respuesta;
            }
        
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
