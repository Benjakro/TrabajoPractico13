
package com.mycompany.trabajopractico13;

public class Animal {
    private String nombre;
    private int edad;
    
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
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
    
    //Metodos
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void mostrarInfo(){
        System.out.println("\n Nombre: " + getNombre() +
                           "\n Edad: " + getEdad());
    }
}


