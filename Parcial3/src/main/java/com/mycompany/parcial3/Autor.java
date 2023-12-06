/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial3;

import java.util.List;

/**
 *
 * @author JHON
 */
public class Autor {
    public String nombre;
    public String nacionalidad;
    public String fechaNac;
    public List<Libro> libroRef;

    public Autor(String nombre, String nacionalidad, String fechaNac, List<Libro> libroRef) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNac = fechaNac;
        this.libroRef = libroRef;
    }
    
    
}
