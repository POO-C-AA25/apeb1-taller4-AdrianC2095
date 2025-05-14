import java.util.Scanner;
public class Problema2_EjecutorNomina {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombreEmpleado = scanner.nextLine();

            System.out.print("Ingrese el salario del empleado: ");
            double salarioEmpleado = scanner.nextDouble();

            System.out.print("Ingrese la edad del empleado: ");
            int edadEmpleado = scanner.nextInt();

            Empleado empleado1 = new Empleado(nombreEmpleado, salarioEmpleado, edadEmpleado);

            System.out.println("\nInformacion del empleado: ");
            System.out.println(empleado1);

            System.out.print("\nIngrese el porcentaje de aumento salarial: ");
            double porcentajeAumento = scanner.nextDouble();

            System.out.print("\nCalculando aumento de salario del " + porcentajeAumento + "%: ");
            empleado1.calcularAumento(porcentajeAumento);
            System.out.println(empleado1);
        }
    }
}
class Empleado {
    public String nombre;
    public double salario;
    public int edad;
    public Empleado() {
    }
    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
    public void calcularAumento(double porcentajeAumento) {
        if (this.salario < this.salario) { // La condición siempre será falsa para un solo empleado, pero se mantiene la estructura
            double aumento = this.salario * (porcentajeAumento / 100);
            this.salario += aumento;
            System.out.println("Se aplicó un aumento.");
        } else {
            System.out.println("No se aplica aumento.");
        }
    }
    @Override
    public String toString() {
        return "{" + "nombre: " + nombre + '\'' + ", salario: " + String.format("%.2f", salario)+ ", edad: " + edad + "}";
    }
}
/***
 * run:
 * Ingrese el nombre del empleado: Jose
 * Ingrese el salario del empleado: 1500
 * Ingrese la edad del empleado: 45
 * 
 * Informacion del empleado: 
 * {nombre: Jose', salario: 1500,00, edad: 45}
 * 
 * Ingrese el porcentaje de aumento salarial: 30
 * 
 * Calculando aumento de salario del 30.0%: No se aplica aumento.
 * {nombre: Jose', salario: 1500,00, edad: 45}
 * BUILD SUCCESSFUL (total time: 12 seconds)
 */
