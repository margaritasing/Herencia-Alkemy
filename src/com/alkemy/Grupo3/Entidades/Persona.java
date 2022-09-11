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

    public static void empleadoMayorDeEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " no es mayor de edad");
        }
    }

    public static void empleados (){
        List<Empleado> empleados =  new ArrayList<>();
        empleados.add(new EmpleadoPorComision("Pepito", "Los Paloptes", 30, 2000.0, "jhg124"));
        empleados.add(new EmpleadoBaseMasComision("Harry", "Potter", 18, 3000.0, "jhg124", 500));
        empleados.add(new EmpleadoAsalariado("Homer", "Simpson", 39, 11000.0, "jhg124"));
        empleados.add(new EmpleadoPorHoras("Jack", "Parrow", 49, 11000.0, "jhg124", 30,180.0));

        for (Empleado empleado: empleados){
            System.out.println("***************************************************************************************");
            empleado.presentarse();
            empleadoMayorDeEdad(empleado);
            System.out.println("***************************************************************************************");
            System.out.println(empleado);

        }

    }
}
