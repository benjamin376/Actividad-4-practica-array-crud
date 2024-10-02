import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
    private ArrayList<Alumno> alumnos;
    private Scanner scanner;

    // Constructor que inicializa la lista de alumnos y el Scanner
    public Gimnasio() {
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para agregar un alumno
    public void agregarAlumno() {
        System.out.print("Ingrese el ID del alumno: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese el tipo de membresía: ");
        String tipoMembresia = scanner.nextLine();

        Alumno nuevoAlumno = new Alumno(id, nombre, edad, tipoMembresia);
        alumnos.add(nuevoAlumno);
        System.out.println("Alumno agregado exitosamente.");
    }

    // Método para mostrar los alumnos
    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }

    // Método para actualizar un alumno
    public void actualizarAlumno() {
        System.out.print("Ingrese el ID del alumno que desea actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                System.out.print("Ingrese el nuevo nombre del alumno: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la nueva edad del alumno: ");
                int edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                System.out.print("Ingrese el nuevo tipo de membresía: ");
                String tipoMembresia = scanner.nextLine();

                alumno.setNombre(nombre);
                alumno.setEdad(edad);
                alumno.setTipoMembresia(tipoMembresia);

                System.out.println("Alumno actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }

    // Método para eliminar un alumno
    public void eliminarAlumno() {
        System.out.print("Ingrese el ID del alumno que desea eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                alumnos.remove(alumno);
                System.out.println("Alumno eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
}