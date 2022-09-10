package com.alkemy.Grupo3;

import com.alkemy.Grupo3.Entidades.Persona;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Grupo 3!");
    }



    public static void empleadoMayorDeEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + "es mayor de edad");
        } else {
            System.out.println(p.getNombre() + "no es mayor de edad");
        }
    }
}
