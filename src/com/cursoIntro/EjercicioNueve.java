package com.cursoIntro;

public class EjercicioNueve {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(21, "Rocio", "2233556677", 150000);
        Trabajador trabajador1 = new Trabajador(22, "Joaquin", "5577889966", 15000);

        System.out.println(cliente1.toString());
        System.out.println(trabajador1.toString());
    }

}

class Person {

    private int edad;
    private String nombre;
    private String telefono;


    public Person(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String toString() {
        return "Nombre:" + this.nombre + " Edad:" + this.edad + " Telefono:" + this.telefono;
    }
}

class Cliente extends Person{
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String toString() {
        return "Nombre:" + this.getNombre() + " Edad:" + this.getEdad() + " Telefono:" + this.getTelefono() + " Credito:" + getCredito();
    }
}

class Trabajador extends Person {

    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return "Nombre:" + this.getNombre() + " Edad:" + this.getEdad() + " Telefono:" + this.getTelefono() + " Salario:" + getSalario();
    }
}
