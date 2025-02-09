public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Arturo", "Castañeda", 29);

        persona1.setEdad(30);
        persona1.setNombre("Nestor");
        persona1.setApellido("Castañeda");

        System.out.println(persona1.getNombre());

        System.out.println(persona1.darSaludo("Arturo") +  "me llamo: " + persona1.getNombre() + " "
         + persona1.getApellido() + " y mi edad es: " + persona1.getEdad());
    }
}
