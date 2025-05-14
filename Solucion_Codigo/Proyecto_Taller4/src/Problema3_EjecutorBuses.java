import java.util.Scanner;
public class Problema3_EjecutorBuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.print("Ingrese el grado del estudiante: ");
        String gradoEstudiante = sc.nextLine();
        System.out.print("Tiene permiso vigente? (si/no): ");
        String permisoRespuesta = sc.nextLine();
        boolean permisoVigente = permisoRespuesta.equalsIgnoreCase("si");
        System.out.print("Ingrese la ruta del estudiante: ");
        String rutaEstudiante = sc.nextLine();
        System.out.print("Ingrese la ruta del autobus: ");
        String rutaAutobus = sc.nextLine();
        Estudiante estudiante1 = new Estudiante(nombreEstudiante, gradoEstudiante, permisoVigente, rutaEstudiante);
        System.out.println("\nSimulando ingreso del estudiante:");
        verificarAcceso(estudiante1, rutaAutobus);
        System.out.println("\nResumen:");
        System.out.println("Total de estudiantes aceptados: " + (estudiante1.puedeSubir ? 1 : 0));
        System.out.println("Total de estudiantes rechazados: " + (estudiante1.puedeSubir ? 0 : 1));
    }
    public static void verificarAcceso(Estudiante estudiante, String rutaAutobus) {
        boolean permiso = false;
        if (estudiante.tienePermiso) {
            if (estudiante.ruta.equals(rutaAutobus)) {
                permiso = true;
            }
        }
        if (permiso) {
            System.out.println(estudiante.nombre + " tiene permiso para subir al autobus.");
            estudiante.puedeSubir = true;
        } else {
            System.out.println(estudiante.nombre + " NO tiene permiso para subir al autobus.");
            estudiante.puedeSubir = false;
        }
        System.out.println(estudiante);
    }
}
class Estudiante {
    public String nombre;
    public String grado;
    public boolean tienePermiso;
    public String ruta;
    public boolean puedeSubir;

    public Estudiante() {
    }
    public Estudiante(String nombre, String grado, boolean tienePermiso, String ruta) {
        this.nombre = nombre;
        this.grado = grado;
        this.tienePermiso = tienePermiso;
        this.ruta = ruta;
        this.puedeSubir = false;
    }
    @Override
    public String toString() {
        return "{" + "nombre: " + nombre + '\'' + ", grado: " + grado + '\'' + ", tienePermiso: " + tienePermiso + ", ruta: " + ruta + '\'' + ", puedeSubir: " + puedeSubir + "}";
    }
}
/***
 * run:
 * Ingrese el nombre del estudiante: Lucho
 * Ingrese el grado del estudiante: 5
 * Tiene permiso vigente? (si/no): si
 * Ingrese la ruta del estudiante: Paris
 * Ingrese la ruta del autobus: Mercadillo
 * 
 * Simulando ingreso del estudiante:
 * Lucho NO tiene permiso para subir al autobus.
 * {nombre: Lucho', grado: 5', tienePermiso: true, ruta: Paris', puedeSubir: false}
 * 
 * Resumen:
 * Total de estudiantes aceptados: 0
 * Total de estudiantes rechazados: 1
 * BUILD SUCCESSFUL (total time: 13 seconds)
 */