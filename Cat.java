
package com.mycompany.trabajopractico13;

public class Cat extends Animal {
    
    private String raza;
    
    public Cat(String nombre, String raza, int edad){
        super(nombre, edad);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: Miau!!!!!");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("raza " + raza);
    }
    
    public void aranar(){
        System.out.println("El gato arania");
    }
}
