package com.alkemy.Grupo3.Entidades;

import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoAsalariado;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoBaseMasComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorComision;
import com.alkemy.Grupo3.Entidades.SubEntidades.EmpleadoPorHoras;

import java.util.ArrayList;
import java.util.List;

public class Empleado  extends Persona{

    protected  double ventasBrutas;
    protected  double tarifaComision;
    protected  String numeroSeguroSocial;
    protected double salario;


    public Empleado(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial) {
        super(nombre, apellido, edad);
        this.ventasBrutas = ventasBrutas;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }


    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double ingresos(){
  	     return 0;
     }



    public String toString() {
        return "Empleado";
    }

    public static void empleadoMayorDeEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " no es mayor de edad");
        }
    }

    public static void empleadosList (){
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
