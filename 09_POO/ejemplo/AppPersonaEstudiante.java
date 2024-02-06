public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona persona = new Persona("Iago", 30, "45738285F");
    Estudiante estudiante = new Estudiante("Paula", 22, "54372858F");
    Profesor profesor = new Profesor("Jose", 10, "535536636F", "Informatica", 2000.0);
     System.out.println("\nInformación de la persona: ");
     System.out.println(estudiante.toString());
     System.out.println("\n\nInformación del estudiante");
     System.out.println(persona.toString());
     profesor.mostrarDatos();
  }
}
