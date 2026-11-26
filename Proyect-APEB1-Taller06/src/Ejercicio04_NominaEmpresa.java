import java.util.Scanner;
/**
 * Ejercicio 04: "Realizar un programa Java que permita pedir por teclado el
 * nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, 
 * numero de días trabajados y costo del día trabajo. Calcular el valor a 
 * cancelar por la empresa para cada empleado. Presentar un reporte como el 
 * siguiente: 
 * NOMBRE	NUMERO DE DÍAS TRABAJADO COSTO DEL DÍA	CANTIDAD A CANCELAR
 * Nombre 1	10	            $2.5	              $25
 * Nombre 2	11	            $2	                      $22
 * Nombre 3	9	            $3	                      $27
 * Nombre 4	5	            $4	                      $20
 * Nombre 5	12	            $2	                      $24"
 * @author David Acaro
 * @version 1.0
 */
public class Ejercicio04_NominaEmpresa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, reporte = "NOMBRE\tDIAS\tCOSTO DEL DIA\tCANTIDAD A " + 
                "CANCELAR\n";
        int dias;
        double costo, pagar;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nombre: ");
            nombre = tcl.next();
            System.out.print("Días trabajados: ");
            dias = tcl.nextInt();
            System.out.print("Costo del día: ");
            costo = tcl.nextDouble();
            pagar = dias * costo;
            reporte += nombre + "\t" + dias + "\t$" + costo + "\t\t$" + pagar 
                    + "\n";
        }
        System.out.println(reporte);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Nombre: Jose
D�as trabajados: 10
Costo del d�a: 2,5
Nombre: Carlos
D�as trabajados: 11
Costo del d�a: 2
Nombre: Miguel
D�as trabajados: 9
Costo del d�a: 3
Nombre: Joaquin
D�as trabajados: 5
Costo del d�a: 4
Nombre: Fernando
D�as trabajados: 12
Costo del d�a: 2
NOMBRE	DIAS	COSTO DEL DIA	CANTIDAD A CANCELAR
Jose	10	$2.5		$25.0
Carlos	11	$2.0		$22.0
Miguel	9	$3.0		$27.0
Joaquin	5	$4.0		$20.0
Fernando	12	$2.0		$24.0
BUILD SUCCESSFUL (total time: 1 minute 49 seconds)
 */