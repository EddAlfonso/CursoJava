package com.cursoIntro;

public class Encapsulamiento {
    public static void main(String[] args) {

        // 4. Crear objeto Persona
        Persona persona1 = new Persona();

        //5. Dar valores y mostrarlos
        persona1.setNombre("Edgar");
        persona1.setEdad(28);
        persona1.setTelefono(1122339900);

        System.out.println("Nombre:" + persona1.getNombre() + " Edad:" + persona1.getEdad() + " Telefono:" + persona1.getTelefono());
    }
}
// 1. Crear clase Persona
class Persona{
    //2. Variables
    private int edad;
    private String nombre;
    private long telefono;

    //3. Getters and setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
