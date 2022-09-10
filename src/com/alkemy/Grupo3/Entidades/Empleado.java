package com.alkemy.Grupo3.Entidades;

public class Empleado  extends Persona{

    protected  double ventasBrutas;
    protected  double tarifaComision;
    protected  String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, int edad, double ventasBrutas, double tarifaComision, String numeroSeguroSocial) {
        super(nombre, apellido, edad);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public Empleado(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial) {
        super(nombre, apellido, edad);
        this.ventasBrutas = ventasBrutas;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }



    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double ingresos(){
  	     return 0;
     }




    @Override
    public String toString() {
        return "Empleado{" +
                "ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                ", numeroSeguroSocial='" + numeroSeguroSocial + '\'' +
                '}';
    }
}
