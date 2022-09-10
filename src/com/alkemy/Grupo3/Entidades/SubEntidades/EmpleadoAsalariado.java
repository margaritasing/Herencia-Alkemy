package com.alkemy.Grupo3.Entidades.SubEntidades;

import com.alkemy.Grupo3.Entidades.Empleado;

/*
EmpleadoAsalariado: cobra un salario fijo independientemente de sus ventas,
a no ser que sus ventas superen los $10.000, en tal caso, su salario aumenta un 20%
* */

public class EmpleadoAsalariado extends Empleado {

    private double salarioFijo = 1000.0;


    public EmpleadoAsalariado(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial) {
        super(nombre, apellido, edad, ventasBrutas,  numeroSeguroSocial);
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }


    @Override
    public double ingresos(){
        System.out.println("Salario para el empleado: ");
        System.out.println("Salario base: " + getSalarioFijo());
        System.out.println("Ventas: " + getVentasBrutas());
        if (getVentasBrutas() > 10000){
            tarifaComision = getSalarioFijo() * 0.2;
        }
        System.out.println("Tarifa de comisión: " + getTarifaComision());
        salario = getSalarioFijo() + getTarifaComision();
        return getSalario();
    }

    @Override
    public String toString() {
        return "Empleado Asalariado = " +
                "nombre: '" + getNombre() + '\'' +
                ", apellido: '" + getApellido() + '\'' +
                ", edad: " + getEdad() +", " +
                ", Numero Social: '" + getNumeroSeguroSocial() + '\'' + " "+
                "Salario a devengar: $"  + ingresos() +
                '.';
    }





}
