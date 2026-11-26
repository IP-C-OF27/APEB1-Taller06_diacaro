import java.util.Scanner;
import java.util.Random;
/**
 * Ejercicio 01: "Dada la dinámica de juego computacional, programar una
 * solución que genere un número entero aleatorio entre 1-N, y solicite al
 * usuario lo adivine; dé pistas si es que el usuario falla, advirtiendo la
 * cantidad de intentos restantes. Si es que no logra adivinar, muestre el
 * mensaje "GAME OVER"."
 * @author David Acaro
 * @version 1.0
 */
public class Ejercicio01_AdivinaNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int numAle = ale.nextInt(21);
        int numAdv = 0, intentos = 1;
        System.out.println("Pienso en Num (0-20), adivina: ");
        while(intentos <= 3){
            numAdv = tcl.nextInt();
            if (numAdv == numAle)
            {
                System.out.println("Bien, adivinaste");
                break;
            }
            else
                if (numAle > numAdv)
                    System.out.println("Mal, es mayor!!!!");
                else
                    System.out.println("Mal, es menor");
            intentos++;
        }
        if (numAdv != numAle)
            System.out.println("GAME OVER");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Pienso en Num (0-20), adivina: 
8
Mal, es mayor!!!!
10
Mal, es menor
9
Bien, adivinaste
BUILD SUCCESSFUL (total time: 9 seconds)
 */