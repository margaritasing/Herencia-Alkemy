package com.alkemy.Grupo3.Entidades.SubEntidades;

import com.alkemy.Grupo3.Entidades.Empleado;

/*
EmpleadoBaseMasComision: cumple las mismas regras que
empleadoPorComision pero este, ademas, cobra una base que
 debe ser definida al momento de su creacion
* */

public class EmpleadoBaseMasComision  extends Empleado {

    private double sueldoBase;
    private double salario;


    public EmpleadoBaseMasComision(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial, double sueldoBase) {
        super(nombre, apellido, edad, ventasBrutas, numeroSeguroSocial);
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
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
        System.out.println("Sueldo base: " + getSueldoBase());
        salario =  getTarifaComision() + getSueldoBase() + comisionVentas;
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
