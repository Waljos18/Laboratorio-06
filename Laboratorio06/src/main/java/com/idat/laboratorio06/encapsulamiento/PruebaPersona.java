/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio06.encapsulamiento;

/**
 *
 * @author IDAT
 */
public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan Carlos");
        System.out.println();
        persona.name = "Nombre Modificado";
        
        persona.setName("Nombre modificado");
    }
}
