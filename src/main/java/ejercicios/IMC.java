
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int peso, double estatura, int edad) {
        // Se crea la variable que contiene el indice de masa corporal
        double imc = peso / Math.pow(estatura, 2);
        
        // Condicionales que me validad el nivel de risgo de enfermedades coronarias
        if(edad < 45 && imc < 22){
            // Mensaje de respuesta de su validez
            String respuesta = "Bajo";
            return respuesta;
        }else if(edad < 45 && imc >= 22){
            // Mensaje de respuesta de su validez
            String respuesta = "Medio";
            return respuesta;
        }else if(edad >= 45 && imc < 22){
            // Mensaje de respuesta de su validez
            String respuesta = "Medio";
            return respuesta;
        }else if(edad >= 45 && imc >= 22){
            // Mensaje de respuesta de su validez
            String respuesta = "Alto";
            return respuesta;
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
