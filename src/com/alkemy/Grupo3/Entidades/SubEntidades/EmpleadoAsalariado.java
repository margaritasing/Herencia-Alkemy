package com.alkemy.Grupo3.Entidades.SubEntidades;

import com.alkemy.Grupo3.Entidades.Empleado;

public class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, String apellido, int edad, double ventasBrutas, double tarifaComision, String numeroSeguroSocial) {
        super(nombre, apellido, edad, ventasBrutas, tarifaComision, numeroSeguroSocial);
    }
}
