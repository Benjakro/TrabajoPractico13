
package com.mycompany.trabajopractico13;

public class Fish extends Animal {
    
    private String raza;
    
    public Fish(String nombre, String raza, int edad){
        super(nombre, edad);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " hace burbujas en el agua");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("raza " + raza);
    }
    
    public void nadar(){
        System.out.println("El pez nada");
    }
}
