
package com.mycompany.trabajopractico13;

public class Bird extends Animal {
    
    private String especie;
    
    public Bird(String nombre, String especie, int edad){
        super(nombre, edad);
        this.especie = especie;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: pio pio!");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("raza: " + especie);
    }
    
    public void volar(){
        System.out.println("El pajaro vuela");
    }
}
