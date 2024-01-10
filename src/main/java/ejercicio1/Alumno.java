package ejercicio1;

public class Alumno extends Persona {

    private int NIA;
    private Grado curso;

    public Alumno(String DNI, String nombre, String apellidos, int edad, int NIA, Grado curso) {
        super(DNI, nombre, apellidos, edad);
        this.NIA = NIA;
        this.curso = curso;
    }

    public Alumno(String DNI, String nombre, String apellidos, int edad, Grado curso) {
        super(DNI, nombre, apellidos, edad);
        NIA = generarNIA();
        this.curso = curso;
    }

    private int generarNIA() { return (int)(Math.random() * 100000000); }

    @Override
    public void printDNI(){
        System.out.println("Desde Alumno imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString() + " Alumno de " + curso + " NIA: " + NIA;
    }
}
