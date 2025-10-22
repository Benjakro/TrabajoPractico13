package com.mycompany.trabajopractico13;

public class Dog extends Animal{
    
    private String raza;
    
    public Dog(String nombre, String raza, int edad){
        super(nombre, edad);
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " dice: guau guau!");
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Raza " + raza);
    }
    
    public void correr(){
        System.out.println("El perro corre");
    }
}
