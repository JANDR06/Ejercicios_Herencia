package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona blanca = new Persona("1A","Blanca","Romero Cano",45);
        Persona pepa = new Persona("1A","Blanca","Romero Cano",34);

        System.out.println(blanca);
        pepa.cumplirAnyos();
        System.out.println(pepa);
        System.out.println("Son iguales? " + blanca.equals(pepa));

    }
}
