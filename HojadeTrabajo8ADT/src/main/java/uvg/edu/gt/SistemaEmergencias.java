package uvg.edu.gt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Clase principal que simula un sistema de atención de emergencias en un hospital.
 * Permite al usuario elegir entre dos implementaciones de Priority Queue para manejar la lista de pacientes.
 */
public class SistemaEmergencias {

    /**
     * Método principal donde se ejecuta el programa.
     * Permite al usuario seleccionar la implementación de Priority Queue a utilizar.
     * Lee la lista de pacientes desde un archivo y los maneja según la opción seleccionada.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la implementación de Priority Queue:");
        System.out.println("1. Implementación con VectorHeap");
        System.out.println("2. Implementación con Java Collection Framework");
        int opcion = scanner.nextInt();

        VectorHeap<Paciente> colaEmergenciasVector = null;
        PriorityQueue<Paciente> colaEmergenciasJava = null;

        if (opcion == 1) {
            colaEmergenciasVector = PriorityQueueFactory.VectorHeap();
        } else if (opcion == 2) {
            colaEmergenciasJava = PriorityQueueFactory.JavaPriorityQueue();
        } else {
            System.out.println("Opción inválida. Saliendo del programa.");
            System.exit(0);
        }

        try {
            File archivo = new File("pacientes.txt");
            Scanner fileScanner = new Scanner(archivo);
            while (fileScanner.hasNextLine()) {
                String linea = fileScanner.nextLine();
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String sintoma = partes[1].trim();
                    char codigoEmergencia = partes[2].trim().charAt(0);
                    Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                    if (opcion == 1) {
                        colaEmergenciasVector.agregar(paciente);
                    } else if (opcion == 2) {
                        colaEmergenciasJava.offer(paciente);
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

        // Atender pacientes en orden de prioridad
        if (opcion == 1) {
            while (!colaEmergenciasVector.estaVacio()) {
                Paciente siguientePaciente = colaEmergenciasVector.atenderSiguiente();
                System.out.println("Atendiendo a: " + siguientePaciente.getNombre() + " - Síntoma: " + siguientePaciente.getSintoma() + " - Prioridad: " + siguientePaciente.getCodigoEmergencia());
            }
        } else if (opcion == 2) {
            while (!colaEmergenciasJava.isEmpty()) {
                Paciente siguientePaciente = colaEmergenciasJava.poll();
                System.out.println("Atendiendo a: " + siguientePaciente.getNombre() + " - Síntoma: " + siguientePaciente.getSintoma() + " - Prioridad: " + siguientePaciente.getCodigoEmergencia());
            }
        }

        scanner.close();
    }
}
