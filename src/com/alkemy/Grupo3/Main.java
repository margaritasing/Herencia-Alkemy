package com.alkemy.Grupo3;

import com.alkemy.Grupo3.Entidades.Empleado;
import com.alkemy.Grupo3.Entidades.Persona;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoAsalariado;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoBaseMasComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorHoras;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Grupo 3!");

        List<Empleado> empleados =  new ArrayList<>();
        empleados.add(new EmpleadoPorComision("Pepito", "Los Paloptes", 30, 2000.0, "jhg124"));
        empleados.add(new EmpleadoBaseMasComision("Harry", "Potter", 18, 3000.0, "jhg124", 500));
        empleados.add(new EmpleadoAsalariado("Homer", "Simpson", 39, 11000.0, "jhg124"));
        empleados.add(new EmpleadoPorHoras("Jack", "Parrow", 49, 11000.0, "jhg124", 40,180.0));


        for (Empleado empleado: empleados){
            System.out.println("***************************************************************************************");
            empleado.presentarse();
            empleadoMayorDeEdad(empleado);
            System.out.println("***************************************************************************************");
            System.out.println(empleado);

        }
      /*  Empleado empleado = new EmpleadoPorComision("Pepito", "De Los Palotes", 30, 2000.0, "jhg124");
        Empleado empleado1 = new EmpleadoBaseMasComision("Harry", "Potter", 18, 3000.0, "jhg124", 500);
        Empleado empleado2 = new EmpleadoAsalariado("Homer", "Simpson", 39, 11000.0, "jhg124");
        Empleado empleado3 = new EmpleadoPorHoras("Jack", "Parrow", 49, 11000.0, "jhg124", 40,180.0);
        System.out.println("***********************************************");
        empleado.presentarse();
        empleadoMayorDeEdad(empleado);
        System.out.println(empleado);
        System.out.println("************************************************");
        empleado1.presentarse();
        empleadoMayorDeEdad(empleado1);
        System.out.println(empleado1);
        System.out.println("************************************************");
        empleado2.presentarse();
        empleadoMayorDeEdad(empleado2);
        System.out.println(empleado2);
        System.out.println("************************************************");
        empleado3.presentarse();
        empleadoMayorDeEdad(empleado3);
        System.out.println(empleado3);
        System.out.println("************************************************");*/








    }



    public static void empleadoMayorDeEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " no es mayor de edad");
        }
    }
}
