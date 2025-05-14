import java.util.Scanner;
public class Problema4_ParqueDiversiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del visitante: ");
        String nombreVisitante = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        int edadVisitante = scanner.nextInt();

        System.out.print("Ingrese la altura del visitante (en metros, ejemplo: 1,50): ");
        double alturaVisitante = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        System.out.print("Ingrese el nombre del juego al que desea ingresar: ");
        String juegoDeseado = scanner.nextLine();

        Visitante visitante1 = new Visitante(nombreVisitante, edadVisitante, alturaVisitante);

        System.out.println("\nVerificando acceso al juego " + juegoDeseado + ":");
        verificarAccesoJuego(visitante1, juegoDeseado);

        scanner.close();
    }

    public static void verificarAccesoJuego(Visitante visitante, String juego) {
        boolean cumpleRequisitos = false;

        if (juego.equalsIgnoreCase("Montaña Rusa")) {
            if (visitante.edad >= 10 && visitante.altura >= 1.30) {
                cumpleRequisitos = true;
            }
        } else if (juego.equalsIgnoreCase("Carrusel")) {
            if (visitante.edad >= 4) {
                cumpleRequisitos = true;
            }
        } else if (juego.equalsIgnoreCase("Rueda de la Fortuna")) {
            if (visitante.altura >= 1.20) {
                cumpleRequisitos = true;
            }
        } else {
            System.out.println("El juego " + juego + " no está registrado.");
        }

        if (cumpleRequisitos) {
            System.out.println(visitante.nombre + " cumple con los requisitos para ingresar a " + juego + ".");
            visitante.puedeAcceder = true;
        } else {
            System.out.println(visitante.nombre + " NO cumple con los requisitos para ingresar a " + juego + ".");
            visitante.puedeAcceder = false;
        }
        System.out.println(visitante);
    }
}
class Visitante {
    public String nombre;
    public int edad;
    public double altura;
    public boolean puedeAcceder;

    public Visitante() {
    }

    public Visitante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.puedeAcceder = false; // Inicialmente no puede acceder
    }
    @Override
    public String toString() {
        return "Visitante{" +
                "nombre: " + nombre + '\'' + ", edad: " + edad + ", altura: " + String.format("%.2f", altura) + ", puedeAcceder: " + puedeAcceder +"}";
    }
}
/***
 * run:
 * Ingrese el nombre del visitante: Manuel
 * Ingrese la edad del visitante: 22
 * Ingrese la altura del visitante (en metros, ejemplo: 1,50): 1,75
 * Ingrese el nombre del juego al que desea ingresar: Carrusel
 * 
 * Verificando acceso al juego Carrusel:
 * Manuel cumple con los requisitos para ingresar a Carrusel.
 * Visitante{nombre: Manuel, edad: 22, altura: 1,75, puedeAcceder: true}
 * BUILD SUCCESSFUL (total time: 19 seconds)
 */