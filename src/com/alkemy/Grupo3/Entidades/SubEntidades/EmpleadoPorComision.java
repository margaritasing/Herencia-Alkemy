package com.alkemy.Grupo3.Entidades.SubEntidades;

import com.alkemy.Grupo3.Entidades.Empleado;

/*
EmpleadoPorComision: cobra un salario en funcion la tarifaComision y sus ventas brutas
* */

public class EmpleadoPorComision extends Empleado {

    private double salario;


    public EmpleadoPorComision(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial) {
        super(nombre, apellido, edad, ventasBrutas, numeroSeguroSocial);
    }


    public double getSalario() {
        return salario;
    }

    @Override
    public double ingresos(){
        System.out.println("Salario para el empleado: ");
        tarifaComision = getVentasBrutas() * 0.1;
        System.out.println("Tarifa de Comision: " + getTarifaComision());
        double comisionVentas = getVentasBrutas() * 0.2;
        System.out.println("Comisión de ventas: " + comisionVentas);
        salario =  getTarifaComision() + comisionVentas;
        return getSalario();
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision = " +
                "nombre: '" + getNombre() + '\'' +
                ", apellido: '" + getApellido() + '\'' +
                ", edad: " + getEdad() +", " +
                ", Numero Social: '" + getNumeroSeguroSocial() + '\'' + " "+
                "Salario a devengar: $"  +ingresos() +
                '.';
    }
}
