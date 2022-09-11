package com.alkemy.Grupo3.Entidades.SubEntidades;

import com.alkemy.Grupo3.Entidades.Empleado;

/*
EmpleadoPorHoras: Independientemente de sus ventas, cobra un salario fijo
 por horas trabajados, a no ser que sus ventas superen los $10.000,
 en tal caso, su salario aumenta un 20%
* */

public class EmpleadoPorHoras extends Empleado {

    private double cantidadHoras;
    private  double precioHora;



    public EmpleadoPorHoras(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial, double cantidadHoras, double precioHora) {
        super(nombre, apellido, edad, ventasBrutas, numeroSeguroSocial);
        this.cantidadHoras = cantidadHoras;
        this.precioHora = precioHora;
    }

    public double getCantidadHoras() {
        return cantidadHoras;
    }



    public double getPrecioHora() {
        return precioHora;
    }

    @Override
    public double ingresos(){
        System.out.println("Salario para el empleado: ");
        System.out.println("Ventas: " + getVentasBrutas());
        setSalario(getCantidadHoras() * getPrecioHora());
        System.out.println("Salario: " + getSalario());
        if (getVentasBrutas() > 10000){
           setTarifaComision(getSalario() * 0.2);
        }
        System.out.println("Tarifa de comision: " + getTarifaComision());
        setSalario(getTarifaComision() + getSalario());
        return getSalario();
    }

    @Override
    public String toString() {
        return "Empleado Por Hora = " +
                "nombre: '" + getNombre() + '\'' +
                ", apellido: '" + getApellido() + '\'' +
                ", edad: " + getEdad() +", " +
                ", Numero Social: '" + getNumeroSeguroSocial() + '\'' + " "+
                "Salario a devengar: $"  +ingresos() +
                '.';
    }

}
