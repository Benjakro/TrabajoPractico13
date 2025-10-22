package com.mycompany.trabajopractico13;

import java.util.*;

public class TrabajoPractico13 {

    public static void main(String[] args) {
        
        System.out.println("Veteriaria Animalia!!");
        ArrayList<Animal> animales = new ArrayList<>();
        
        Dog perro = new Dog("Ernest", "Pastor Aleman", 6);
        Cat gato = new Cat("Lufo", "Siames",5);
        Bird pajaro = new Bird("Piolin", "Calandria", 2);
        Fish pez = new Fish("nemo", "pez payaso", 1);
        
        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);
        animales.add(pez);
        
        for(Animal a : animales){
            a.mostrarInfo();
            a.hacerSonido();
            System.out.println();
        }
        
        System.out.println(" Acciones Propias ");
        perro.correr();
        gato.aranar();
        pajaro.volar();
        pez.nadar();
    }
}
