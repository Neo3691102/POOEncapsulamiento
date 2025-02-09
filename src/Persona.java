public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;

    //CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad){
        this.nombre = getNombre();
        this.apellido = getApellido();
        this.edad = getEdad();
    }

    //METODOS O COMPORTAMIENTO
    public String darSaludo(String nombre){
        return "Hola " + nombre + " ¿Cómo estas? ";
    }

    public String nombreCompleto(String nombre, String apellido){
        return nombre + apellido;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
