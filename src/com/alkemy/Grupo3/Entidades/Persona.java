package com.alkemy.Grupo3.Entidades;

import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoAsalariado;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoBaseMasComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorHoras;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {

    protected  String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public  void presentarse(){
        System.out.println("Hola" + " " + getNombre() +" " + getApellido() );

    }

    public boolean esMayorDeEdad(){
  	    return edad >= 18;
    }


}
