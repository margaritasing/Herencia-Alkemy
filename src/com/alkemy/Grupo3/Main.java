package com.alkemy.Grupo3;

import com.alkemy.Grupo3.Entidades.Empleado;
import com.alkemy.Grupo3.Entidades.Persona;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoBaseMasComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorComision;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Grupo 3!");

        List<Empleado> empleados =  new ArrayList<>();
        empleados.add(new EmpleadoPorComision("Pepito", "Los Paloptes", 30, 2000.0, "jhg124"));

        Empleado empleado = new EmpleadoPorComision("Pepito", "De Los Palotes", 30, 2000.0, "jhg124");
        Empleado empleado1 = new EmpleadoBaseMasComision("Harry", "Potter", 18, 3000.0, "jhg124", 500);

        System.out.println("***********************************************");
        empleado.presentarse();
        empleadoMayorDeEdad(empleado);
        System.out.println(empleado);
        System.out.println("************************************************");
        empleado1.presentarse();
        empleadoMayorDeEdad(empleado1);
        System.out.println(empleado1);
        System.out.println("************************************************");








    }



    public static void empleadoMayorDeEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " no es mayor de edad");
        }
    }
}
