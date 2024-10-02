public class Alumno {
    private int id;
    private String nombre;
    private int edad;
    private String tipoMembresia;

    // Constructor
    public Alumno(int id, String nombre, int edad, String tipoMembresia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoMembresia = tipoMembresia;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    // Método toString para mostrar la información del alumno
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Membresía: " + tipoMembresia;
    }
}